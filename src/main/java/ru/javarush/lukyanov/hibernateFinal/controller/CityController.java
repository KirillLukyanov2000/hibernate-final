package ru.javarush.lukyanov.hibernateFinal.controller;

import ru.javarush.lukyanov.hibernateFinal.entity.City;
import ru.javarush.lukyanov.hibernateFinal.service.CityService;

import static java.util.Objects.isNull;


public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    private static CityInfo toCityInfo(City city) {
        if (isNull(city)) return null;

        CityInfo result = new CityInfo();
        result.id = city.getId();
        result.name = city.getName();
        result.population = city.getPopulation();
        result.country = city.getCountry();
        result.district = city.getDistrict();

        return result;
    }
}
