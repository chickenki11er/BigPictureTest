package com.bigpicture.test.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bigpicture.test.result.bean.Result;

public interface ResultRepository extends JpaRepository<Result,Long>{

}
