/**
 * 
 */
package viaggi.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import viaggi.entities.Viaggio;

/**
 * @author fedes
 *
 */
public interface ViaggiDAO extends JpaRepository<Viaggio, Integer> {

	List<Viaggio> findByDestination(String destinazione);

}
