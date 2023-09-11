package fr.humanbooster.iz.aeroport.business;

import java.time.LocalDateTime;

public class Vol {
	
	private Long id;
	private LocalDateTime heureDepart;
	private LocalDateTime heureArrivee;
	private float prixEnEuros;
	private Aeroport depart = new Aeroport();
	private Aeroport arrivee = new Aeroport();
	private Compagnie compagnie = new Compagnie();
	
	
	public Vol() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDateTime getHeureDepart() {
		return heureDepart;
	}


	public void setHeureDepart(LocalDateTime heureDepart) {
		this.heureDepart = heureDepart;
	}


	public LocalDateTime getHeureArrivee() {
		return heureArrivee;
	}


	public void setHeureArrivee(LocalDateTime heureArrivee) {
		this.heureArrivee = heureArrivee;
	}


	public float getPrixEnEuros() {
		return prixEnEuros;
	}


	public void setPrixEnEuros(float prixEnEuros) {
		this.prixEnEuros = prixEnEuros;
	}


	public Aeroport getDepart() {
		return depart;
	}


	public void setDepart(Aeroport depart) {
		this.depart = depart;
	}


	public Aeroport getArrivee() {
		return arrivee;
	}


	public void setArrivee(Aeroport arrivee) {
		this.arrivee = arrivee;
	}
	
	public Compagnie getCompagnie() {
		return compagnie;
	}


	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}
	
	


	@Override
	public String toString() {
		return "Vol [id=" + id + ", heureDepart=" + heureDepart + ", heureArrivee=" + heureArrivee + ", prixEnEuros="
				+ prixEnEuros + ", depart=" + depart + ", arrivee=" + arrivee + "]";
	}



	
	
	
	

	
	
	
}
