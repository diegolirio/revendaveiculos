package com.diegolirio.revendaveiculos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.builder.FotoBuilder;
import com.diegolirio.revendaveiculos.builder.MarcaBuilder;
import com.diegolirio.revendaveiculos.builder.ModeloBuilder;
import com.diegolirio.revendaveiculos.builder.OpcionalBuilder;
import com.diegolirio.revendaveiculos.builder.UsuarioBuilder;
import com.diegolirio.revendaveiculos.builder.VeiculoBuilder;
import com.diegolirio.revendaveiculos.builder.VersaoBuilder;
import com.diegolirio.revendaveiculos.model.Cambio;
import com.diegolirio.revendaveiculos.model.Categoria;
import com.diegolirio.revendaveiculos.model.Combustivel;
import com.diegolirio.revendaveiculos.model.Cor;
import com.diegolirio.revendaveiculos.model.Foto;
import com.diegolirio.revendaveiculos.model.Loja;
import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Opcional;
import com.diegolirio.revendaveiculos.model.Subcategoria;
import com.diegolirio.revendaveiculos.model.Usuario;
import com.diegolirio.revendaveiculos.model.Veiculo;
import com.diegolirio.revendaveiculos.model.VeiculoOpcional;
import com.diegolirio.revendaveiculos.model.Versao;
import com.diegolirio.revendaveiculos.service.CambioService;
import com.diegolirio.revendaveiculos.service.CombustivelService;
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
import com.diegolirio.revendaveiculos.service._CriarBaseService;

@Controller
public class HomeController {
	
	private static final String BRANCO = "Branco";

	@Autowired
	private _CriarBaseService criarBaseService;
	
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

	@Autowired
	private CambioService cambioService;

	@Autowired
	private CombustivelService combustivelService;
	
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
	
	@RequestMapping(value = "/criar_base", method = RequestMethod.GET)
	public String createInitCadastro() {
		
		// se nao existe Ferrari 
		this.getMarcaOuCria("Ferrari");

		this.criarPegeout3082014();
		
		this.criarEcoSport2014();
		
		this.criarLandRoverRangeRover2015();
		
		this.criarGol2014();
		
		// New Civic
		// http://www.ebseventos.com.br/wp-content/ccslider-upload/FOTO%20143-700x400.jpg
		
		// Renault
		// http://s3.amazonaws.com/bundlr-app-production/content_images/images/large/519cbe3d6a19e30002001b8f/Renault-Captur-live-premiere-at-2013-Geneva-Motor-Show-02.jpg?1369226815
		
		
		UsuarioBuilder ub = new UsuarioBuilder();
		Usuario usuario = ub
				.comNome("Diego Lirio Damacena Pereira")
				.comEmail("diegolirio.dl@gmail.com")
				.comSenha("123456")
				.getInstance();
		this.usuarioService.save(usuario);
		
		return "redirect:/";
	}

	private void criarPegeout3082014() {
		
		Marca pegeout = this.getMarcaOuCria("Pegeout");
		Cor cor = this.criarBaseService.getCorOuCria("Preto");
		Loja matriz = this.criarBaseService.getLojaOuCria("Matriz");

		ModeloBuilder mb = new ModeloBuilder();
		Modelo modelo = mb
				.comDescricao("308")
				.comMarca(pegeout)
				.build();
		this.modeloService.save(modelo);

		Combustivel flex = this.getCombustivelOuCria("Flex");
		
		VersaoBuilder versaoBuilder = new VersaoBuilder();
		
		Cambio cambio = this.getCambioOuCria("Automatico");
		
		Versao versao = versaoBuilder
				.comDescricao("Quiksilver")
				.comMotor(1.8f)
				.comModelo(modelo)
				.comAnoFabricacao(2015)
				.comAnoModelo(2015)
				.comCombustivel(flex)
				.comCambio(cambio)
				.build();
		this.versaoService.save(versao);
		
		List<Foto> fotos = new ArrayList<Foto>();
		
		VeiculoBuilder vb = new VeiculoBuilder();
		Veiculo veiculo = vb
				.comCor(cor)
				.comKm(0d)
				.comLoja(matriz)
				.comVersao(versao)
				.comUrlFotoPrincipal("http://mlb-s1-p.mlstatic.com/peugeot-308-allure-20-flex-2014-automatico-teto-novissimo-581401-MLB8669941040_062015-O.jpg")
				.comFotos(fotos)
				.comValor(72990.90)
				.comObservacao("Zero KM pronta entrega!!!")
				.getInstance();
		this.veiculoService.save(veiculo);
		
		Opcional ar = this.getOpcionalOuCria("Ar Condicionado");
		Opcional dh = this.getOpcionalOuCria("Direcao Hidraulica");
		// TODO Opcional dh = this.getOpcionalOuCria("Dire��o Hidraulica");
		Opcional ve = this.getOpcionalOuCria("Vidro Eletrico");
		//Opcional ve = this.getOpcionalOuCria("Vidro El�trico");
		Opcional te = this.getOpcionalOuCria("Trava Eletrica");
		//Opcional te = this.getOpcionalOuCria("Trava El�trica");
		Opcional air = this.getOpcionalOuCria("Air Bag");
		Opcional alarme = this.getOpcionalOuCria("Alarme");
		
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
	}

