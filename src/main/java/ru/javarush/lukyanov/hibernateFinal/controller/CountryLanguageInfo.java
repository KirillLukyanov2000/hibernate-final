package ru.javarush.lukyanov.hibernateFinal.controller;


import ru.javarush.lukyanov.hibernateFinal.entity.Country;

import java.math.BigDecimal;

public class CountryLanguageInfo {
    public Integer id;

    public Country country;

    public String language;

    public Boolean isOfficial;

    public BigDecimal percentage;
}
