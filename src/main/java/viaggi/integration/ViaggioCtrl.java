package viaggi.integration;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import viaggi.entities.Viaggio;
//import viaggi.entities.Viaggio;
import viaggi.service.ViaggiService;

@Controller
@RequestMapping("/viaggi")
public class ViaggioCtrl {
	
	@Autowired 
	private ViaggiService vs;
	
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
