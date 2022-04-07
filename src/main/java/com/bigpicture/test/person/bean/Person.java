package com.bigpicture.test.person.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.bigpicture.test.film.bean.Film;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private int height;
	private int mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
	private String homeworld;
	
	@ElementCollection
	private List<String> films;
	@ElementCollection
	private List<String> species;
	@ElementCollection
	private List<String> vehicles;
	@ElementCollection
	private List<String> starships;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Date created;
	
	private Date edited;
	
	private String url;
	
	public Person() {}

	public Person(long id, String name, int height, int mass, String hair_color, String skin_color, String eye_color,
			String birth_year, String gender, String homeworld, List<String> films, List<String> species,
			List<String> vehicles, List<String> starships, Date created, Date edited, String url) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.hair_color = hair_color;
		this.skin_color = skin_color;
		this.eye_color = eye_color;
		this.birth_year = birth_year;
		this.gender = gender;
		this.homeworld = homeworld;
		this.films = films;
		this.species = species;
		this.vehicles = vehicles;
		this.starships = starships;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getMass() {
		return mass;
	}

	public String getHair_color() {
		return hair_color;
	}

	public String getSkin_color() {
		return skin_color;
	}

	public String getEye_color() {
		return eye_color;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public String getGender() {
		return gender;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public List<String> getFilms() {
		return films;
	}

	public List<String> getSpecies() {
		return species;
	}

	public List<String> getVehicles() {
		return vehicles;
	}

	public List<String> getStarships() {
		return starships;
	}

	public Date getCreated() {
		return created;
	}

	public Date getEdited() {
		return edited;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", height=" + height + ", mass=" + mass + ", hair_color="
				+ hair_color + ", skin_color=" + skin_color + ", eye_color=" + eye_color + ", birth_year=" + birth_year
				+ ", gender=" + gender + ", homeworld=" + homeworld + ", films=" + films + ", species=" + species
				+ ", vehicles=" + vehicles + ", starships=" + starships + ", created=" + created + ", edited=" + edited
				+ ", url=" + url + "]";
	}

	
	
}
