package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}
	
	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Michelle</b>";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>Mentalidade de Crescimento - Persistência - Responsabilidade Pessoal</b><br><br>"
				+ "<b>Orientação ao Futuro - Comunicação - Orientação ao Detalhe</b><br><br>"
				+ "<b>Proatividade - Trabalho em Equipe - Dar e Receber - Gestão de Tempo</b><br><br>";	
	}
	
	@GetMapping("/aprendizagem")
	public String aprendizagem() {
		return "<b>Mentalidade de Crescimento</b><br><br>"
				+ "Meu objetivo de aprendizagem essa semana é na questão da Mentalidade de Crescimento, como estamos entrando em um novo projeto,"
				+ " parece ser muito complexo e dificil, mas com a Mentalidade de Crescimento consigo focar no fato de que mesmo que seja novo, conseguirei absorver da melhor forma,"
				+ " dando o meu melhor no quesito concetração e tirando dúvidas quando elas surgirem, para que no final do projeto tudo ocorra conforme os planos.";	
	}
	
}
