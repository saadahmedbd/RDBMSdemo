package com.saad.RDMSdemo.repository;

import com.saad.RDMSdemo.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<student, Long> {
}
