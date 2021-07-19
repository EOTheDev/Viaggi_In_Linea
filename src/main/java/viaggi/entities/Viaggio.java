package viaggi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="viaggi")
public class Viaggio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String destinazione;
	private String titolo;
	private String descrizione;
	private int numeroDiGiorni;
	private double prezzo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getNumeroDiGiorni() {
		return numeroDiGiorni;
	}
	public void setNumeroDiGiorni(int numeroDiGiorni) {
		this.numeroDiGiorni = numeroDiGiorni;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Viaggio [ destinazione=" + destinazione + " - " + titolo + ", descrizione ="
				+ descrizione + ", numeroDiGiorni=" + numeroDiGiorni + ", prezzo=" + prezzo + "]";
	}
	
	
}
