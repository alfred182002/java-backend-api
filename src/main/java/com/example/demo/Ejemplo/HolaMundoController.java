package com.example.demo.Ejemplo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
	
	@RequestMapping("/saludar")
	public String saludar() {
		return "<h1>Hola Mundo desde SpringBoot</h1>";
	}
	@RequestMapping("/persona")
	public List<persona>getPersonas(){
		List <persona>personas=new ArrayList<persona>();
		
		persona p1=new persona();
		p1.setId(1);
		p1.setNombre("Juan");
		p1.setApellido("Perez");
		p1.setTelefono("1234567890");
		
		
		persona p2=new persona();
		p2.setId(2);
		p2.setNombre("Raul");
		p2.setApellido("Solano");
		p2.setTelefono("0987654321");
		
		personas.add(p1);
		personas.add(p2);
		return personas;
	}

}
