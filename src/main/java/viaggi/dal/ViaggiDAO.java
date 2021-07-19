/**
 * 
 */
package viaggi.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import viaggi.entities.Viaggio;

/**
 * @author fedes
 *
 */
@Repository
public interface ViaggiDAO extends JpaRepository<Viaggio, Integer> {

	@Query(value="from Viaggio where destinazione=?1")
	List<Viaggio> findByDestinazione(String destinazione);
//	@Query(value = "SELECT * FROM viaggio v WHERE v.destinazione = ?1", countQuery = "SELECT count(*) FROM viaggi WHERE destinazione = ?1",nativeQuery = true)
//	List<Viaggio> trovaDest(String d);
}
