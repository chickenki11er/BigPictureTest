package com.bigpicture.test.result.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.bigpicture.test.report.bean.Report;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Result {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private long film_id;
	private String film_name;
	private long character_id;
	private String character_name;
	private long planet_id;
	private String planet_name;
	
	@ManyToOne
	@JoinColumn(name="report_id")
	private Report report;
	
	public Result() {}

	public Result(long film_id, String film_name, long character_id, String character_name, long planet_id,
			String planet_name, Report report) {
		super();
		this.film_id = film_id;
		this.film_name = film_name;
		this.character_id = character_id;
		this.character_name = character_name;
		this.planet_id = planet_id;
		this.planet_name = planet_name;
		this.report=report;
	}

	@JsonIgnore
	public long getId() {
		return id;
	}

	public long getFilm_id() {
		return film_id;
	}

	public String getFilm_name() {
		return film_name;
	}

	public long getCharacter_id() {
		return character_id;
	}

	public String getCharacter_name() {
		return character_name;
	}

	public long getPlanet_id() {
		return planet_id;
	}

	public String getPlanet_name() {
		return planet_name;
	}

	@JsonIgnore
	public Report getReport() {
		return report;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", film_id=" + film_id + ", film_name=" + film_name + ", character_id="
				+ character_id + ", character_name=" + character_name + ", planet_id=" + planet_id + ", planet_name="
				+ planet_name + ", report=" + report + "]";
	};
	
	
}
