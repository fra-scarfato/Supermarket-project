package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import Entit�.Carrello;
import Entit�.Fattura;
import Entit�.Prodotto_kg;
import Entit�.Prodotto_unitario;
import Risorse.MieEccezioni.TesseraNonTrovataException;

public interface VenditeDAO {

	public ArrayList<Fattura> getFattura() throws SQLException;
	public void inserisciCarrello() throws SQLException;
	public int getUltimoIDCarrello() throws SQLException;
	public void inserisciCompCarelloKG(int IDCarrello, int IDProdotto, float quantit�) throws SQLException;
	public void inserisciCompCarelloN(int IDCarrello, int IDProdotto, int quantit�) throws SQLException;
//	public void getCarrelloByIDCarrello(String iDCarrello);
	public ArrayList<Prodotto_kg> getCarrelloKGByID(int IDCarrello) throws SQLException;
	public ArrayList<Prodotto_unitario> getCarrelloNByID(int IDCarrello) throws SQLException;
	public Carrello getPrezzoEPuntiByID(int IDCarrello) throws SQLException;
	public void getTesserabyNTessera(int NTessera) throws TesseraNonTrovataException,SQLException;
	public void inserisciFattura(Fattura FatturaDaGenerare) throws SQLException;
}
