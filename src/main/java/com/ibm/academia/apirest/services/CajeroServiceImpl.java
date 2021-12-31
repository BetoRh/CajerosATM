package com.ibm.academia.apirest.services;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.ibm.academia.apirest.models.entities.Cajero;

@Service
public class CajeroServiceImpl implements CajeroService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	@Transactional
	public List<Cajero> buscarTodos() {
		
		/*ArrayList<Cajero> cajeros = ObjectMapper.readValue(new File("https://www.banamex.com/localizador/jsonP/json5.json"), null),
				ObjectMapper.getTypeFactory().constructCollectionType(ArrayList.class,Cajero.class);*/
		
		/*List<Cajero> cajeros = Arrays.asList(restTemplate.getForObject("https://www.banamex.com/localizador/jsonP/json5.json", Cajero[].class));	
		return cajeros
				.stream()
				.map(p -> new Cajero())
				.collect(Collectors.toList());*/
		return null;
	}
	

}
