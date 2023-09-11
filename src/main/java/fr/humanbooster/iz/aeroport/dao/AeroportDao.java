package fr.humanbooster.iz.aeroport.dao;

import java.sql.SQLException;
import java.util.List;

import fr.humanbooster.iz.aeroport.business.Aeroport;

public interface AeroportDao {

	//C
	Aeroport createAeroport (Aeroport aeroport) throws SQLException;
	
	//R
	Aeroport recupererAeroportParId(Long id) throws SQLException;
	List<Aeroport> recupererAeroports() throws SQLException;
	
	//U
	Aeroport updateAeroport(Aeroport aeroport) throws SQLException;
	
	//D
	boolean deleteAeroport(Long id) throws SQLException;
	
}
