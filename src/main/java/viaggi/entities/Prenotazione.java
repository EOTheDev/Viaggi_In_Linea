package viaggi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prenotazione")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int persone;
	@OneToOne
	private Viaggio viaggio;
	@OneToOne
	private Utente utente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersone() {
		return persone;
	}
	public void setPersone(int persone) {
		this.persone = persone;
	}
	public Viaggio getViaggio() {
		return viaggio;
	}
	public void setViaggio(Viaggio viaggio) {
		this.viaggio = viaggio;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utenteReferente) {
		this.utente = utenteReferente;
	}
	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", persone=" + persone + "]";
	}
	
	

	
	

}
