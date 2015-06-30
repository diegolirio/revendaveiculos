package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.builder.CorBuilder;
import com.diegolirio.revendaveiculos.builder.LojaBuilder;
import com.diegolirio.revendaveiculos.builder.MarcaBuilder;
import com.diegolirio.revendaveiculos.builder.ModeloBuilder;
import com.diegolirio.revendaveiculos.builder.VersaoBuilder;
import com.diegolirio.revendaveiculos.model.Cambio;
import com.diegolirio.revendaveiculos.model.Categoria;
import com.diegolirio.revendaveiculos.model.Combustivel;
import com.diegolirio.revendaveiculos.model.Cor;
import com.diegolirio.revendaveiculos.model.Loja;
import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Modelo;
import com.diegolirio.revendaveiculos.model.Subcategoria;
import com.diegolirio.revendaveiculos.model.Versao;

@Service("_criarBaseService")
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

	// Modelos Volkswagem
	public static final String VOLKSWAGEM_GOL = "Gol";
	public static final String VOLKSWAGEM_UP = "Up";
	
	// Cambios
	public static final String CAMBIO_MANUAL = "Manual";
	public static final String CAMBIO_AUTOMATICO = "Automatico";
	
	//Combustivel
	public static final String GASOLINA = "Gasolina";
	public static final String ALCOOL = "Alcool";
	public static final String DIESEL = "Diesel";
	public static final String FLEX = "Flex";
	
	// Cor
	public static final String AMARELO = "Amarelo";
	public static final String AZUL = "Azul";
	public static final String VERMELHO = "Vermelho";
	public static final String VERDE = "Verde";
	public static final String BRANCO = "Branco";
	public static final String PRETO = "Preto";
	public static final String PRATA = "Prata";
	public static final String CHUMBO = "Chumbo";
	
	// loja
	public static final String LOJA_MATRIZ = "Matriz";
	
	
	public boolean execute() {
		
		this.criarMarcas();
		this.criaCategorias();
		this.criaSubcategorias();
		this.criaModelos();
		this.criaCambios();
		this.criaCombustiveis();
		// versoes 
		// cor
		// lojas
		// opcionais		
		
		return true;
	}
	
	private void criarMarcas() {
		this.getMarcaOuCria(FERRARI);
		this.getMarcaOuCria(VOLKSWAGEM);
		this.getMarcaOuCria(CHEVROLET);
		this.getMarcaOuCria(FORD);
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
		this.getMarcaOuCria(PEGEOUT);
		this.getMarcaOuCria(SUZUKI);
		this.getMarcaOuCria(RENAULT);
		this.getMarcaOuCria(HONDA);
		this.getMarcaOuCria(BMW);
		this.getMarcaOuCria(MERCEDES_BENZ);
		this.getMarcaOuCria(MITSUBISHI);
		this.getMarcaOuCria(JAGUAR);
		this.getMarcaOuCria(LAND_ROVER);
		this.getMarcaOuCria(VOLVO);
		this.getMarcaOuCria(JAC);
	}
	
	private void criaCategorias() {
		this.getCategoriaOuCria(HATCH); // popular(gol,celta,UNO,Palio,Up)|pequenos(Onix,fiesta,HB20,Fox,Sandero), medios(punto,golf,focus,Cruze Sport6, 308), grandes
		this.getCategoriaOuCria(SEDAN); // pequenos, compactos, medios, grandes
		this.getCategoriaOuCria(SW); // medio e grande
		this.getCategoriaOuCria(VAN); // subs monocab, grandcab
		this.getCategoriaOuCria(PICK_UP); // pequenos e grandes
		this.getCategoriaOuCria(SPORT); // Sport		
		
		this.getCategoriaOuCria(MOTO); // 
		this.getCategoriaOuCria(ONIBUS); // 
		this.getCategoriaOuCria(CAMINHAO); //		
		
		/* ********* subs ********* ???
		 *   SUV, Fugoes, Monocab, Grandcab, Forgoes pequenos
		 */		
	}
	
	private void criaSubcategorias() {
		// Hatchs
		Categoria hatch = this.getCategoriaOuCria(HATCH);
		this.getSubcategoriaOuCria(POPULAR, hatch);
		this.getSubcategoriaOuCria(HATCH_PEQUENO, hatch);
		this.getSubcategoriaOuCria(HATCH_MEDIO, hatch);
		this.getSubcategoriaOuCria(HATCH_GRANDE, hatch);
		// Sedans
		Categoria sedan = this.getCategoriaOuCria(SEDAN);
		this.getSubcategoriaOuCria(SEDAN_PEQUENO, sedan);
		this.getSubcategoriaOuCria(SEDAN_COMPACTO, sedan);
		this.getSubcategoriaOuCria(SEDAN_MEDIO, sedan);
		this.getSubcategoriaOuCria(SEDAN_GRANDE, sedan);
		// SW
		Categoria sw = this.getCategoriaOuCria(SW);
		this.getSubcategoriaOuCria(SW_MEDIO, sw);
		this.getSubcategoriaOuCria(SW_GRANDE, sw);
		// Van
		Categoria van = this.getCategoriaOuCria(VAN);
		this.getSubcategoriaOuCria(MONOCAB, van);
		this.getSubcategoriaOuCria(GRANDCAB, van);
		// PICK_UP
		Categoria pickUp = this.getCategoriaOuCria(PICK_UP);
		this.getSubcategoriaOuCria(PICK_UP_PEQUENO, pickUp);
		this.getSubcategoriaOuCria(PICK_UP_GRANDE, pickUp);
		// Sport
		Categoria sport = this.getCategoriaOuCria(PICK_UP);
		this.getSubcategoriaOuCria(SPORT, sport);
	}
	
	private void criaModelos() {
		Marca volkswagem = this.getMarcaOuCria(VOLKSWAGEM);
		Categoria hacth = this.getCategoriaOuCria(HATCH);
		Subcategoria popular = this.getSubcategoriaOuCria(POPULAR, hacth);
		this.getModeloOuCria(VOLKSWAGEM_GOL, volkswagem, popular);
		this.getModeloOuCria(VOLKSWAGEM_UP, volkswagem, popular);
	}
	
	private void criaCambios() {
		this.getCambioOuCria(CAMBIO_MANUAL);
		this.getCambioOuCria(CAMBIO_AUTOMATICO);
	}
	
	private void criaCombustiveis() {
		this.getCombustivelOuCria(GASOLINA);
		this.getCombustivelOuCria(ALCOOL);
		this.getCombustivelOuCria(DIESEL);
		this.getCombustivelOuCria(FLEX);
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
	
	
}
