package com.example.blogjpa.service.impl;

import com.example.blogjpa.model.Blog;
import com.example.blogjpa.model.Category;
import com.example.blogjpa.repository.IBlogRepository;
import com.example.blogjpa.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public Iterable<Blog> findAllByCategory(Category category) {
        return iBlogRepository.findAllByCategory(category);
    }

    @Override
    public Iterable<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iBlogRepository.deleteById(id);
    }
}
