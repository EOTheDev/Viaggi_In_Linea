package viaggi.service;

import java.util.List;

import viaggi.entities.Utente;


public interface UtenteService {
	
	List<Utente> findAllUsers();
	Utente findUserByEmail(String email);
	Utente findUserById(int id);
	void deleteUserById(int id);
	Utente updateUser(Utente user);
	Utente addUser(Utente user);

}



