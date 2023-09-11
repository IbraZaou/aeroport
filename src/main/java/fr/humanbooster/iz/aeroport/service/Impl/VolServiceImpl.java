package fr.humanbooster.iz.aeroport.service.Impl;

import java.time.LocalDateTime;
import java.util.List;

import fr.humanbooster.iz.aeroport.business.Vol;
import fr.humanbooster.iz.aeroport.dao.VolDao;
import fr.humanbooster.iz.aeroport.dao.impl.VolDaoImpl;
import fr.humanbooster.iz.aeroport.service.VolService;

public class VolServiceImpl implements VolService {

	public VolDao volDao = new VolDaoImpl();
	
	
	@Override
	public Vol ajouterVol(LocalDateTime dateHeureDepart, LocalDateTime dateHeureArrivee, float prixEnEuros,
			long idCompagnie, long idAeroportDepart, long idAeroportArrivee) {
		
		return null;
	}
		
	@Override
	public List<Vol> recupererVolsTrieParPrix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vol modifierVol(Vol vol) {
		// TODO Auto-generated method stub
		return null;
	}


}
	
