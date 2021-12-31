package com.ibm.academia.apirest.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.academia.apirest.configuration.JsonRestTemplate;
import com.ibm.academia.apirest.exception.NotFoundException;
import com.ibm.academia.apirest.models.entities.Cajero;
import com.ibm.academia.apirest.repositories.CajeroRepository;
import com.ibm.academia.apirest.services.CajeroService;

@RestController
@RequestMapping("/cajeros")
public class CajeroController {
	
	//private RestTemplate restTemplate;
	
	@Autowired
	private CajeroService cajeroService;
	
	@Autowired
	private CajeroRepository cajeroRepository;
	
	ObjectMapper objectMapper;
	/**
	 * 
	 * @return Retorna la lista de cajeros y sucursales
	 * @throws JsonMappingException
	 * @throws JsonProcessingException
	 * @author JARA 27/12/2021
	 */
	@GetMapping(value = "/cajero")
	public List<Object> getCajeros() throws JsonMappingException, JsonProcessingException {
		
		
		String url = "https://www.banamex.com/localizador/jsonP/json5.json";
		List<Object> cajeros = Arrays.asList(objectMapper.readValue(url, Object[].class));
		
		return Arrays.asList(cajeros);
		
		
	}
	
	private RestTemplate restTemplate;
	/**
	 * Endpoint para mostrar la lista de cajeros y sucursales
	 * @return retorna la lista de sucursales 
	 * @author JARA 27/12/2021
	 */
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		
		ResponseEntity<List<Cajero>> cajeroResponse = restTemplate.
				exchange("https://www.banamex.com/localizador/jsonP/json5.json", HttpMethod.GET, null,
						new ParameterizedTypeReference<List<Cajero>>() {
				});
		List<Cajero> cajeros = cajeroResponse.getBody();
		return new ResponseEntity<List<Cajero>>(cajeros, HttpStatus.OK); 
	}

}
