package ru.javarush.lukyanov.hibernateFinal.controller;

import ru.javarush.lukyanov.hibernateFinal.entity.Country;
import ru.javarush.lukyanov.hibernateFinal.service.CountryService;

import static java.util.Objects.isNull;

public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    private static CountryInfo toCountryInfo(Country country) {
        if (isNull(country)) return null;

        CountryInfo result = new CountryInfo();
        result.id = country.getId();
        result.name = country.getName();
        result.localName = country.getLocalName();
        result.code = country.getCode();
        result.code2 = country.getCode2();
        result.continent = country.getContinent();
        result.gnp = country.getGnp();
        result.gnpoId = country.getGnpoId();
        result.governmentForm = country.getGovernmentForm();
        result.independenceYear = country.getIndependenceYear();
        result.lifeExpectancy = country.getLifeExpectancy();
        result.headOfState = country.getHeadOfState();
        result.region = country.getRegion();
        result.surfaceArea = country.getSurfaceArea();
        result.population = country.getPopulation();
        result.city = country.getCity();
        result.languages = country.getLanguages();
        return result;
    }
}
