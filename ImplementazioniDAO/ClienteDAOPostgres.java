package ImplementazioniDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DAO.ClienteDAO;
import Entit�.Cliente;
import Entit�.Tessera;
import Risorse.MieEccezioni.TesseraNonTrovataException;

public class ClienteDAOPostgres implements ClienteDAO {

	private Connection connessione;
	private PreparedStatement getClienteByNTessera;
	private PreparedStatement insertCliente;
	private PreparedStatement deleteTessera;
	private PreparedStatement getPuntiFrutta;
	
	

	
	

	

	public ClienteDAOPostgres(Connection connessione) throws SQLException {
		this.connessione = connessione;
		getClienteByNTessera = connessione.prepareStatement("SELECT cliente.nome, cliente.cognome, cliente.data_nascita, cliente.luogo_nascita, cliente.sesso, cliente.cf FROM cliente join tessera on cliente.cf = tessera.cf WHERE tessera.n_tessera = ?");
		insertCliente = connessione.prepareStatement("INSERT INTO CLIENTE VALUES (?,?,?,?,?,?)");
		deleteTessera = connessione.prepareStatement("DELETE FROM TESSERA WHERE n_tessera = ?");
	}
	
	public void insertCliente(String nome, String cognome,String luogoNascita, String cf, String sesso, Date data_nascita) throws SQLException {
		
		
	
		insertCliente.setString(1, nome.toUpperCase());
		insertCliente.setString(2, cognome.toUpperCase());
		insertCliente.setString(3, cf.toUpperCase());
		insertCliente.setString(4, luogoNascita.toUpperCase());
		insertCliente.setDate(5, data_nascita);
		insertCliente.setString(6, sesso.toUpperCase());
		insertCliente.executeUpdate();
		
	}
	
	public ArrayList<Tessera> getPuntiPerCategoria() throws SQLException{
		
		Statement PuntiPerCategoria = connessione.createStatement();
		
		ResultSet rs = PuntiPerCategoria.executeQuery("SELECT * FROM Visualizzaclienti");
		ArrayList<Tessera> Tessera = new ArrayList<Tessera>();
		
		while(rs.next()) {
			
			Cliente c = new Cliente(rs.getString("cf"));
			Tessera t = new Tessera (rs.getInt("n_tessera"), c, rs.getFloat("punti_frutta"), rs.getFloat("punti_verdura"), rs.getFloat("punti_confezionati"), rs.getFloat("punti_uova"), rs.getFloat("punti_latticini"), rs.getFloat("punti_farinacei"));
			Tessera.add(t);
		}
		
		rs.close();
		return Tessera;
		
	}
	
	public ArrayList<Tessera>getTessera() throws SQLException
	{
		Statement getTessera = connessione.createStatement();
		ResultSet rs = getTessera.executeQuery("SELECT * FROM tessera JOIN cliente ON tessera.cf = cliente.cf");
		ArrayList<Tessera> Tessera = new ArrayList<Tessera>();
		while(rs.next()) 
			
		{
			
			Cliente c = new Cliente(rs.getString("nome"), rs.getString("cognome"), rs.getString("cf"));
			Tessera t = new Tessera(rs.getInt("n_tessera"), c, rs.getFloat("punti_fedelt�"),rs.getDate("data_rilascio"), rs.getDate("data_scadenza"));
			Tessera.add(t);
			
		}
	
		rs.close();
		return Tessera;
		
	}

	

	
	
	public  Cliente getClienteByNTessera(int n_tessera) throws SQLException, TesseraNonTrovataException
	{
	
		getClienteByNTessera.setInt(1, n_tessera);
		ResultSet rs = getClienteByNTessera.executeQuery();
		Cliente c = null;
		
		if (rs.next()) {
				
		 c = new Cliente(rs.getString("nome"),rs.getString("cognome"),rs.getString("luogo_nascita"),rs.getString("sesso"), rs.getString("cf"), rs.getDate("data_nascita"));
		
		
		
		}
		
		if( c== null) {
			
			throw new TesseraNonTrovataException();
			
		}
		rs.close();
		return c;
	
	}

	public void deleteTessera(int NTessera) throws SQLException, TesseraNonTrovataException  {
		
		
		deleteTessera.setInt(1, NTessera);
		
		int row = deleteTessera.executeUpdate();
		if (row == 0)
		{
			
			throw new TesseraNonTrovataException();
			
		}
		
		
		
	}

	
	public float getPuntiClienteFrutta(int NTessera) throws SQLException {

		getPuntiFrutta.setInt(1, NTessera);
		
		ResultSet rs = getPuntiFrutta.executeQuery();
		
		float PuntiFrutta=0;
		
		if(rs.next()) 
		{
			
			 PuntiFrutta = rs.getFloat("punti_frutta");
			
		}
		
		
		rs.close();
		return PuntiFrutta;
	}

}

	
	





	
	

