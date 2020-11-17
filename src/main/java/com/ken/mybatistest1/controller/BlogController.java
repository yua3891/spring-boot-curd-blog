package com.ken.mybatistest1.controller;

import com.ken.mybatistest1.entity.Blog;
import com.ken.mybatistest1.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Blog> list = blogService.getAll();
        model.addAttribute("list", list);
        return "/getAll";
    }

    @RequestMapping("/addBlog")
    public String addBlog(Model model, @RequestParam(name = "id", defaultValue = "0", required = false) Integer id) {
        if(id > 0) {
            Blog blog = blogService.getBlog(id);
            model.addAttribute("blog", blog);
        }
        return "/addBlog";
    }

    @RequestMapping(value = "/blogSuccess", method = RequestMethod.POST)
    public String blogSuccess(Model model, Blog blog) {
        if(blog.getId() > 0) {
            blogService.updateBlog(blog);
        } else {
            blogService.addBlog(blog);
        }
        return "/common/blogSuccess";
    }

    @RequestMapping(value = "/deleteBlog", method = RequestMethod.GET)
    public String deleteBlog(Model model, @RequestParam Integer id) {
        model.addAttribute("msg", "删除");
        blogService.deleteBlog(id);
        return "common/blogSuccess";
    }
}
