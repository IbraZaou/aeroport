package fr.humanbooster.iz.aeroport.business;

public class Compagnie {

	private Long id; 
	private String nom;
	
	
	public Compagnie() {
		super();
	}


	public Compagnie(String nom) {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Compagnie [id=" + id + ", nom=" + nom + "]";
	}
	
	
}
