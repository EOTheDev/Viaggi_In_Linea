package viaggi.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import viaggi.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
