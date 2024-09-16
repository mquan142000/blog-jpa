package com.example.blogjpa.service;

import com.example.blogjpa.model.Blog;
import com.example.blogjpa.model.Category;

public interface IBlogService extends IGenerateService<Blog> {
    Iterable<Blog> findAllByCategory(Category category);
}
