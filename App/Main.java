package App;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import ConnessioneDB.ConnessioneDB;
import Controller.ControllerCliente;
import Controller.ControllerMagazzino;
import DAO.ClienteDAO;
import DAO.MagazzinoDAO;
import Entit�.Cliente;
import Entit�.Frutta;
import GUI.ClientiJFrame;
import GUI.CreaTesseraJFrame;
import ImplementazioniDAO.ClienteDAOPostgres;
import ImplementazioniDAO.MagazzinoDAOPostgres;

public class Main {

	

	public static void main(String[] args) {
		
		//ControllerCliente controller = new ControllerCliente();
		ControllerMagazzino Magazzino = new ControllerMagazzino();
	
		
		
	
	}
	
		
		
		
		
		
		
//		ConnessioneDB DBconn = null;
//		Connection Conn = null;
////    	MagazzinoDAO MagDAO = null;
//		ClienteDAO cliente = null;
//		
//		try {
//			DBconn = ConnessioneDB.getInstance();
//			Conn = DBconn.getConnection();
//			cliente = new ClienteDAOPostgres(Conn);
//			
//			ArrayList<Cliente> clienti = cliente.getCliente();
//			for(Cliente o:clienti)
//			{
//				System.out.println(o);
//			}
//			
//	
//		}catch(SQLException e) {
//			System.out.println("Errore: "+e);
//		}
//	}


}
