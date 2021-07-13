package viaggi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prenotazione")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int persone;
	
	private Viaggio viaggio;
	private Utente utenteReferente;
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
	public Utente getUtenteReferente() {
		return utenteReferente;
	}
	public void setUtenteReferente(Utente utenteReferente) {
		this.utenteReferente = utenteReferente;
	}
	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", persone=" + persone + "]";
	}
	
	

	
	

}
