package com.ken.mybatistest1.service.impl;

import com.ken.mybatistest1.entity.Blog;
import com.ken.mybatistest1.mapper.BlogMapper;
import com.ken.mybatistest1.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceimpl implements BlogService {

    @Autowired
    BlogMapper blogMapper;

    @Override
    public List<Blog> getAll() {
        return blogMapper.getAll();
    }

    @Override
    public Blog getBlog(Integer id) {
        return blogMapper.getBlog(id);
    }

    @Override
    public Integer addBlog(Blog blog) {
        return blogMapper.addBlog(blog);
    }

    @Override
    public Integer updateBlog(Blog blog) {
        return blogMapper.updateBlog(blog);
    }

    @Override
    public Integer deleteBlog(Integer id) {
        return blogMapper.deleteBlog(id);
    }
}
