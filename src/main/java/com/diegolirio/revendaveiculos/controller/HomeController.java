package com.diegolirio.revendaveiculos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.revendaveiculos.builder.FotoBuilder;
import com.diegolirio.revendaveiculos.builder.VeiculoBuilder;
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
		this.criarBaseService.execute();
		return "redirect:/";
	}
	
	@RequestMapping(value="/criar_exemplo", method=RequestMethod.GET)
	public String criar_exemplo() {
		this.criarPegeout3082014();		
		this.criarEcoSport2014();		
		this.criarLandRoverRangeRover2015();		
		this.criarGol2014();		
		return "redirect:/";
	}

	private void criarPegeout3082014() {		
		Marca pegeout = this.criarBaseService.getMarcaOuCria(_CriarBaseService.PEGEOUT);		
		Categoria categoria = criarBaseService.getCategoriaOuCria(_CriarBaseService.HATCH);
		Subcategoria subcategoria = criarBaseService.getSubcategoriaOuCria(_CriarBaseService.HATCH_MEDIO, categoria);
		Modelo modelo = this.criarBaseService.getModeloOuCria(_CriarBaseService.PEGEOUT_308, pegeout, subcategoria);
		Combustivel flex = this.criarBaseService.getCombustivelOuCria(_CriarBaseService.FLEX);
		Cambio cambio = this.criarBaseService.getCambioOuCria(_CriarBaseService.CAMBIO_AUTOMATICO);
		Versao versao = this.criarBaseService.getVersaoOuCria(_CriarBaseService.PEGEOUT_308_QUIKSILVER, 1.8f, 2015, 2015, 4, modelo, flex, cambio);
		Cor cor = this.criarBaseService.getCorOuCria(_CriarBaseService.BRANCO);
		Loja matriz = this.criarBaseService.getLojaOuCria(_CriarBaseService.LOJA_MATRIZ);
		
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
		
		Opcional ar = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.AR_CONDICIONADO);
		Opcional dh = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.DIRECAO_HIDRAULICA); 
		Opcional ve = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.VIDRO_ELETRICO);
		Opcional te = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.TRAVA_ELETRICA);
		Opcional air = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.AIR_BAG);
		Opcional alarme = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.ALARME);
		
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
		Marca ford = this.criarBaseService.getMarcaOuCria(_CriarBaseService.FORD);
		Categoria suv = this.criarBaseService.getCategoriaOuCria(_CriarBaseService.SUV);
		Subcategoria miniSUV = this.criarBaseService.getSubcategoriaOuCria(_CriarBaseService.MINI_SUV, suv);
		Modelo fordEcosport = this.criarBaseService.getModeloOuCria(_CriarBaseService.FORD_ECOSPORT, ford, miniSUV);
		Cambio manual = this.criarBaseService.getCambioOuCria(_CriarBaseService.CAMBIO_MANUAL);		
		Combustivel flex = this.criarBaseService.getCombustivelOuCria(_CriarBaseService.FLEX);
		Versao fordEcosportFreestyle16V = this.criarBaseService.getVersaoOuCria(_CriarBaseService.FORD_ECOSPORT_FREESTYLE_16V, 1.6f, 2014, 2014, 4, fordEcosport, flex, manual);
		Cor vermelho = this.criarBaseService.getCorOuCria(BRANCO);
		Loja matriz = this.criarBaseService.getLojaOuCria(_CriarBaseService.LOJA_MATRIZ);
		
		List<Foto> fotos = new ArrayList<Foto>();		
		VeiculoBuilder vb = new VeiculoBuilder();
		Veiculo veiculo = vb
				.comCor(vermelho)
				.comKm(10500.0d)
				.comLoja(matriz)
				.comVersao(fordEcosportFreestyle16V)
				.comUrlFotoPrincipal("dourado-img-seminovos/37241888_1.jpg")
				.comFotos(fotos)
				.comValor(57000.99d)
				.comObservacao("Seminovo somente 10 mil KM rodado, 2014, BLINDADO NIII-A EB BLINDADOS, PRONTA ENTREGA!!!! VERSAO COM GPS, BANCOS EM COURO. ACEITAMOS VEICULOS NA TROCA COM OTIMA AVALIACAO!!! FINANCIAMOS COM OTIMAS TAXAS !!! CONSULTE OUTROS MODELOS E VERSOES.")				
				.getInstance();
		this.veiculoService.save(veiculo);		
		
		Opcional arCondicionado = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.AR_CONDICIONADO);
		Opcional alarme = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.ALARME);
		
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
		Marca landRover = this.criarBaseService.getMarcaOuCria(_CriarBaseService.LAND_ROVER);
		Categoria suv = this.criarBaseService.getCategoriaOuCria(_CriarBaseService.SUV);
		Subcategoria crossoverSUV = this.criarBaseService.getSubcategoriaOuCria(_CriarBaseService.CROSSOVER_SUV, suv);
		Modelo landRoverRangeRoverEvoque = this.criarBaseService.getModeloOuCria(_CriarBaseService.LAND_ROVER_RANGE_ROVER_EVOQUE, landRover, crossoverSUV);
		Cambio automatico = this.criarBaseService.getCambioOuCria(_CriarBaseService.CAMBIO_AUTOMATICO);		
		Combustivel gasolina = this.criarBaseService.getCombustivelOuCria(_CriarBaseService.GASOLINA);
		Versao versao = this.criarBaseService.getVersaoOuCria(_CriarBaseService.LAND_ROVER_RANGE_ROVER_EVOQUE_SI4_COUPE_PURE_TECH_PACK, 
															  2.0f, 2015, 2015, 4, landRoverRangeRoverEvoque, gasolina, automatico);				
		Cor cor = this.criarBaseService.getCorOuCria(_CriarBaseService.DOURADO);
		Loja matriz = this.criarBaseService.getLojaOuCria(_CriarBaseService.LOJA_MATRIZ);
		
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
		
		Opcional arCondicionado = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.AR_CONDICIONADO);
		Opcional alarme = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.ALARME);
		
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
		Versao tec1ponto02014 = criarBaseService.getVersaoOuCria(_CriarBaseService.VOLKSWAGEM_GOL_TEC, 1.0f, 2013, 2014, 4, gol, flex, automatico);
		
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
		
		Opcional arCondicionado = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.AR_CONDICIONADO);
		Opcional alarme = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.ALARME);
		
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

	
}
