package ru.javarush.lukyanov.hibernateFinal.repository;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    List<T> getAll();

    Integer getAllCount();

    T save(T entity);

    T update(T entity);

    Optional<T> get(long id);

    List<T> getItems(int offset, int count);

    void delete(T entity);
}
