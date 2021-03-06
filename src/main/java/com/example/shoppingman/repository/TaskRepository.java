package com.example.shoppingman.repository;

import com.example.shoppingman.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface TaskRepository extends CrudRepository<Task,Long> {
    @Override
    List<Task> findAll();

    @Override
    Task save(Task task);

    Optional<Task> findById(Long id);

    void deleteById(Long id);

    @Override
    long count();
}

