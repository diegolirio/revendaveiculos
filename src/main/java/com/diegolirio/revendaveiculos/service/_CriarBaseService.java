package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.builder.CorBuilder;
import com.diegolirio.revendaveiculos.builder.LojaBuilder;
import com.diegolirio.revendaveiculos.builder.MarcaBuilder;
import com.diegolirio.revendaveiculos.builder.ModeloBuilder;
import com.diegolirio.revendaveiculos.builder.OpcionalBuilder;
import com.diegolirio.revendaveiculos.builder.VersaoBuilder;
import com.diegolirio.revendaveiculos.model.Cambio;
import com.diegolirio.revendaveiculos.model.Categoria;
import com.diegolirio.revendaveiculos.model.Combustivel;
import com.diegolirio.revendaveiculos.model.Cor;
import com.diegolirio.revendaveiculos.model.Loja;
import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Opcional;
import com.diegolirio.revendaveiculos.model.Subcategoria;
import com.diegolirio.revendaveiculos.model.Versao;

@Service("criarBaseService")
public class _CriarBaseService {

	@Autowired
	private CategoriaService categoriaService;
	@Autowired
	private MarcaService marcaService;
	@Autowired
	private SubcategoriaService subcategoriaService;
	@Autowired
	private ModeloService modeloService;
	@Autowired
	private CambioService cambioService;
	@Autowired
	private CombustivelService combustivelService;
	@Autowired
	private VersaoService versaoService;
	@Autowired
	private CorService corService;
	@Autowired
	private LojaService lojaService;
	@Autowired
	private OpcionalService opcionalService;
	
	// Marca
	public static final String FERRARI = "Ferrari";
	public static final String VOLKSWAGEM = "Volkswagem";
	public static final String CHEVROLET = "Chevrolet";
	public static final String FORD = "Ford";
	public static final String FIAT = "Fiat";
	public static final String AUDI = "Audi";
	public static final String PORSCHE = "Porsche";
	public static final String LEXUS = "Lexus";
	public static final String TOYOTA = "Toyota";
	public static final String HYUNDAI = "Hyundai";
	public static final String KIA = "Kia";
	public static final String NISSAN = "Nissan";
	public static final String ALFA_ROMEO = "Alfa Romeo";
	public static final String CHRYSLER = "Chrysler";
	public static final String DODGE = "Dodge";
	public static final String JEEP = "Jeep";
	public static final String CITROEN = "Citroen";
	public static final String PEGEOUT = "Pegeout";
	public static final String SUZUKI = "Suzuki";
	public static final String RENAULT = "Renault";
	public static final String HONDA = "Honda";
	public static final String BMW = "BMW";
	public static final String MERCEDES_BENZ =  "Mercedes-Benz";
	public static final String MITSUBISHI = "Mitsubishi";
	public static final String JAGUAR = "Jaguar";
	public static final String LAND_ROVER = "Land Rover";
	public static final String VOLVO = "Volvo";
	public static final String JAC = "JAC";
	
	// Categorias
	public static final String HATCH = "Hatch"; 
	public static final String SEDAN = "Sedan"; 
	public static final String SW = "SW";
	public static final String VAN = "Van";
	public static final String PICK_UP = "Pick-Up";
	public static final String SPORT = "Sport";
	public static final String SUV = "SUV";
	public static final String MOTO = "Moto";
	public static final String ONIBUS = "Onibus";
	public static final String CAMINHAO = "Caminhão";
	
	// Subcategorias
	public static final String POPULAR = "Popular"; 
	public static final String HATCH_PEQUENO = HATCH + " Pequeno"; 
	public static final String HATCH_MEDIO = HATCH + " Medio";
	public static final String HATCH_GRANDE = HATCH + " Grande";
	public static final String SEDAN_PEQUENO = SEDAN + " Pequeno";
	public static final String SEDAN_COMPACTO = SEDAN + " Compacto";
	public static final String SEDAN_MEDIO = SEDAN + " Medio";
	public static final String SEDAN_GRANDE = SEDAN + " Grande";
	public static final String SW_MEDIO = SW + " Medio";
	public static final String SW_GRANDE = SW + " Grande";
	public static final String MONOCAB = "Monocab";
	public static final String GRANDCAB = "Grandcab";
	public static final String PICK_UP_PEQUENO = PICK_UP + " Pequeno";
	public static final String PICK_UP_GRANDE = PICK_UP + " Grande";
	public static final String MINI_SUV = "Mini " + SUV;
	public static final String CROSSOVER_SUV = "Crossover " + SUV;

