package com.samplethymeleafdemo.demothyme.repository;

import com.samplethymeleafdemo.demothyme.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {
}
