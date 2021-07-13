package viaggi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import viaggi.dal.ViaggiDAO;
import viaggi.entities.Viaggio;

@Service
public class ViaggiServiceImpl implements ViaggiService {
	
	@Autowired
	private ViaggiDAO repo;

	@Override
	public List<Viaggio> findAllTrips() {
		return repo.findAll();
	}

	@Override
	public Viaggio findTripById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Viaggio> findTripsByDestination(String destinazione) {
		return repo.findByDestination(destinazione);
	}

	@Override
	public void deleteTripById(int id) {
		repo.deleteById(id);
	}

	@Override
	public void updateTrip(Viaggio trip) {
		repo.findAll().set(trip.getId(), trip);
	}

	@Override
	public void addTrip(Viaggio trip) {
		repo.findAll().add(trip);
	}

}
