package com.diegolirio.revendaveiculos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.revendaveiculos.builder.MarcaBuilder;
import com.diegolirio.revendaveiculos.model.Categoria;
import com.diegolirio.revendaveiculos.model.Marca;
import com.diegolirio.revendaveiculos.model.Subcategoria;

@Service("_criarBaseService")
public class _CriarBaseService {

	@Autowired
	private CategoriaService categoriaService;
	@Autowired
	private MarcaService marcaService;
	@Autowired
	private SubcategoriaService subcategoriaService;
	
	// Marca
	public static final String FERRARI = "Ferrari";
	public static final String VOLKSWAGEM = "Volkswagem";
	
	// Categorias
	public static final String HATCH = "Hatch"; 
	public static final String SEDAN = "Sedan"; 
	private static final String SW = "SW";
	private static final String VAN = "Van";
	private static final String PICK_UP = "Pick-Up";
	private static final String SPORT = "Sport";
	private static final String MOTO = "Moto";
	private static final String ONIBUS = "Onibus";
	private static final String CAMINHAO = "Caminhão";
	
	// Subcategorias
	public static final String POPULAR = "Popular"; 
	public static final String HATCH_PEQUENO = HATCH + " Pequeno"; 
	public static final String HATCH_MEDIO = HATCH + " Medio";
	private static final String HATCH_GRANDE = HATCH + " Grande";
	private static final String SEDAN_PEQUENO = SEDAN + " Pequeno";
	private static final String SEDAN_COMPACTO = SEDAN + " Compacto";
	private static final String SEDAN_MEDIO = SEDAN + " Medio";
	private static final String SEDAN_GRANDE = SEDAN + " Grande";
	private static final String SW_MEDIO = SW + " Medio";
	private static final String SW_GRANDE = SW + " Grande";
	private static final String MONOCAB = "Monocab";
	private static final String GRANDCAB = "Grandcab";
	private static final String PICK_UP_PEQUENO = PICK_UP + " Pequeno";
	private static final String PICK_UP_GRANDE = PICK_UP + " Grande";
	
	
	public boolean execute() {
		
		this.criarMarcas();
		this.criaCategorias();
		this.criaSubcategorias();
		// modelos
		// cambios
		// combustiveis 
		// versoes 
		// cor
		// lojas
		// opcionais		
		
		return true;
	}
	
	private void criarMarcas() {
		this.getMarcaOuCria(FERRARI);
		this.getMarcaOuCria(VOLKSWAGEM);
		this.getMarcaOuCria("Chevrolet");
		this.getMarcaOuCria("Ford");
		this.getMarcaOuCria("Fiat");
		this.getMarcaOuCria("Audi");
		this.getMarcaOuCria("Porsche");
		this.getMarcaOuCria("Lexus");
		this.getMarcaOuCria("Toyota");
		this.getMarcaOuCria("Hyundai");
		this.getMarcaOuCria("Kia");
		this.getMarcaOuCria("Nissan");
		this.getMarcaOuCria("Alfa Romeo");
		this.getMarcaOuCria("Chrysler");
		this.getMarcaOuCria("Dodge");
		this.getMarcaOuCria("Jeep");
		this.getMarcaOuCria("Citroen");
		this.getMarcaOuCria("Peugeot");
		this.getMarcaOuCria("Suzuki");
		this.getMarcaOuCria("Renault");
		this.getMarcaOuCria("Honda");
		this.getMarcaOuCria("BMW");
		this.getMarcaOuCria("Mercedes-Benz");
		this.getMarcaOuCria("Mitsubishi");
		this.getMarcaOuCria("Jaguar");
		this.getMarcaOuCria("Land Rover");
		this.getMarcaOuCria("Volvo");
		this.getMarcaOuCria("JAC");
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
	
	private Categoria getCategoriaOuCria(String descricao) {
		Categoria categoria = this.categoriaService.getPorDescricao(descricao);
		if (categoria == null) {
			categoria = new Categoria();
			categoria.setDescricao(descricao);
			this.categoriaService.save(categoria);
		}
		return categoria;
	}		
	
	private Subcategoria getSubcategoriaOuCria(String descricao, Categoria categoria) {
		Subcategoria subcategoria = this.subcategoriaService.getPorDescricao(descricao);
		if (subcategoria == null) {
			subcategoria = new Subcategoria();
			subcategoria.setDescricao(descricao);
			subcategoria.setCategoria(categoria);
			this.subcategoriaService.save(subcategoria);
		}
		return subcategoria;
	}		
	
}
