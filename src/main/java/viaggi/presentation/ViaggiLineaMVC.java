package viaggi.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import viaggi.entities.Viaggio;
import viaggi.service.ViaggiService;

@RequestMapping("/viaggi/mvc")
public class ViaggiLineaMVC {

	@Autowired
	private ViaggiService vls;
	
	@RequestMapping("/viaggio/{id}")
	String trovaUno(@PathVariable("id")int id) {
		Viaggio v = vls.findTripById(id);
		return "Utente";
	}

}