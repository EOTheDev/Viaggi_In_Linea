package viaggi.service;

import java.util.List;

import viaggi.entities.Viaggio;

public interface ViaggiService {
	
	List<Viaggio> findAllTrips();
	Viaggio findTripById(int id);
	List<Viaggio> findTripsByDestination(String destinazione);
	void deleteTripById(int id);
	void updateTrip(Viaggio trip);
	void addTrip(Viaggio trip);

}