	// Modelos Volkswagem
	public static final String VOLKSWAGEM_GOL = "Gol";
	public static final String VOLKSWAGEM_UP = "Up";
	public static final String FORD_ECOSPORT = "Ecosport";	
	// Modelos pegeout 
	public static final String PEGEOUT_308 = "308";	
	// Modelos Land Rover
	public static final String LAND_ROVER_RANGE_ROVER_EVOQUE = "Range Rover Evoque";
	
	// Cambios
	public static final String CAMBIO_MANUAL = "Manual";
	public static final String CAMBIO_AUTOMATICO = "Automatico";
	
	//Combustivel
	public static final String GASOLINA = "Gasolina";
	public static final String ALCOOL = "Alcool";
	public static final String DIESEL = "Diesel";
	public static final String FLEX = "Flex";
	
	// Versoes
	public static final String FORD_ECOSPORT_FREESTYLE_16V = "Freestyle 16V";
	public static final String VOLKSWAGEM_GOL_TEC = "TEC";
	public static final String PEGEOUT_308_QUIKSILVER = "Freestyle 16V";
	public static final String LAND_ROVER_RANGE_ROVER_EVOQUE_SI4_COUPE_PURE_TECH_PACK = "Si4 Coupe Pure Tech Pack";

	// Cor
	public static final String AMARELO = "Amarelo";
	public static final String AZUL = "Azul";
	public static final String VERMELHO = "Vermelho";
	public static final String VERDE = "Verde";
	public static final String BRANCO = "Branco";
	public static final String PRETO = "Preto";
	public static final String PRATA = "Prata";
	public static final String CHUMBO = "Chumbo";
	public static final String DOURADO = "Dourado";
	
	// Opcionais
	public static final String AR_CONDICIONADO = "Ar condicionado";
	
	// loja
	public static final String LOJA_MATRIZ = "Matriz";

	// Opcionais
	public static final String DIRECAO_HIDRAULICA = "Direcao Hidraulica";
	public static final String VIDRO_ELETRICO = "Vidro Eletrico";
	public static final String TRAVA_ELETRICA = "Trava Eletrica";
	public static final String AIR_BAG = "Air Bag";
	public static final String ALARME = "Alarme";
	
	
	
	public boolean execute() {		
		this.criaCadastroBase();		
		return true;
	}
	
