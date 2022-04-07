package com.bigpicture.test.report.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bigpicture.test.result.bean.Result;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Report {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String query_criteria_character_phrase;
	private String query_criteria_planet_name;
	
	@OneToMany(mappedBy="report",cascade = CascadeType.ALL)
	private List<Result> result;
	
	public Report() {}

	public Report(long id, String query_criteria_character_phrase, String query_criteria_planet_name,
			List<Result> result) {
		super();
		this.id = id;
		this.query_criteria_character_phrase = query_criteria_character_phrase;
		this.query_criteria_planet_name = query_criteria_planet_name;
		this.result = result;
	}

	public long getId() {
		return id;
	}

	public String getQuery_criteria_character_phrase() {
		return query_criteria_character_phrase;
	}

	public String getQuery_criteria_planet_name() {
		return query_criteria_planet_name;
	}

	public List<Result> getResult() {
		return result;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}

	public void setQuery_criteria_character_phrase(String query_criteria_character_phrase) {
		this.query_criteria_character_phrase = query_criteria_character_phrase;
	}

	public void setQuery_criteria_planet_name(String query_criteria_planet_name) {
		this.query_criteria_planet_name = query_criteria_planet_name;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}
	

	@Override
	public String toString() {
		return "Report [id=" + id + ", query_criteria_character_phrase=" + query_criteria_character_phrase
				+ ", query_criteria_planet_name=" + query_criteria_planet_name + ", result=" + result + "]";
	}



}
