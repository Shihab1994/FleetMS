package com.shihab.fleetms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shihab.fleetms.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