	private void criaCadastroBase() {
		// Marcas
		this.getMarcaOuCria(FERRARI);
		Marca volkswagem = this.getMarcaOuCria(VOLKSWAGEM);
		this.getMarcaOuCria(CHEVROLET);
		Marca ford = this.getMarcaOuCria(FORD);
		this.getMarcaOuCria(FIAT);
		this.getMarcaOuCria(AUDI);
		this.getMarcaOuCria(PORSCHE);
		this.getMarcaOuCria(LEXUS);
		this.getMarcaOuCria(TOYOTA);
		this.getMarcaOuCria(HYUNDAI);
		this.getMarcaOuCria(KIA);
		this.getMarcaOuCria(NISSAN);
		this.getMarcaOuCria(ALFA_ROMEO);
		this.getMarcaOuCria(CHRYSLER);
		this.getMarcaOuCria(DODGE);
		this.getMarcaOuCria(JEEP);
		this.getMarcaOuCria(CITROEN);
		Marca pegeout = this.getMarcaOuCria(PEGEOUT);
		this.getMarcaOuCria(SUZUKI);
		this.getMarcaOuCria(RENAULT);
		this.getMarcaOuCria(HONDA);
		this.getMarcaOuCria(BMW);
		this.getMarcaOuCria(MERCEDES_BENZ);
		this.getMarcaOuCria(MITSUBISHI);
		this.getMarcaOuCria(JAGUAR);
		Marca landRover = this.getMarcaOuCria(LAND_ROVER);
		this.getMarcaOuCria(VOLVO);
		this.getMarcaOuCria(JAC);
		// Categorias
		Categoria hatch = this.getCategoriaOuCria(HATCH); // popular(gol,celta,UNO,Palio,Up)|pequenos(Onix,fiesta,HB20,Fox,Sandero), medios(punto,golf,focus,Cruze Sport6, 308), grandes
		Categoria sedan = this.getCategoriaOuCria(SEDAN); // pequenos, compactos, medios, grandes
		Categoria sw = this.getCategoriaOuCria(SW); // medio e grande
		Categoria van = this.getCategoriaOuCria(VAN); // subs monocab, grandcab
		Categoria pickUp = this.getCategoriaOuCria(PICK_UP); // pequenos e grandes
		Categoria sport = this.getCategoriaOuCria(SPORT); // Sport
		Categoria suv = this.getCategoriaOuCria(SUV); // SUV
		this.getCategoriaOuCria(MOTO); // 
		this.getCategoriaOuCria(ONIBUS); // 
		this.getCategoriaOuCria(CAMINHAO); 		
		// Subcategorias
		Subcategoria popular = this.getSubcategoriaOuCria(POPULAR, hatch);
		this.getSubcategoriaOuCria(HATCH_PEQUENO, hatch);
		Subcategoria hatchMedio = this.getSubcategoriaOuCria(HATCH_MEDIO, hatch);
		this.getSubcategoriaOuCria(HATCH_GRANDE, hatch);
		this.getSubcategoriaOuCria(SEDAN_PEQUENO, sedan);
		this.getSubcategoriaOuCria(SEDAN_COMPACTO, sedan);
		this.getSubcategoriaOuCria(SEDAN_MEDIO, sedan);
		this.getSubcategoriaOuCria(SEDAN_GRANDE, sedan);
		this.getSubcategoriaOuCria(SW_MEDIO, sw);
		this.getSubcategoriaOuCria(SW_GRANDE, sw);	
		this.getSubcategoriaOuCria(MONOCAB, van);
		this.getSubcategoriaOuCria(GRANDCAB, van);		
		this.getSubcategoriaOuCria(PICK_UP_PEQUENO, pickUp);
		this.getSubcategoriaOuCria(PICK_UP_GRANDE, pickUp);		
		this.getSubcategoriaOuCria(SPORT, sport);		
		Subcategoria miniSUV = this.getSubcategoriaOuCria(MINI_SUV, suv);	
		Subcategoria crossoverSUV = this.getSubcategoriaOuCria(CROSSOVER_SUV, suv);
		/* ********* subs ********* ???
		 *   Fugoes, Monocab, Grandcab, Forgoes pequenos
		 */			
		
		// Modelos
		Modelo volkswagemGol = this.getModeloOuCria(VOLKSWAGEM_GOL, volkswagem, popular);
		this.getModeloOuCria(VOLKSWAGEM_UP, volkswagem, popular);
		Modelo pegeout308 = this.getModeloOuCria(PEGEOUT_308, pegeout, hatchMedio);
		Modelo fordEcosport = this.getModeloOuCria(FORD_ECOSPORT, ford, miniSUV);		
		Modelo landRoverRangeRoverEvoque = this.getModeloOuCria(LAND_ROVER_RANGE_ROVER_EVOQUE, landRover, crossoverSUV);
		// Cambios
		Cambio manual = this.getCambioOuCria(CAMBIO_MANUAL);
		Cambio automatico = this.getCambioOuCria(CAMBIO_AUTOMATICO);
		// Combustiveis
		Combustivel gasolina = this.getCombustivelOuCria(GASOLINA);
		this.getCombustivelOuCria(ALCOOL);
		this.getCombustivelOuCria(DIESEL);
		Combustivel flex = this.getCombustivelOuCria(FLEX);	
		// Versoes
		this.getVersaoOuCria(PEGEOUT_308_QUIKSILVER, 1.8f, 2015, 2015, 4, pegeout308, flex, automatico);	
		this.getVersaoOuCria(VOLKSWAGEM_GOL_TEC, 1.0f, 2013, 2014, 4, volkswagemGol, flex, automatico);	
		this.getVersaoOuCria(FORD_ECOSPORT_FREESTYLE_16V, 1.6f, 2014, 2014, 4, fordEcosport, flex, manual);
		this.getVersaoOuCria(_CriarBaseService.LAND_ROVER_RANGE_ROVER_EVOQUE_SI4_COUPE_PURE_TECH_PACK, 
				  			 2.0f, 2015, 2015, 4, landRoverRangeRoverEvoque, gasolina, automatico);		
		// Opcionais
		this.getOpcionalOuCria(AR_CONDICIONADO);
		this.getOpcionalOuCria(DIRECAO_HIDRAULICA); 
		this.getOpcionalOuCria(VIDRO_ELETRICO);
		this.getOpcionalOuCria(TRAVA_ELETRICA);
		this.getOpcionalOuCria(AIR_BAG);		
	}
	

	
	/*
	 * Pega ou Criar
	 */
	
