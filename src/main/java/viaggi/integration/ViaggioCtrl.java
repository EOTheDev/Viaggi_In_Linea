package viaggi.integration;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import viaggi.entities.Viaggio;
import viaggi.service.ViaggiService;

@Controller
@RequestMapping("/api/viaggi")
public class ViaggioCtrl {
	
	@Autowired
	private ViaggiService vs;
		
	@GetMapping("")
	public String elenco(Model model) {
		
		model.addAttribute("viaggi", vs.findAllTrips());
	
//		return "elencoViaggi";
		return "prova";
	}

}
