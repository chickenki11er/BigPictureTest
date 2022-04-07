package com.bigpicture.test.film.bean;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String title;
	private String episode_id;
	
	@Column(length=100000)
	private String opening_crawl;
	
	private String director;
	private String producer;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date release_date;
	
	@ElementCollection
	private List<String> characters;
	@ElementCollection
	private List<String> planets;
	@ElementCollection
	private List<String> starships;
	@ElementCollection
	private List<String> vehicles;
	@ElementCollection
	private List<String> species;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Date created;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Date edited;
	
	private String url;
	
	
	public Film() {}


	public Film(long id, String title, String episode_id, String opening_crawl, String director, String producer,
			Date release_date, List<String> characters, List<String> planets, List<String> starships,
			List<String> vehicles, List<String> species, Date created, Date edited, String url) {
		super();
		this.id = id;
		this.title = title;
		this.episode_id = episode_id;
		this.opening_crawl = opening_crawl;
		this.director = director;
		this.producer = producer;
		this.release_date = release_date;
		this.characters = characters;
		this.planets = planets;
		this.starships = starships;
		this.vehicles = vehicles;
		this.species = species;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}


	public long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getEpisode_id() {
		return episode_id;
	}


	public String getOpening_crawl() {
		return opening_crawl;
	}


	public String getDirector() {
		return director;
	}


	public String getProducer() {
		return producer;
	}


	public Date getRelease_date() {
		return release_date;
	}


	public List<String> getCharacters() {
		return characters;
	}


	public List<String> getPlanets() {
		return planets;
	}


	public List<String> getStarships() {
		return starships;
	}


	public List<String> getVehicles() {
		return vehicles;
	}


	public List<String> getSpecies() {
		return species;
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
		return "Film [id=" + id + ", title=" + title + ", episode_id=" + episode_id + ", opening_crawl=" + opening_crawl
				+ ", director=" + director + ", producer=" + producer + ", release_date=" + release_date
				+ ", characters=" + characters + ", planets=" + planets + ", starships=" + starships + ", vehicles="
				+ vehicles + ", species=" + species + ", created=" + created + ", edited=" + edited + ", url=" + url
				+ "]";
	}


	
}
