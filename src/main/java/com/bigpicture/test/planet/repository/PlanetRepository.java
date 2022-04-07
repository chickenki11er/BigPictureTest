package com.bigpicture.test.planet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bigpicture.test.planet.bean.Planet;

public interface PlanetRepository extends JpaRepository<Planet,Long>{

}
