package viaggi.service;

import java.util.List;

import viaggi.entities.Prenotazione;
import viaggi.entities.Utente;
import viaggi.entities.Viaggio;

public interface PrenotazioneService {
	
	List<Prenotazione> findAllPrenotazione();
	Prenotazione findPrenotazioneById(int id);
	List<Prenotazione> findPrenotazioneByUtente(Utente utente);
	void deletePrenotazioneById(int id);
	Prenotazione updatePrenotazione(Prenotazione p);
	Prenotazione addPrenotazione(Prenotazione p);

}