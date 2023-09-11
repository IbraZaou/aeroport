package fr.humanbooster.iz.aeroport.dao;

import java.sql.SQLException;
import java.util.List;

import fr.humanbooster.iz.aeroport.business.Compagnie;

public interface CompagnieDao {
	// C
    Compagnie createCompagnie(Compagnie compagnie) throws SQLException;

    // R
    Compagnie findOneCompagnieById(long id) throws SQLException;
    List<Compagnie> findAllCompagnies() throws SQLException;

    // U

    // D
    boolean delete(Long id) throws SQLException;
}
