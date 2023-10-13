package com.softtech.backendapi.shared.domain.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T>{
    List<T> getAll();
    Optional<T> getById(Integer id);
    T save(T entity);
    T update(T entity);
    boolean deleteById(Integer id);
}
