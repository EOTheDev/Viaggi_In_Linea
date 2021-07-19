package viaggi.integration;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import viaggi.entities.Prenotazione;
import viaggi.entities.Utente;
import viaggi.entities.Viaggio;
import viaggi.service.PrenotazioneService;
import viaggi.service.UtenteService;
//import viaggi.entities.Viaggio;
import viaggi.service.ViaggiService;

@Controller
@RequestMapping("/viaggi")
public class ViaggioCtrl {
	
	@Autowired 
	private ViaggiService vs;
	@Autowired
	private UtenteService us;
	@Autowired
	private PrenotazioneService ps;
	
	@PostMapping(value = "/prenotazione")
	public ModelAndView creaPrenotazione(Model m,
			@RequestParam int idViaggio,
			@RequestParam int persone,
			@RequestParam String nome,
			@RequestParam String cognome,
			@RequestParam String email,
			@RequestParam String cartaCredito
			) {
		Utente u = new Utente();
		u.setCartaCredito(cartaCredito);
		u.setCognome(cognome);
		u.setNome(nome);
		u.setPassword("123456");
		u.setEmail(email);
		u= us.addUser(u);
		
		Prenotazione p =new Prenotazione();
		System.out.println(persone+" persone");
		System.out.println(u.getCognome()+" utente");
		p.setPersone(persone);
		p.setUtente(u);
		p.setViaggio(vs.findTripById(idViaggio));
		
		p=ps.addPrenotazione(p);
		System.out.println("ho creato la prenotazione");
		
		
		m.addAttribute("prenotazione", p);
		m.addAttribute("viaggio", vs.findTripById(idViaggio));
		m.addAttribute("utente", u);
		return new ModelAndView("ricevutaAcquisto");
	}


	@PostMapping(value = "/annulla")
	public ModelAndView annulla() {
		System.out.println("sono in annulla");
		return new ModelAndView("annullamento");
	}
	
	@PostMapping(value = "/acquisto")
	public ModelAndView acq(Model m, @RequestParam int id) {
		m.addAttribute("viaggio", vs.findTripById(id));
		System.out.println("sono in acquisto");
		return new ModelAndView("av");
	}


	@GetMapping("")
	public String elenco(Model model) {
		
		model.addAttribute("viaggi", vs.findAllTrips());
		
		return "viaggi";
//		return "prova";
	}

}
