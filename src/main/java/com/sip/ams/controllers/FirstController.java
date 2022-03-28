package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sip.ams.entities.Etudiant;

@Controller
public class FirstController {
	
	@RequestMapping("/first")
	
	public String home(Model m)
	{
		String nom="kitarsamia";
		String universite="SUPCOM";
		String email="kitarsam1802@gmail.com";
		String adresse="bardo";
		
		m.addAttribute("name",nom);
		m.addAttribute("myUniversity",universite);
		m.addAttribute("myemail",email);
		m.addAttribute("myadresse",adresse);
		
		ArrayList<String> cours = new ArrayList<>();
		
		
		cours.add("java OCA");
		cours.add("java OCP");
		cours.add("Spring");
		cours.add("MicroServices");
		
		m.addAttribute("cours", cours);
		return"home/app";
		
	
	}
	
	@RequestMapping("/list")
		
	public String etudiants(Model m)
	{ 
		ArrayList<Etudiant>	 students= new ArrayList<>();
		
		students.add(new Etudiant("Ala",25,"aala@gmail.com", "Tunis", 20326514));
		students.add(new Etudiant("Ahmed",23,"ahmed@gmail.com", "bardo", 25646514));
		students.add(new Etudiant("Ali",18,"ali@gmail.com", "Tunis", 654226514));
		
		m.addAttribute("sss",students);
		
		return "home/etudiants";
	}

	@RequestMapping("/add")
	public String addEtudiant(Model m)
	{ 
		return "home/addStudent";
	}
}
