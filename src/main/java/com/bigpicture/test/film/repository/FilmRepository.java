package com.bigpicture.test.film.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bigpicture.test.film.bean.Film;

public interface FilmRepository extends JpaRepository<Film, Long>{

}
