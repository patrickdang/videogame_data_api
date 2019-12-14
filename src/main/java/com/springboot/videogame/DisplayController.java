package com.springboot.videogame;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DisplayController {
	
	@Autowired
	VideogameService videogameService;
	
	
	//Display on screen methods
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createVideogame";
	}
	
	@RequestMapping("/saveVG")
	public String saveVideogame(@ModelAttribute("videogame") Videogame videogame, ModelMap modelMap ) {
		Videogame videogameSaved = videogameService.saveVideogame(videogame);
		String msg = "Videogame added: " + videogameSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createVideogame";
	}
	
	@RequestMapping("/displayVG")
	public String displayVideogames(ModelMap modelMap) {
		List<Videogame> videogames = videogameService.getAllVideogames();
		modelMap.addAttribute("videogames", videogames);
		return "displayVideogames";
	}
	
	@RequestMapping("/deleteVG")
	public String deleteVideogame(@RequestParam("id") String id, ModelMap modelMap) {
		videogameService.deleteVideogame(id);
		List<Videogame> videogames = videogameService.getAllVideogames();
		modelMap.addAttribute("videogames", videogames);
		return "displayVideogames";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") String id, ModelMap modelMap) {
		Videogame videogame = videogameService.getVideogame(id);
		modelMap.addAttribute("videogame", videogame);
		return "updateVideogame";
	}
	
	@RequestMapping("/updateVG")
	public String updateVideogame(@ModelAttribute("videogame") Videogame videogame, ModelMap modelMap) {
		videogameService.saveVideogame(videogame);
		List<Videogame> videogames = videogameService.getAllVideogames();
		modelMap.addAttribute("videogames", videogames);
		return "displayVideogames";
		
	}
	
	
}
