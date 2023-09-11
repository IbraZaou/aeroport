package fr.humanbooster.iz.aeroport.service.Impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import fr.humanbooster.iz.aeroport.business.Aeroport;
import fr.humanbooster.iz.aeroport.dao.AeroportDao;
import fr.humanbooster.iz.aeroport.dao.impl.AeroportDaoImpl;
import fr.humanbooster.iz.aeroport.service.AeroportService;

public class AeroportServiceImpl implements AeroportService {
	
	public AeroportDao aeroportDao = new AeroportDaoImpl();

	@Override
	public Aeroport ajouterAeroport(String nom) {
		
		Aeroport aeroport = new Aeroport(nom);
		
		try {
			aeroportDao.createAeroport(aeroport);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aeroport;
	}

	@Override
	public Aeroport recupererAeroportParId(Long id) {
		
		try {
			return aeroportDao.recupererAeroportParId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Aeroport> recupererTousLesAeroports() {
		
		try {
			return aeroportDao.recupererAeroports();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
		
	}

	@Override
	public Aeroport modifierAeroport(Aeroport aeroport) {

		try {
			return aeroportDao.updateAeroport(aeroport);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aeroport;
	}

	@Override
	public boolean deleteAeroport(Long id) {
		
		try {
			return aeroportDao.deleteAeroport(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
