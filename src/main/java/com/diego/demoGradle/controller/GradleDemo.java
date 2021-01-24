package com.diego.demoGradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.demoGradle.entity.Demo;

@RestController
@RequestMapping("/gradle")
public class GradleDemo {

	@GetMapping("/saludo")
	public String saludo() {
		Demo demito = new Demo();
		demito.setMensaje("Hola amigos, esto es una prueba");
		return demito.getMensaje();
	}

}
