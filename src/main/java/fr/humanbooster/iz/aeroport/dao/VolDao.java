package fr.humanbooster.iz.aeroport.dao;

import java.sql.SQLException;
import java.util.List;

import fr.humanbooster.iz.aeroport.business.Vol;

public interface VolDao {
	//C
    Vol createflight(Vol vol) throws SQLException;

    //R
    List<Vol> findAllFlightsOrderByPrice() throws SQLException;

    //U
    Vol updateVol (Vol vol) throws SQLException;
    
    //D
    
}
