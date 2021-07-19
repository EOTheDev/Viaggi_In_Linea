package viaggi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import viaggi.dal.PrenotazioneDAO;
import viaggi.entities.Prenotazione;
import viaggi.entities.Utente;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {
	
	@Autowired
	private PrenotazioneDAO repo;
	
	@Override
	public List<Prenotazione> findAllPrenotazione() {
		
		return repo.findAll();
	}

	@Override	
	public Prenotazione findPrenotazioneById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Prenotazione> findPrenotazioneByUtente(Utente utente) {
		return null;
	}

	@Override
	public void deletePrenotazioneById(int id) {
		repo.deleteById(id);

	}

	@Override
	public Prenotazione updatePrenotazione(Prenotazione p) {
		return repo.save(p);
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		return repo.save(p);

	}

}
