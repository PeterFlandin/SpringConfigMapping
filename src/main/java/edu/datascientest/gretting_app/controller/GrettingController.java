package edu.datascientest.gretting_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.datascientest.gretting_app.dto.Personne;

@RestController
//@RequestMapping("/api") pour /api/gretting
public class GrettingController {

    @GetMapping(value = "/gretting")
    public String getGretting() {
	return "Hello World";
    }

    @GetMapping("/greetingJSON")
    public Personne getJSON() {
	Personne p = new Personne(1, true, 21., "spring", new String[] { "Ramzi", "Farat" });
	return p;
    }

}
