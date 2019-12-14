package com.springboot.videogame;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideogameController {
	
	@Autowired
	private VideogameService videogameService;
	
	//CRUD operations
	
	@RequestMapping("/videogames")
	public List<Videogame> getAllVideogames() {
		return videogameService.getAllVideogames();
	}

	@RequestMapping("/videogames/{id}")
	public Videogame getVideogame(@PathVariable String id) {
		return videogameService.getVideogame(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/videogames")
	public void addVideogame(@RequestBody Videogame videogame) {
		videogameService.addVideogame(videogame);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/videogames/{id}")
	public void updateVideogame(@RequestBody Videogame videogame, @PathVariable String id ) {
		videogameService.updateVideogame(id, videogame);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/videogames/{id}")
	public void deleteVideogame(@PathVariable String id) {
		videogameService.deleteVideogame(id);
	}
	
	
	
}
