//package viaggi.presentation;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import viaggi.entities.Utente;
//import viaggi.entities.Viaggio;
//import viaggi.repos.ViaggioDAO;
//import viaggi.service.utente.UtenteService;
//import viaggi.service.viaggi.ViaggioService;
//
//
//
//@RequestMapping("/viaggi/mvc")
//public class UtenteMVC {
//
//	@Autowired
//	private UtenteService uls;
//	
//	@RequestMapping("/viaggio/{id}")
//	String trovaUno(@PathVariable("id")int id) {
//		Utente u = uls.findUserById(id);
//		return "Utente";
//	}

//}