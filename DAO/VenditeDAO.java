package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import Entit�.Fattura;

public interface VenditeDAO {

	public ArrayList<Fattura> getFattura() throws SQLException;

//	public void getCarrelloByIDCarrello(String iDCarrello);
	
	

}
