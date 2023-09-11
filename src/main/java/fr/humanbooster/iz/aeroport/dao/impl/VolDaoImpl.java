package fr.humanbooster.iz.aeroport.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.iz.aeroport.business.Vol;
import fr.humanbooster.iz.aeroport.dao.AeroportDao;
import fr.humanbooster.iz.aeroport.dao.CompagnieDao;
import fr.humanbooster.iz.aeroport.dao.ConnexionBdd;
import fr.humanbooster.iz.aeroport.dao.Requetes;
import fr.humanbooster.iz.aeroport.dao.VolDao;

public class VolDaoImpl implements VolDao {
	
	
private Connection connection;

private AeroportDao aeroportDao = new AeroportDaoImpl();
private CompagnieDao compagnieDao = new CompagnieDaoImpl();

	
	public VolDaoImpl() {
		try {
			connection = ConnexionBdd.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Vol createflight(Vol vol) throws SQLException {
	
		//Préparation
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_AJOUT_VOL, Statement.RETURN_GENERATED_KEYS); //Statement.Return_generated_keys = auto incrémentation
		ps.setTimestamp(1, Timestamp.valueOf(vol.getHeureDepart()));
		ps.setTimestamp(2, Timestamp.valueOf(vol.getHeureArrivee()));
		ps.setFloat(3, vol.getPrixEnEuros());
		ps.setLong(4, vol.getDepart().getId());
		ps.setLong(5, vol.getArrivee().getId());
		ps.setLong(6, vol.getCompagnie().getId());
		
		//exdecution
		ps.executeUpdate();
		
		//Toujours pareil pour le create
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		vol.setId(rs.getLong(1));
		
		return vol;
	}

	@Override
	public List<Vol> findAllFlightsOrderByPrice() throws SQLException {
		List<Vol> vols = new ArrayList<>();

		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_SELECTION_VOL_ALL);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Vol vol = new Vol();
			vol.setDepart(aeroportDao.recupererAeroportParId(rs.getLong("Id_Aeroport_Depart")));
			vol.setArrivee(aeroportDao.recupererAeroportParId(rs.getLong("Id_Aeroport_Arrive")));
			vol.setHeureDepart(rs.getTimestamp("dateHeureDepart").toLocalDateTime());
			vol.setHeureArrivee(rs.getTimestamp("dateHeureArrivee").toLocalDateTime());
			vol.setPrixEnEuros(rs.getFloat("PrixEnEuro"));
			vol.setCompagnie(compagnieDao.findOneCompagnieById(rs.getLong("Id_Compagnie")));
			vols.add(vol);
			
		}
		
		return vols;
	}

	@Override
	public Vol updateVol(Vol vol) throws SQLException {
		
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_MISE_A_JOUR_VOL);
		
		
		return null;
	}

}