	public Marca getMarcaOuCria(String descricao) {
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
	
	public Categoria getCategoriaOuCria(String descricao) {
		Categoria categoria = this.categoriaService.getPorDescricao(descricao);
		if (categoria == null) {
			categoria = new Categoria();
			categoria.setDescricao(descricao);
			this.categoriaService.save(categoria);
		}
		return categoria;
	}		
	
	public Subcategoria getSubcategoriaOuCria(String descricao, Categoria categoria) {
		Subcategoria subcategoria = this.subcategoriaService.getPorDescricao(descricao);
		if (subcategoria == null) {
			subcategoria = new Subcategoria();
			subcategoria.setDescricao(descricao);
			subcategoria.setCategoria(categoria);
			this.subcategoriaService.save(subcategoria);
		}
		return subcategoria;
	}		
	
	public Modelo getModeloOuCria(String descricao, Marca marca, Subcategoria subcategoria) {
		Modelo modelo = this.modeloService.getPorDescricaoMarca(descricao, marca, subcategoria);
		if (modelo == null) {
			ModeloBuilder mb = new ModeloBuilder();
			Modelo gol = mb.comDescricao(descricao)
							.comMarca(marca)
							.comSubcategoria(subcategoria)
							.build();
			this.modeloService.save(gol);
		}
		return modelo;
	}		

	public Cambio getCambioOuCria(String descricao) {
		Cambio cambio = this.cambioService.getPorDescricao(descricao);
		if(cambio == null) {
			cambio = new Cambio();
			cambio.setDescricao(descricao);
			this.cambioService.save(cambio);
		}
		return cambio;
	}		

	public Combustivel getCombustivelOuCria(String descricao) {
		Combustivel combustivel = this.combustivelService.getPorDescricao(descricao);
		if (combustivel == null) {
			combustivel = new Combustivel();
			combustivel.setDescricao(descricao);
			this.combustivelService.save(combustivel);
		}
		return combustivel;
	}	
	
	public Versao getVersaoOuCria(String descricao, float motor, int anoFabricacao, int anoModelo, int quantidadePortas, Modelo modelo, Combustivel combustivel, Cambio cambio) {
		VersaoBuilder versaoBuilder = new VersaoBuilder();
		Versao versao = versaoBuilder.comDescricao(descricao)
									 .comMotor(motor)
									 .comModelo(modelo)
									 .comAnoFabricacao(2013)
									 .comAnoModelo(2014)
									 .comQuantidadePortas(4)
									 .comCombustivel(combustivel)
									 .comCambio(cambio)
									 .build();
		this.versaoService.save(versao);
		return versao;
	}
	
	public Cor getCorOuCria(String descricao) {
		Cor cor = this.corService.getPorDescricao(descricao);
		CorBuilder cb = new CorBuilder();
		cor = cb.comDescricao(descricao).getInstance();
		this.corService.save(cor);
		return cor;
	}	
	
	public Loja getLojaOuCria(String descricao) {
		Loja loja = this.lojaService.getPorDescricao(descricao);
		if(loja == null) {
			LojaBuilder lb = new LojaBuilder();
			loja = lb.comDescricao(descricao).getInstance();
			this.lojaService.save(loja);
		}
		return loja;
	}	

	public Opcional getOpcionalOuCria(String descricao) {
		Opcional opcional = this.opcionalService.getPorDescricao(descricao);
		if(opcional == null) {
			OpcionalBuilder ob = new OpcionalBuilder();
			opcional = ob.comDescricao(descricao).build();
			this.opcionalService.save(opcional);
		}
		return opcional;
	}
	
}
