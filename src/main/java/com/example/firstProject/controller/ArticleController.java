package com.example.firstProject.controller;

import com.example.firstProject.dto.ArticleForm;
import com.example.firstProject.entity.Article;
import com.example.firstProject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j //logging
public class ArticleController {
    @Autowired // feature of spring framework enables you to inject the object dependency implicitly
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticleForm(ArticleForm form){
        log.info(form.toString());
        //System.out.println(form.toString());


        // transfer dto to entity
        Article article = form.toEntity();
        log.info(article.toString());
        //System.out.println(article.toString());

        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        //System.out.println(saved.toString());


        return "";
    }
}
