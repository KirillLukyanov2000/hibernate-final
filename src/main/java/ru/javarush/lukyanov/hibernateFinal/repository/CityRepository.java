package ru.javarush.lukyanov.hibernateFinal.repository;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.javarush.lukyanov.hibernateFinal.entity.City;

import java.util.List;
import java.util.Optional;

public class CityRepository implements Repository <City>{
    private final SessionFactory sessionFactory;
    public CityRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<City> getAll() {
        return null;
    }

    @Override
    public Integer getAllCount() {
        Query<Long> query = sessionFactory.getCurrentSession().createQuery("select count(c) from City c", Long.class);
        return Math.toIntExact(query.uniqueResult());
    }

    @Override
    public City save(City entity) {
        return null;
    }

    @Override
    public City update(City entity) {
        return null;
    }

    @Override
    public Optional<City> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<City> getItems(int offset, int count) {
        Query<City> query = sessionFactory.getCurrentSession().createQuery("select c from City c", City.class);
        query.setFirstResult(offset);
        query.setMaxResults(count);
        return query.list();
    }

    @Override
    public void delete(City entity) {

    }
}
