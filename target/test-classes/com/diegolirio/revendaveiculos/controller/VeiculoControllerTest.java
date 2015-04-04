package com.diegolirio.revendaveiculos.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.diegolirio.revendaveiculos.controller.VeiculoController;
import com.diegolirio.revendaveiculos.service.VeiculoService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath*:spring-context.xml" })
public class VeiculoControllerTest {

	@InjectMocks
	private VeiculoController controller;

	private MockMvc mockMvc;
	
	@Mock
	private VeiculoService votingService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	/*
	 * Test Pages
	 */
	@Test
	public void testDeveRetornarPaginaVeiculo() throws Exception {
		mockMvc.perform(get("/veiculo/page/view"))
				.andExpect(status().isOk())
				.andExpect(view().name("veiculo/view"));
	}		
	
	/*
	 * Test Rest Full
	 */
	@Test
	public void testDeveRetornarListaDeVeiculosEmFormatoJSON() throws Exception {
		mockMvc.perform(get("/veiculo/get/list/home"))
				.andExpect(status().isOk())
				.andExpect(content().contentType("application/json"));
	}

}
