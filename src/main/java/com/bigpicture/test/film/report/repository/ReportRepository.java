package com.bigpicture.test.film.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bigpicture.test.film.report.bean.Report;

public interface ReportRepository extends JpaRepository<Report,Long>{
}
