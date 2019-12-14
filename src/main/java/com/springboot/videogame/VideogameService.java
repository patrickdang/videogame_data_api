package com.springboot.videogame;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideogameService {
	
	@Autowired
	private VideogameRepository videogameRepository;
	
	
	//Implementing CRUD operations (GET, POST, PUT, DELETE)
	
	public List<Videogame> getAllVideogames() {
		List<Videogame> videogames = new ArrayList<>();
		videogameRepository.findAll().forEach(videogames::add);
		return videogames;
	}
	
	public Videogame getVideogame(String id) {
		return videogameRepository.findById(id).get();
	}
	
	public void addVideogame(Videogame videogame) {
		videogameRepository.save(videogame);
	}
	
	public void updateVideogame(String id, Videogame videogame) {
		videogameRepository.save(videogame);
	}
	
	public void deleteVideogame(String id) {
		videogameRepository.deleteById(id);
	}
	
	
	
	
	//Save user input for videogame from HTML form page, creatVideogame.jsp
	public Videogame saveVideogame(Videogame videogame) {
		return videogameRepository.save(videogame);
	}
	
	
}
