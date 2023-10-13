package com.softtech.backendapi.shared.service;

import com.softtech.backendapi.shared.domain.service.CrudService;
import com.softtech.backendapi.shared.exception.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;



@Service
@AllArgsConstructor
public abstract class CrudServiceImpl<T> implements CrudService<T> {

//    @Autowired
    protected JpaRepository<T,Integer> repository;
    @Transactional(readOnly = true)
    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<T> getById(Integer id) {
        if (repository.existsById(id)){
            return repository.findById(id);
        }
        else {
            throw new EntityNotFoundException("No exist");
        }
    }

    @Transactional
    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Transactional
    @Override
    public T update(T entity) {
        return repository.save(entity);
    }

    @Transactional
    @Override
    public boolean deleteById(Integer id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        } else{
            return false;
        }
    }
}
