package com.saad.RDMSdemo.repository;

import com.saad.RDMSdemo.model.products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepo extends JpaRepository<products, String> {
}
