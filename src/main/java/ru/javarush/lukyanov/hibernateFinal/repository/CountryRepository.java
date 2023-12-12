package ru.javarush.lukyanov.hibernateFinal.repository;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.javarush.lukyanov.hibernateFinal.entity.Country;

import java.util.List;
import java.util.Optional;

public class CountryRepository implements Repository <Country>{
    private final SessionFactory sessionFactory;

    public CountryRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<Country> getAll() {
        Query<Country> query = sessionFactory.getCurrentSession().createQuery("select c from Country c join fetch c.languages", Country.class);
        return query.list();
    }

    @Override
    public Integer getAllCount() {
        return null;
    }

    @Override
    public Country save(Country entity) {
        return null;
    }

    @Override
    public Country update(Country entity) {
        return null;
    }

    @Override
    public Country get(int id) {
        return null;
    }

    @Override
    public List<Country> getItems(int offset, int count) {
        return null;
    }

    @Override
    public void delete(Country entity) {

    }
}
