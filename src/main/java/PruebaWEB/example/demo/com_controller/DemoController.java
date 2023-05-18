package PruebaWEB.example.demo.com_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import PruebaWEB.example.demo.com_Repositorio.Personarepo;
import PruebaWEB.example.demo.com_model.Persona;

@Controller
public class DemoController {
	@Autowired
	private Personarepo repo;

	@GetMapping("/archivo")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Chaviza") String name, Model model) {

		Persona p1 = new Persona();
		p1.setNombre("Elias Flores xd");
		p1.setID(1);
		repo.save(p1);

		Persona p2 = new Persona();
		p2.setNombre("kelly xd");
		p2.setID(2);
		repo.save(p2);

		//repo.findAll();

		model.addAttribute("persona", repo.findAll());
		return "Archivo";
	}

}