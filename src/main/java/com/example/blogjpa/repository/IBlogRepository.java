package com.example.blogjpa.repository;

import com.example.blogjpa.model.Blog;
import com.example.blogjpa.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface IBlogRepository extends CrudRepository<Blog, Long> {
    Iterable<Blog> findAllByCategory(Category category);
}
