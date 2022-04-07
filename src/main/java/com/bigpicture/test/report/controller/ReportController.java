package com.bigpicture.test.report.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bigpicture.test.film.bean.Film;
import com.bigpicture.test.film.repository.FilmRepository;
import com.bigpicture.test.person.bean.Person;
import com.bigpicture.test.person.repository.PersonRepository;
import com.bigpicture.test.planet.bean.Planet;
import com.bigpicture.test.planet.repository.PlanetRepository;
import com.bigpicture.test.report.bean.Report;
import com.bigpicture.test.report.repository.ReportRepository;
import com.bigpicture.test.result.bean.Result;
import com.bigpicture.test.result.repository.ResultRepository;

@RestController
public class ReportController {
	
	@Autowired
	public FilmRepository filmRepo;
	
	@Autowired
	public PlanetRepository planetRepo;
	
	@Autowired
	public PersonRepository personRepo;
	
	@Autowired
	public ReportRepository reportRepo;
	
	@Autowired
	public ResultRepository resultRepo;
	
	@GetMapping("/reports")
	public List<Report> getReports(){
		return reportRepo.findAll();
	}
	
	@GetMapping("/reports/{id}")
	public Report getReport(@PathVariable long id) {
		Optional<Report> report=reportRepo.findById(id);
		
		return report.get();
	}
	
	@PutMapping("/reports/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void createReport(@RequestBody Report report,@PathVariable long id) {
		
		List<Film> filmAll=filmRepo.findAll();
		List<Person> peopleAll=personRepo.findAll();
		List<Planet> planetAll=planetRepo.findAll();
		
		List<Person> matchedPeople=new ArrayList<Person>();
		
		
		
		List<Result> result=new ArrayList<Result>();
		
		//get matched people
		for (Person item:peopleAll) {
			if(item.getName().toLowerCase().contains(report.getQuery_criteria_character_phrase().toLowerCase()))
				matchedPeople.add(item);
			
		}
		
		//get films
		for(Person item:matchedPeople) {
			for(Planet item2:planetAll) {
				if (item.getHomeworld().equals(item2.getUrl())) {
					for (Film item3:filmAll) {
						for (String item4:item3.getCharacters()) {
							if(item.getUrl().equals(item4)) {
								result.add(new Result(item3.getId(),item3.getTitle(),
										item.getId(),item.getName(),item2.getId(),item2.getName(),
										report));
							}
						}
					}
				}
			}
						
		}
		

		report.setId(id);
		//clear all results from previous search
		List<Result> resultAll=resultRepo.findAll();
		for(Result item:resultAll) {
			if(item.getReport().getId()==id)
				resultRepo.deleteById(item.getId());
			}
		
		report.setResult(result);
		reportRepo.save(report);
	}
	
	@DeleteMapping("/reports/{id}")
	public void deleteReport(@PathVariable long id) {
		reportRepo.deleteById(id);
	}
	
	@DeleteMapping("/reports")
	public void deleteReports() {
		reportRepo.deleteAll();
	}

	
//////////////////////////////////////
	@GetMapping("/films")
	public List<Film> getFilm(){
		return filmRepo.findAll();
	}
	
	@PostMapping("/films")
	public void createFilm(@RequestBody Film film) {
		filmRepo.save(film);
	}
	
	@GetMapping("/planets")
	public List<Planet> getPlanets(){
		return planetRepo.findAll();
	}
	
	@PostMapping("/planets")
	public void createPlanet(@RequestBody Planet planet) {
		planetRepo.save(planet);
	}
	
	@GetMapping("/people")
	public List<Person> getPeople(){
		return personRepo.findAll();
	}
	
	@PostMapping("/people")
	public void createPerson(@RequestBody Person person) {
		personRepo.save(person);
	}
	
	
}