	private void criarEcoSport2014() {
		Marca ford = this.getMarcaOuCria("Ford");
		
		ModeloBuilder mb = new ModeloBuilder();
		Modelo ecosport = mb
				.comDescricao("Ecosport")
				.comMarca(ford)
				.build();
		this.modeloService.save(ecosport);		
		
		VersaoBuilder versaoBuilder = new VersaoBuilder();
		
		Cambio manual = this.getCambioOuCria("Manual");
		
		Combustivel flex = this.getCombustivelOuCria("Flex");
		
		Versao versao = versaoBuilder
				.comDescricao("Freestyle 16V")
				.comMotor(1.6f)
				.comModelo(ecosport)
				.comAnoFabricacao(2014)
				.comAnoModelo(2014)
				.comQuantidadePortas(4)
				.comCambio(manual)
				.comCombustivel(flex)
				.build();
		this.versaoService.save(versao);		
		
		Cor vermelho = this.criarBaseService.getCorOuCria(BRANCO);
		Loja matriz = this.criarBaseService.getLojaOuCria("Matriz");
		
		List<Foto> fotos = new ArrayList<Foto>();		
		
		VeiculoBuilder vb = new VeiculoBuilder();
		Veiculo veiculo = vb
				.comCor(vermelho)
				.comKm(10500.0d)
				.comLoja(matriz)
				.comVersao(versao)
				.comUrlFotoPrincipal("dourado-img-seminovos/37241888_1.jpg")
				.comFotos(fotos)
				.comValor(57000.99d)
				.comObservacao("Seminovo somente 10 mil KM rodado, 2014, BLINDADO NIII-A EB BLINDADOS, PRONTA ENTREGA!!!! VERSAO COM GPS, BANCOS EM COURO. ACEITAMOS VEICULOS NA TROCA COM OTIMA AVALIACAO!!! FINANCIAMOS COM OTIMAS TAXAS !!! CONSULTE OUTROS MODELOS E VERSOES.")				
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
	}
	
	private void criarLandRoverRangeRover2015() {
		Marca land = this.getMarcaOuCria("Land Rover");
		
		ModeloBuilder mb = new ModeloBuilder();
		Modelo range = mb
				.comDescricao("Range Rover Evoque")
				.comMarca(land)
				.build();
		this.modeloService.save(range);		
		
		VersaoBuilder versaoBuilder = new VersaoBuilder();
		
		Cambio automatico = this.getCambioOuCria("Automatico");
		
		Combustivel comb = this.getCombustivelOuCria("Gasolina");
		
		Versao versao = versaoBuilder
				.comDescricao("Si4 Coupe Pure Tech Pack")
				.comMotor(2.0f)
				.comModelo(range)
				.comAnoFabricacao(2015)
				.comAnoModelo(2015)
				.comQuantidadePortas(4)
				.comCambio(automatico)
				.comCombustivel(comb)
				.build();
		this.versaoService.save(versao);		
		
		Cor cor = this.criarBaseService.getCorOuCria("Dourado");
		Loja matriz = this.criarBaseService.getLojaOuCria("Matriz");
		
		List<Foto> fotos = new ArrayList<Foto>();		
		
		VeiculoBuilder vb = new VeiculoBuilder();
		Veiculo veiculo = vb
				.comCor(cor)
				.comKm(5000.0d)
				.comLoja(matriz)
				.comVersao(versao)
				.comUrlFotoPrincipal("dourado-img-seminovos/54943_1.jpg")
				.comFotos(fotos)
				.comValor(135000.90)
				.comObservacao("Somente 5 mil km rodado!")				
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
	}	
	
