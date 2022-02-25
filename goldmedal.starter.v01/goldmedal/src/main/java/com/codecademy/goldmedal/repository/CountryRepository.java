package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Integer> {
    Optional <Country> findCountryByName(String name);
    List<Country> findCountriesByNameAsc();
    List<Country> findCountriesByNameDesc();
    List<Country> findCountriesByGDPAsc();
    List<Country> findCountriesByGDPDesc();
    List<Country> findCountriesByPopulationAsc();
    List<Country> findCountriesByPopulationDesc();
    List<Country> findCountriesByMedalsAsc();
    List<Country> findCountriesByMedalsDesc();
}
