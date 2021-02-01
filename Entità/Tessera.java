package Entit�;

import java.sql.Date;

public class Tessera {
	
	private int NTessera;
	private float PuntiFedelt�;
	private Date DataRilascio;
	private Date DataScadenza;
	private float PuntiFrutta;
	private float PuntiVerdura;
	private float PuntiConfezionati;
	private float PuntiUova;
	private float PuntiLatticini;
	private float PuntiFarinacei;
	private Cliente c;
	
	

	public Tessera(int NTessera) {
		this.NTessera = NTessera;
	}
	
	public Tessera(int nTessera, Cliente c, float puntiFedelt�, Date dataRilascio, Date dataScadenza) {
		super();
		NTessera = nTessera;
		this.c = c;
		PuntiFedelt� = puntiFedelt�;
		DataRilascio = dataRilascio;
		DataScadenza = dataScadenza;
		
	}

	public Tessera(int nTessera, Cliente c,  float puntiFrutta, float puntiVerdura, float puntiConfezionati, float puntiUova,
			float puntiLatticini, float puntiFarinacei) {
		super();
		NTessera = nTessera;
		this.c = c;
		PuntiFrutta = puntiFrutta;
		PuntiVerdura = puntiVerdura;
		PuntiConfezionati = puntiConfezionati;
		PuntiUova = puntiUova;
		PuntiLatticini = puntiLatticini;
		PuntiFarinacei = puntiFarinacei;
	}


	public void setC(Cliente c) {
		this.c = c;
	}


	public float getPuntiFrutta() {
		return PuntiFrutta;
	}


	public void setPuntiFrutta(float puntiFrutta) {
		PuntiFrutta = puntiFrutta;
	}


	public float getPuntiVerdura() {
		return PuntiVerdura;
	}


	public void setPuntiVerdura(float puntiVerdura) {
		PuntiVerdura = puntiVerdura;
	}


	public float getPuntiConfezionati() {
		return PuntiConfezionati;
	}


	public void setPuntiConfezionati(float puntiConfezionati) {
		PuntiConfezionati = puntiConfezionati;
	}


	public float getPuntiUova() {
		return PuntiUova;
	}


	public void setPuntiUova(float puntiUova) {
		PuntiUova = puntiUova;
	}


	public float getPuntiLatticini() {
		return PuntiLatticini;
	}


	public void setPuntiLatticini(float puntiLatticini) {
		PuntiLatticini = puntiLatticini;
	}


	public float getPuntiFarinacei() {
		return PuntiFarinacei;
	}


	public void setPuntiFarinacei(float puntiFarinacei) {
		PuntiFarinacei = puntiFarinacei;
	}

	public int getNTessera() {
		return NTessera;
	}


	public void setNTessera(int nTessera) {
		NTessera = nTessera;
	}


	public float getPuntiFedelt�() {
		return PuntiFedelt�;
	}


	public void setPuntiFedelt�(float puntiFedelt�) {
		PuntiFedelt� = puntiFedelt�;
	}

	public Date getDataRilascio() {
		return DataRilascio;
	}


	public void setDataRilascio(Date dataRilascio) {
		DataRilascio = dataRilascio;
	}


	public Date getDataScadenza() {
		return DataScadenza;
	}


	public void setDataScadenza(Date dataScadenza) {
		DataScadenza = dataScadenza;
	}
	
	public Cliente getC() {
		return c;
	}
	
	


}
