package com.diegolirio.revendaveiculos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.builder.CorBuilder;
import com.diegolirio.revendaveiculos.builder.FotoBuilder;
import com.diegolirio.revendaveiculos.builder.LojaBuilder;
import com.diegolirio.revendaveiculos.builder.MarcaBuilder;
import com.diegolirio.revendaveiculos.builder.ModeloBuilder;
import com.diegolirio.revendaveiculos.builder.OpcionalBuilder;
import com.diegolirio.revendaveiculos.builder.UsuarioBuilder;
import com.diegolirio.revendaveiculos.builder.VeiculoBuilder;
import com.diegolirio.revendaveiculos.builder.VersaoBuilder;
import com.diegolirio.revendaveiculos.model.Cor;
import com.diegolirio.revendaveiculos.model.Foto;
import com.diegolirio.revendaveiculos.model.Loja;
import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Opcional;
import com.diegolirio.revendaveiculos.model.Usuario;
import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.model.VeiculoOpcional;
import com.diegolirio.revendaveiculos.model.Versao;
import com.diegolirio.revendaveiculos.service.CorService;
import com.diegolirio.revendaveiculos.service.FotoService;
import com.diegolirio.revendaveiculos.service.LojaService;
import com.diegolirio.revendaveiculos.service.MarcaService;
import com.diegolirio.revendaveiculos.service.ModeloService;
import com.diegolirio.revendaveiculos.service.OpcionalService;
import com.diegolirio.revendaveiculos.service.UsuarioService;
import com.diegolirio.revendaveiculos.service.VeiculoOpcionalService;
import com.diegolirio.revendaveiculos.service.VeiculoService;
import com.diegolirio.revendaveiculos.service.VersaoService;

@Controller
public class HomeController {
	
	@Autowired
	private MarcaService marcaService;

	@Autowired
	private CorService corService;

	@Autowired
	private LojaService lojaService;

	@Autowired
	private ModeloService modeloService;

	@Autowired
	private VersaoService versaoService;

	@Autowired
	private VeiculoService veiculoService;

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private FotoService fotoService;

	@Autowired
	private OpcionalService opcionalService;

	@Autowired
	private VeiculoOpcionalService veiculoOpcionalService;
	
	// nao utilizado
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		//return "redirect:/paginaInicial";
		return "index2";
	}

	@RequestMapping(value = "/paginaInicial", method = RequestMethod.GET)
	public String home() {
		// Busca veiculos somente da pagina Home
		return "home";
	}			
	
	@RequestMapping(value = "/criar_cadastro_inicial", method = RequestMethod.GET)
	public String createInitCadastro() {
		// se nao existe Ferrari 
		Marca ferrari = new Marca();
		ferrari.setDescricao("Ferrari");
		ferrari.setUrlImage("/revendaveiculos/static/images/marcas/ferrari.png");
		this.marcaService.save(ferrari); 

		MarcaBuilder marcaBuilder = new MarcaBuilder();
		Marca marca = marcaBuilder.comId(1l)
								  .comDescricao("Pegeout")
								  .comUrlImage("/revendaveiculos/static/images/veiculos/34266268_1.jpeg")
								  .getInstance();
		this.marcaService.save(marca);

		CorBuilder cb = new CorBuilder();
		Cor cor = cb.comDescricao("Branco").getInstance();
		this.corService.save(cor);
		
		LojaBuilder lb = new LojaBuilder();
		Loja loja = lb.comDescricao("Matriz").getInstance();
		this.lojaService.save(loja);

		ModeloBuilder mb = new ModeloBuilder();
		Modelo modelo = mb
				.comDescricao("308")
				.comMarca(marca)
				.getInstance();
		this.modeloService.save(modelo);
		
		VersaoBuilder versaoBuilder = new VersaoBuilder();
		Versao versao = versaoBuilder
				.comDescricao("Quiksilver")
				.comMotor(1.8f)
				.comModelo(modelo)
				.comAnoFabricacao(2015)
				.comAnoModelo(2015)
				.getInstance();
		this.versaoService.save(versao);
		
		List<Foto> fotos = new ArrayList<Foto>();
		
		
		VeiculoBuilder vb = new VeiculoBuilder();
		Veiculo veiculo = vb
				.comCor(cor)
				.comKm(0d)
				.comLoja(loja)
				.comVersao(versao)
				.comUrlFotoPrincipal("/revendaveiculos/static/images/veiculos/34266268_1.jpeg")
				.comFotos(fotos)
				.getInstance();
		this.veiculoService.save(veiculo);
		
		OpcionalBuilder ob = new OpcionalBuilder();
		Opcional ar = ob.comDescricao("Ar Condicionado").build();
		this.opcionalService.save(ar);

		Opcional dh = ob.comDescricao("Direção Hidraúlica").build();
		this.opcionalService.save(dh);

		Opcional ve = ob.comDescricao("Vidro Elétrico").build();
		this.opcionalService.save(ve);

		Opcional te = ob.comDescricao("Trava Elétrica").build();
		this.opcionalService.save(te);

		Opcional air = ob.comDescricao("Air Bag").build();
		this.opcionalService.save(air);

		Opcional alarme = ob.comDescricao("Alarme").build();
		this.opcionalService.save(alarme);
		
		
		// TODO: retirar
		VeiculoOpcional vo = new VeiculoOpcional();
		vo.setOpcional(ar);
		vo.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo);
		// TODO: retirar
		VeiculoOpcional vo2 = new VeiculoOpcional();
		vo.setOpcional(dh);
		vo.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo2);		
		// TODO: retirar
		VeiculoOpcional vo3 = new VeiculoOpcional();
		vo.setOpcional(ve);
		vo.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo3);
		// TODO: retirar
		VeiculoOpcional vo4 = new VeiculoOpcional();
		vo.setOpcional(te);
		vo.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo4);		
		// TODO: retirar
		VeiculoOpcional vo5 = new VeiculoOpcional();
		vo.setOpcional(air);
		vo.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo5);
		// TODO: retirar
		VeiculoOpcional vo6 = new VeiculoOpcional();
		vo.setOpcional(alarme);
		vo.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo6);
		
		FotoBuilder fb = new FotoBuilder();
		Foto f1 = fb
				.comPrincipal(true)
				.comUri("/revendaveiculos/static/images/veiculos/34266268_1.jpeg")
				.comVeiculo(veiculo)
				.build();
		
		this.fotoService.save(f1);

		Foto f2 = fb
				.comPrincipal(false)
				.comUri("/revendaveiculos/static/images/veiculos/34266269_1.jpeg")
				.comVeiculo(veiculo)
				.build();
		
		this.fotoService.save(f2);
		
		
		UsuarioBuilder ub = new UsuarioBuilder();
		Usuario usuario = ub
				.comNome("Diego Lirio Damacena Pereira")
				.comEmail("diegolirio.dl@gmail.com")
				.comSenha("123456")
				.getInstance();
		this.usuarioService.save(usuario);
		
		return "index";
	}
	
	
}
