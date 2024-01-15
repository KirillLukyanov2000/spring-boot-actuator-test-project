package ru.lukyanov.repository;

public interface Repo<T> {
    T getById(Long id);

    void update(T entity);
}