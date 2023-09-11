package fr.humanbooster.iz.aeroport.service.Impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import fr.humanbooster.iz.aeroport.business.Compagnie;
import fr.humanbooster.iz.aeroport.dao.CompagnieDao;
import fr.humanbooster.iz.aeroport.dao.impl.CompagnieDaoImpl;
import fr.humanbooster.iz.aeroport.service.CompagnieService;

public class CompagnieServiceImpl implements CompagnieService {
	
	public CompagnieDao compagnieDao = new CompagnieDaoImpl();

	@Override
	public Compagnie ajouterCompagnie(String nom) {
		
		Compagnie compagnie = new Compagnie(nom);
		
		try {
			compagnieDao.createCompagnie(compagnie);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return compagnie;
	}

	@Override
	public Compagnie recupererCompagnieParId(long id) {
		
		try {
			return compagnieDao.findOneCompagnieById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null; 
	}

	@Override
	public List<Compagnie> recupererToutesCompagnies() {
		
		try {
			return compagnieDao.findAllCompagnies();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Collections.emptyList();
	}

	@Override
	public boolean supprimerCompagnie(long id) {

	try {
			return compagnieDao.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
