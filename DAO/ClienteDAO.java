package DAO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import Entit�.Cliente;
import Entit�.Tessera;



 public interface ClienteDAO {

	
	public ArrayList<Tessera> getTessera() throws SQLException;
	public int insertCliente(String nome, String cognome,String luogoNascita, String cf, String sesso, Date dataN) throws SQLException;
	public int deleteTessera (int NTessera) throws SQLException;
	
}
