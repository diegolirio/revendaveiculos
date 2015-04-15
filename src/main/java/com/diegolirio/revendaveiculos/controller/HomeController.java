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
		this.getMarcaOuCria("Ferrari");

		Marca pegeout = this.getMarcaOuCria("Pegeout");
		Cor cor = this.getCorOuCria("Branco");
		Loja matriz = getLojaOuCria("Matriz");

		ModeloBuilder mb = new ModeloBuilder();
		Modelo modelo = mb
				.comDescricao("308")
				.comMarca(pegeout)
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
				.comLoja(matriz)
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
		vo2.setOpcional(dh);
		vo2.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo2);		
		// TODO: retirar
		VeiculoOpcional vo3 = new VeiculoOpcional();
		vo3.setOpcional(ve);
		vo3.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo3);
		// TODO: retirar
		VeiculoOpcional vo4 = new VeiculoOpcional();
		vo4.setOpcional(te);
		vo4.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo4);		
		// TODO: retirar
		VeiculoOpcional vo5 = new VeiculoOpcional();
		vo5.setOpcional(air);
		vo5.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo5);
		// TODO: retirar
		VeiculoOpcional vo6 = new VeiculoOpcional();
		vo6.setOpcional(alarme);
		vo6.setVeiculo(veiculo);
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
		
		this.criarGol2014();
		
		
		UsuarioBuilder ub = new UsuarioBuilder();
		Usuario usuario = ub
				.comNome("Diego Lirio Damacena Pereira")
				.comEmail("diegolirio.dl@gmail.com")
				.comSenha("123456")
				.getInstance();
		this.usuarioService.save(usuario);
		
		return "redirect:/";
	}

	private void criarGol2014() {
		Marca volks = this.getMarcaOuCria("Volksvagem");
		
		Cor azul = this.getCorOuCria("Azul");
		
		Loja matriz = getLojaOuCria("Matriz");
		
		ModeloBuilder mb = new ModeloBuilder();
		Modelo gol = mb
				.comDescricao("Gol")
				.comMarca(volks)
				.getInstance();
		this.modeloService.save(gol);
		
		VersaoBuilder versaoBuilder = new VersaoBuilder();
		Versao versao = versaoBuilder
				.comDescricao("TEC")
				.comMotor(1.0f)
				.comModelo(gol)
				.comAnoFabricacao(2013)
				.comAnoModelo(2014)
				.comQuantidadePortas(4)
				.getInstance();
		this.versaoService.save(versao);
		
		List<Foto> fotos = new ArrayList<Foto>();
		
		
		VeiculoBuilder vb = new VeiculoBuilder();
		Veiculo veiculo = vb
				.comCor(azul)
				.comKm(46218.0d)
				.comLoja(matriz)
				.comVersao(versao)
				.comUrlFotoPrincipal("/revendaveiculos/static/images/veiculos/gol_1_35316517_1.jpg")
				.comFotos(fotos)
				.getInstance();
		this.veiculoService.save(veiculo);
		
		Opcional arCondicionado = getOpcionalOuCria("Ar Condicionado");
		Opcional alarme = getOpcionalOuCria("Alarme");
		
		// TODO: retirar
		VeiculoOpcional vo = new VeiculoOpcional();
		vo.setOpcional(arCondicionado);
		vo.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo);
		// TODO: retirar
		VeiculoOpcional vo6 = new VeiculoOpcional();
		vo6.setOpcional(alarme);
		vo6.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo6);
		
		FotoBuilder fb = new FotoBuilder();
		Foto f1 = fb
				.comPrincipal(true)
				.comUri("/revendaveiculos/static/images/veiculos/gol_1_35316517_1.jpg")
				.comVeiculo(veiculo)
				.build();
		this.fotoService.save(f1);

		Foto f2 = fb
				.comPrincipal(false)
				.comUri("/revendaveiculos/static/images/veiculos/gol_2_35316519_1.jpg")
				.comVeiculo(veiculo)
				.build();
		this.fotoService.save(f2);

		Foto f3 = fb
				.comPrincipal(false)
				.comUri("/revendaveiculos/static/images/veiculos/gol_3_35316520_1.jpg")
				.comVeiculo(veiculo)
				.build();
		this.fotoService.save(f3);

		Foto f4 = fb
				.comPrincipal(false)
				.comUri("/revendaveiculos/static/images/veiculos/gol_4_35316521_1.jpg")
				.comVeiculo(veiculo)
				.build();
		this.fotoService.save(f4);

		Foto f5 = fb
				.comPrincipal(false)
				.comUri("/revendaveiculos/static/images/veiculos/gol_5_35316522_1.jpg")
				.comVeiculo(veiculo)
				.build();
		this.fotoService.save(f5);
		
		Foto f6 = fb
				.comPrincipal(false)
				.comUri("/revendaveiculos/static/images/veiculos/gol_6_35316524_1.jpg")
				.comVeiculo(veiculo)
				.build();
		this.fotoService.save(f6);
		
		Foto f7 = fb
				.comPrincipal(false)
				.comUri("/revendaveiculos/static/images/veiculos/gol_7_35316525_1.jpg")
				.comVeiculo(veiculo)
				.build();
		this.fotoService.save(f7);
		
		Foto f8 = fb
				.comPrincipal(false)
				.comUri("/revendaveiculos/static/images/veiculos/gol_8_35316526_1.jpg")
				.comVeiculo(veiculo)
				.build();
		this.fotoService.save(f8);
		
	}

	private Cor getCorOuCria(String descricao) {
		Cor cor = this.corService.getPorDescricao(descricao);
		CorBuilder cb = new CorBuilder();
		cor = cb.comDescricao(descricao).getInstance();
		this.corService.save(cor);
		return cor;
	}

	private Marca getMarcaOuCria(String descricao) {
		Marca marca = this.marcaService.getPorDescricao(descricao);
		if(marca == null) {
			MarcaBuilder volksBuilder = new MarcaBuilder();
			marca = volksBuilder.comDescricao(descricao)
			    				.comUrlImage("/revendaveiculos/static/images/veiculos/34266268_1.jpeg")
								.build();
			this.marcaService.save(marca);
		}
		return marca;
	}

	private Opcional getOpcionalOuCria(String descricao) {
		Opcional opcional = this.opcionalService.getPorDescricao(descricao);
		if(opcional == null) {
			OpcionalBuilder ob = new OpcionalBuilder();
			opcional = ob.comDescricao(descricao).build();
			this.opcionalService.save(opcional);
		}
		return opcional;
	}

	private Loja getLojaOuCria(String descricao) {
		Loja loja = this.lojaService.getPorDescricao(descricao);
		if(loja == null) {
			LojaBuilder lb = new LojaBuilder();
			loja = lb.comDescricao(descricao).getInstance();
			this.lojaService.save(loja);
		}
		return loja;
	}
	
	
}
