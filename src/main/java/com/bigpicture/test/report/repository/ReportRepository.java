package com.bigpicture.test.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bigpicture.test.report.bean.Report;

public interface ReportRepository extends JpaRepository<Report,Long>{
}
