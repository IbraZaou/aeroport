package fr.humanbooster.iz.aeroport.dao;

public class Requetes {

	//Aeroport
	public static final String REQUETE_AJOUT_AEROPORT = "INSERT INTO Aeroport (nom) VALUES (?)";
	public static final String REQUETE_SELECTION_AEROPORT_PAR_ID = "SELECT * FROM Aeroport WHERE id (?)";
	public static final String REQUETE_SELECTION_AEROPORT_ALL = "SELECT * FROM Aeroport";
	public static final String REQUETE_MISE_A_JOUR_NOM_AEROPORT  = "UPDATE `Aeroport` SET `nom` =(?) WHERE id = ?";
	public static final String SUPPRESSION_AEROPORT = "DELETE FROM Aeroport WHERE id=?";
	
	//Compagnie
	public static final String REQUETE_AJOUT_COMPAGNIE = "INSERT INTO Compagnie (nom) VALUES (?)";
	public static final String REQUETE_SELECTION_COMPAGNIE_PAR_ID = "SELECT * FROM Compagnie WHERE id (?)";
	public static final String REQUETE_SELECTION_COMPAGNIE_ALL = "SELECT * FROM Compagnie";
	public static final String SUPPRESSION_COMPAGNIE = "DELETE FROM Compagnie WHERE id=?";
	
	//Vol
	public static final String REQUETE_AJOUT_VOL = "INSERT INTO `vol`(`dateHeureDepart`, `dateHeureArrive`, `PrixEnEuro`, `Id_Aeroport_Arrive`, `Id_Aeroport_Depart`, `Id_Compagnie`) VALUES (?,?,?,?,?,?)";
	public static final String REQUETE_SELECTION_VOL_ALL = "SELECT * FROM Vol";
	public static final String REQUETE_MISE_A_JOUR_VOL = "UPDATE `vol SET `Id_Vol`= ?,`dateHeureDepart`= ?,`dateHeureArrive`=?,`PrixEnEuro`=?,`Id_Aeroport_Arrive`=?,`Id_Aeroport_Depart`=?,`Id_Compagnie`=? WHERE id=?";
	
}
