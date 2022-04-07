package com.bigpicture.test.planet.bean;

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

@Entity
public class Planet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private int rotation_period;
	private int orbital_period;
	private Long diameter;
	private String climate;
	private String gravity;
	private String terrain;
	private String surface_water;
	private String population;
	
	@ElementCollection
	private List<String> residents;
	@ElementCollection
	private List<String> films;

	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Date created;
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Date edited;
	
	private String url;
	
	public Planet() {}

	public Planet(long id, String name, Integer rotation_period, Integer orbital_period, Long diameter, String climate,
			String gravity, String terrain, String surface_water, String population, List<String> residents,
			List<String> films, Date created, Date edited, String url) {
		super();
		this.id = id;
		this.name = name;
		this.rotation_period = rotation_period;
		this.orbital_period = orbital_period;
		this.diameter = diameter;
		this.climate = climate;
		this.gravity = gravity;
		this.terrain = terrain;
		this.surface_water = surface_water;
		this.population = population;
		this.residents = residents;
		this.films = films;
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

	public Integer getRotation_period() {
		return rotation_period;
	}

	public Integer getOrbital_period() {
		return orbital_period;
	}

	public Long getDiameter() {
		return diameter;
	}

	public String getClimate() {
		return climate;
	}

	public String getGravity() {
		return gravity;
	}

	public String getTerrain() {
		return terrain;
	}

	public String isSurface_water() {
		return surface_water;
	}

	public String getPopulation() {
		return population;
	}

	public List<String> getResidents() {
		return residents;
	}

	public List<String> getFilms() {
		return films;
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
		return "Planet [id=" + id + ", name=" + name + ", rotation_period=" + rotation_period + ", orbital_period="
				+ orbital_period + ", diameter=" + diameter + ", climate=" + climate + ", gravity=" + gravity
				+ ", terrain=" + terrain + ", surface_water=" + surface_water + ", population=" + population
				+ ", residents=" + residents + ", films=" + films + ", created=" + created + ", edited=" + edited
				+ ", url=" + url + "]";
	};
	
	
}
