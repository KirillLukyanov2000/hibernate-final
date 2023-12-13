package ru.javarush.lukyanov.hibernateFinal.controller;

import ru.javarush.lukyanov.hibernateFinal.entity.CountryLanguage;

import static java.util.Objects.isNull;

public class CountryLanguageController {
    private final CountryLanguage countryLanguage;

    public CountryLanguageController(CountryLanguage countryLanguage) {
        this.countryLanguage = countryLanguage;
    }

    private static CountryLanguageInfo toCountryLanguageInfo(CountryLanguage countryLanguage) {
        if (isNull(countryLanguage)) return null;

        CountryLanguageInfo result = new CountryLanguageInfo();
        result.id = countryLanguage.getId();
        result.language = countryLanguage.getLanguage();
        result.country = countryLanguage.getCountry();
        result.isOfficial = countryLanguage.getOfficial();
        result.percentage = countryLanguage.getPercentage();
        return result;
    }
}
