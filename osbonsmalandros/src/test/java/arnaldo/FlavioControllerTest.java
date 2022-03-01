package arnaldo;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import osbonsmalandros.doutorflavio.config.FlavioConfig;
import osbonsmalandros.doutorflavio.config.FlavioInitializer;
import osbonsmalandros.doutorflavio.config.FlavioWebConfig;
import osbonsmalandros.doutorflavio.controllers.FlavioMainController;



@SpringJUnitWebConfig(classes = {FlavioWebConfig.class, FlavioConfig.class, FlavioInitializer.class})
public class FlavioControllerTest {

    
	private MockMvc mockMvc;

	@Test
	public void testOla() throws Exception {
		
		this.mockMvc = MockMvcBuilders.standaloneSetup(new FlavioMainController()).build();
		this.mockMvc.perform(MockMvcRequestBuilders.get("/ola")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	


}
