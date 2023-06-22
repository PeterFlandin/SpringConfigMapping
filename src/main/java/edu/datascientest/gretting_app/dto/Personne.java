package edu.datascientest.gretting_app.dto;

public class Personne {

    private Integer id;
    private Boolean programmeur;
    private Double age;
    private String technologiePreferee;
    private String[] noms;

    public Personne(Integer id, Boolean programmeur, Double age, String technologiePreferee, String[] noms) {
	super();
	this.id = id;
	this.programmeur = programmeur;
	this.age = age;
	this.technologiePreferee = technologiePreferee;
	this.noms = noms;
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Boolean getProgrammeur() {
	return this.programmeur;
    }

    public void setProgrammeur(Boolean programmeur) {
	this.programmeur = programmeur;
    }

    public Double getAge() {
	return this.age;
    }

    public void setAge(Double age) {
	this.age = age;
    }

    public String getTechnologiePreferee() {
	return this.technologiePreferee;
    }

    public void setTechnologiePreferee(String technologiePreferee) {
	this.technologiePreferee = technologiePreferee;
    }

    public String[] getNoms() {
	return this.noms;
    }

    public void setNoms(String[] noms) {
	this.noms = noms;
    }

}
