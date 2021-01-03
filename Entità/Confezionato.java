package Entit�;

import java.util.Date;

public class Confezionato extends Prodotto_unitario {
	private Date Data_scadenza;
	private String Lotto_lavorazione;
	private String Modalit�_conservazione;
	private String Marca;
	private float Peso;
	private String Nome;
	
	
	
	
	
	public Confezionato(int iD_Prodotto, String nome, float valore, int scorte, Date data_scadenza, String marca,  float peso) {
		super(iD_Prodotto, valore, scorte);
		Data_scadenza = data_scadenza;
		Marca = marca;
		Peso = peso;
		Nome = nome;
	}
	
	
	
	public Confezionato(int iD_Prodotto, String nome, float valore, int scorte, Date data_scadenza,
			String lotto_lavorazione, String modalit�_conservazione, String marca, float peso) {
		super(iD_Prodotto, valore, scorte);
		Data_scadenza = data_scadenza;
		Lotto_lavorazione = lotto_lavorazione;
		Modalit�_conservazione = modalit�_conservazione;
		Marca = marca;
		Peso = peso;
	}
	



	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public Date getData_scadenza() {
		return Data_scadenza;
	}
	public void setData_scadenza(Date data_scadenza) {
		Data_scadenza = data_scadenza;
	}
	public String getLotto_lavorazione() {
		return Lotto_lavorazione;
	}
	public void setLotto_lavorazione(String lotto_lavorazione) {
		Lotto_lavorazione = lotto_lavorazione;
	}
	public String getModalit�_conservazione() {
		return Modalit�_conservazione;
	}
	public void setModalit�_conservazione(String modalit�_conservazione) {
		Modalit�_conservazione = modalit�_conservazione;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}

}
