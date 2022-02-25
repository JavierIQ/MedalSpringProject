package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal,Integer> {
    int countByCountry(String country);
    int countBySeason(String season);
    int countByCountryAndGender(String country, String season);
    List<GoldMedal> findMedalByCountryAndSeasonByYearAsc(String country, String season);
    List<GoldMedal> findMedalByCountryAndYearAsc(String country);
    List<GoldMedal> findMedalByCountryAndYearDesc(String country);
    List<GoldMedal> findMedalByCountryAndBySeasonAsc(String country);
    List<GoldMedal> findMedalByCountryAndBySeasonDesc(String country);
    List<GoldMedal> findMedalByCountryAndByCityAsc(String country);
    List<GoldMedal> findMedalByCountryAndByCityDesc(String country);
    List<GoldMedal> findMedalByCountryAndByNameAsc(String country);
    List<GoldMedal> findMedalByCountryAndByNameDesc(String country);
    List<GoldMedal> findMedalByCountryAndByEventAsc(String country);
    List<GoldMedal> findMedalByCountryAndByEventDesc(String country);
}
