package com.bigpicture.test.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bigpicture.test.person.bean.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{

}
