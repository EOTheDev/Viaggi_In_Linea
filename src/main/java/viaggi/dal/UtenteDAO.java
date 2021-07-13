
package viaggi.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import viaggi.entities.Utente;

/**
 * @author fedes
 *
 */
public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
