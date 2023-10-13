package com.softtech.backendapi.shared.service;

import com.softtech.backendapi.shared.domain.service.CrudService;
import com.softtech.backendapi.shared.exception.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public abstract class CrudServiceImpl<T> implements CrudService<T> {
//    @Autowired
//    private JpaRepository<T, Integer> repository;

    protected abstract JpaRepository<T, Integer> getRepository();

    @Transactional(readOnly = true)
    @Override
    public List<T> getAll() {
        return getRepository().findAll();
    }

//    @Transactional(readOnly = true)
//    @Override
//    public List<T> getAll() {
//        return repository.findAll();
//    }

    @Transactional(readOnly = true)
    @Override
    public Optional<T> getById(Integer id) {
        if (getRepository().existsById(id)){
            return getRepository().findById(id);
        }
        else {
            throw new ResourceNotFoundException("Entity", id);
        }
    }

    @Transactional
    @Override
    public T save(T entity) {
        return getRepository().save(entity);
    }

    @Transactional
    @Override
    public T update(T entity) {
        return getRepository().save(entity);
    }

    @Transactional
    @Override
    public boolean deleteById(Integer id) {
        if (getRepository().existsById(id)){
            getRepository().deleteById(id);
            return true;
        } else{
            return false;
        }
    }
}