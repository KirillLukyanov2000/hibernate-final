package ru.javarush.lukyanov.hibernateFinal.controller;


import ru.javarush.lukyanov.hibernateFinal.entity.City;
import ru.javarush.lukyanov.hibernateFinal.entity.Continent;
import ru.javarush.lukyanov.hibernateFinal.entity.CountryLanguage;

import java.math.BigDecimal;
import java.util.Set;

public class CountryInfo {
    public Integer id;

    public String code;

    public String code2;

    public String name;

    public Continent continent;

    public String region;

    public BigDecimal surfaceArea;

    public Short independenceYear;

    public Integer population;

    public BigDecimal lifeExpectancy;

    public BigDecimal gnp;

    public BigDecimal gnpoId;

    public String localName;

    public String governmentForm;

    public String headOfState;

    public City city;

    public Set<CountryLanguage> languages;
}
