package com.ken.mybatistest1.service;

import com.ken.mybatistest1.entity.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> getAll();

    Blog getBlog(Integer id);

    Integer addBlog(Blog blog);

    Integer updateBlog(Blog blog);

    Integer deleteBlog(Integer id);
}
