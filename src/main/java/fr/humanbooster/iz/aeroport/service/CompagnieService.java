package fr.humanbooster.iz.aeroport.service;

import java.util.List;

import fr.humanbooster.iz.aeroport.business.Compagnie;

public interface CompagnieService {

	Compagnie ajouterCompagnie(String nom);
    Compagnie recupererCompagnieParId(long id);
    List<Compagnie> recupererToutesCompagnies();
    boolean supprimerCompagnie(long id);
	
}