	private void criarGol2014() {
		
		Marca volks = criarBaseService.getMarcaOuCria(_CriarBaseService.VOLKSWAGEM);
		Categoria categoria = criarBaseService.getCategoriaOuCria(_CriarBaseService.HATCH);
		Subcategoria subcategoria = criarBaseService.getSubcategoriaOuCria(_CriarBaseService.POPULAR, categoria);
		Modelo gol = criarBaseService.getModeloOuCria(_CriarBaseService.VOLKSWAGEM_GOL, volks, subcategoria);
		Combustivel flex = criarBaseService.getCombustivelOuCria(_CriarBaseService.FLEX);
		Cambio automatico = criarBaseService.getCambioOuCria(_CriarBaseService.CAMBIO_AUTOMATICO);
		Versao tec1ponto02014 = criarBaseService.getVersaoOuCria("TEC", 1.0f, 2013, 2014, 4, gol, flex, automatico);
		
		List<Foto> fotos = new ArrayList<Foto>();
		
		Cor amarelo = this.criarBaseService.getCorOuCria(_CriarBaseService.AMARELO);		
		Loja matriz = this.criarBaseService.getLojaOuCria(_CriarBaseService.LOJA_MATRIZ);
		
		VeiculoBuilder vb = new VeiculoBuilder();
		Veiculo veiculo = vb
				.comCor(amarelo)
				.comKm(46218.0d)
				.comLoja(matriz)
				.comVersao(tec1ponto02014)
				.comUrlFotoPrincipal("http://carplace.uol.com.br/wp-content/uploads/2013/05/Novo_Gol_Rallye_2014_02-2.jpg")
				.comFotos(fotos)
				.comValor(32000.00)
				.comObservacao("GOL Seminovo abaixo da tabela, pegamos o seu na troca, venha conferir!")					
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
				.comUri("http://carplace.uol.com.br/wp-content/uploads/2013/05/Novo_Gol_Rallye_2014_02-2.jpg")
				.comVeiculo(veiculo)
				.build();
		this.fotoService.save(f1);
//
//		Foto f2 = fb
//				.comPrincipal(false)
//				.comUri("/revendaveiculos/static/images/veiculos/gol_2_35316519_1.jpg")
//				.comVeiculo(veiculo)
//				.build();
//		this.fotoService.save(f2);
//
//		Foto f3 = fb
//				.comPrincipal(false)
//				.comUri("/revendaveiculos/static/images/veiculos/gol_3_35316520_1.jpg")
//				.comVeiculo(veiculo)
//				.build();
//		this.fotoService.save(f3);
//
//		Foto f4 = fb
//				.comPrincipal(false)
//				.comUri("/revendaveiculos/static/images/veiculos/gol_4_35316521_1.jpg")
//				.comVeiculo(veiculo)
//				.build();
//		this.fotoService.save(f4);
//
//		Foto f5 = fb
//				.comPrincipal(false)
//				.comUri("/revendaveiculos/static/images/veiculos/gol_5_35316522_1.jpg")
//				.comVeiculo(veiculo)
//				.build();
//		this.fotoService.save(f5);
//		
//		Foto f6 = fb
//				.comPrincipal(false)
//				.comUri("/revendaveiculos/static/images/veiculos/gol_6_35316524_1.jpg")
//				.comVeiculo(veiculo)
//				.build();
//		this.fotoService.save(f6);
//		
//		Foto f7 = fb
//				.comPrincipal(false)
//				.comUri("/revendaveiculos/static/images/veiculos/gol_7_35316525_1.jpg")
//				.comVeiculo(veiculo)
//				.build();
//		this.fotoService.save(f7);
//		
//		Foto f8 = fb
//				.comPrincipal(false)
//				.comUri("/revendaveiculos/static/images/veiculos/gol_8_35316526_1.jpg")
//				.comVeiculo(veiculo)
//				.build();
//		this.fotoService.save(f8);
		
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
	
	private Cambio getCambioOuCria(String descricao) {
		Cambio cambio = this.cambioService.getPorDescricao(descricao);
		if(cambio == null) {
			cambio = new Cambio();
			cambio.setDescricao(descricao);
			this.cambioService.save(cambio);
		}
		return cambio;
	}	
	
	private Combustivel getCombustivelOuCria(String descricao) {
		Combustivel combustivel = this.combustivelService.getPorDescricao(descricao);
		if (combustivel == null) {
			combustivel = new Combustivel();
			combustivel.setDescricao(descricao);
			this.combustivelService.save(combustivel);
		}
		return combustivel;
	}	
	
}
