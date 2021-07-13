package viaggi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import viaggi.dal.UtenteDAO;
import viaggi.entities.Utente;

@Service
public class UtenteServiceImpl implements UtenteService {

		@Autowired
		private UtenteDAO repo;

		@Override
		public List<Utente> findAllUsers() {
			return repo.findAll();
		}

		@Override
		public Utente findUserById(int id) {
			return repo.findById(id).get();
		}

		@Override
		public void deleteUserById(int id) {
			repo.delete(repo.getById(id));
		}

		@Override
		public void updateUser(Utente user) {
			repo.findAll().set(user.getId(), user);
		}

		@Override
		public void addUser(Utente user) {
			repo.findAll().add(user);
		}

	}