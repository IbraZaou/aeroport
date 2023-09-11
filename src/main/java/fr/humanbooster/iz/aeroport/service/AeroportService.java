package fr.humanbooster.iz.aeroport.service;

import java.util.List;

import fr.humanbooster.iz.aeroport.business.Aeroport;

public interface AeroportService {
	
	Aeroport ajouterAeroport(String nom);
    Aeroport recupererAeroportParId(Long id);
    List<Aeroport> recupererTousLesAeroports();
    Aeroport modifierAeroport (Aeroport aeroport);
    boolean deleteAeroport(Long id);
	
}
