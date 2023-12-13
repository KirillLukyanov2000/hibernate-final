package ru.javarush.lukyanov.hibernateFinal.repository;


import java.util.List;


public interface Repository<T> {
    List<T> getAll();

    Integer getAllCount();

    T save(T entity);

    T update(T entity);

    T get(int id);

    List<T> getItems(int offset, int count);

    void delete(T entity);
}
