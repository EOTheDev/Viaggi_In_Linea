package viaggi.service;

import java.util.List;

import viaggi.entities.Utente;


public interface UtenteService {
	
	List<Utente> findAllUsers();
	Utente findUserById(int id);
	void deleteUserById(int id);
	void updateUser(Utente user);
	void addUser(Utente user);

}



