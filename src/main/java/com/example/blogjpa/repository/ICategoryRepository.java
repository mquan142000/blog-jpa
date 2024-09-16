package com.example.blogjpa.repository;

import com.example.blogjpa.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category, Long> {
}
