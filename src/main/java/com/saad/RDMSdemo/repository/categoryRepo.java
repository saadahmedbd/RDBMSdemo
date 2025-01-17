package com.saad.RDMSdemo.repository;

import com.saad.RDMSdemo.model.category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoryRepo extends JpaRepository<category, String> {
}
