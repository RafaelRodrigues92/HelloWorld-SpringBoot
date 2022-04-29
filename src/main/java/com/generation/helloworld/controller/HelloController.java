package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Comunição <br/> Persistência <br/> Responsabilidade Pessoal"
				+ " <br/> Orientação ao Futuro <br/> Orientação ao Detalhe";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Boa comunicação é importante para entender e ser entendido <br/> "
				+ "<br/> Persistência é importante mesmo em meio as dificuldades manter o foco"
				+ "<br/> Responsabilidade Pessoal é ask <br/>"
				+ "<br/> Orientação ao Futuro tem como objetivo traçar objetivos e forma de conquistá-los <br/>"
				+ "<br/> Orientação ao Detalhe é se atender aos pequenos pontos <br/>";
	}
 
}