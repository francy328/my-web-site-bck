package com.xantrix.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/saluti")
public class SalutiController 
{
	@GetMapping()
	public String getSaluti()
	{
		return "Saluti, sono il tuo primo web service creato in Spring Boot!";
	}
	
	@GetMapping(value = "/{nome}")
	public String getSaluti2(@PathVariable("nome") String Nome) 
	{
		if (Nome.equals("Marco"))
		{
			throw new RuntimeException("Errore: L'utente Marco è disabilitato!");
		}
		
		String message = String.format("Saluti, %s sono il tuo primo web service creato in Spring Boot!", Nome);
		
		return message;
	} 
	
 
}
