package com.sip.ams.entities;

public class Etudiant {

	private String nom;

	private int age;

	private String adresse;

	private String email;
	
	private int tel;
	
	
	public Etudiant(String nom, int age, String adresse, String email, int tel) {
		super();
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
	

}