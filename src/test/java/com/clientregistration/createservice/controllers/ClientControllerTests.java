package com.clientregistration.createservice.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.clientregistration.createservice.entities.salesforce.RequestSalesforce;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(controllers = ClientController.class)
@AutoConfigureMockMvc(addFilters = true)
@ExtendWith(MockitoExtension.class)

public class ClientControllerTests {

	@Autowired
	private MockMvc mockMvc;
	
	//@MockBean
	//private JwtDecoder jwtDecoder;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	private RequestSalesforce requestSalesforce; 
	
	@BeforeEach
	public void init() {
		requestSalesforce = new RequestSalesforce();
	}
	
	@Test
	void ClientController_UpdateClient_ReturnUpdated() throws Exception {
		ResultActions response = mockMvc.perform(post("/createClient")
				//.with(SecurityMockMvcRequestPostProcessors.jwt())
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(requestSalesforce)));
		
		response.andExpect(MockMvcResultMatchers.status().isCreated())
			.andDo(MockMvcResultHandlers.print());
	}

}