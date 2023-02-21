package com.tasks.octotasks.controllers;

import com.tasks.octotasks.entities.Article;
import com.tasks.octotasks.services.ArticleService;


import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
public class ArticleController {
    Logger logger = LoggerFactory.getLogger(ArticleController.class);
    @Autowired
    private ArticleService service;

    @PostMapping("/articles")
    public Article saveArticle(@RequestBody Article Article) {
        logger.info(String.format("Hitted articlecontroller saveArticle method in %s",new Date()));
        return service.saveArticle(Article);
    }

    @GetMapping("/articles")
    public List<Article> fetchArticleList() {
        logger.info(String.format("Hitted articlecontroller fetchArticleList method in %s",new Date()));
        return service.fetchListOfArticles();
    }


    @DeleteMapping("/articles/{id}")
    public void deleteArticle(@PathVariable("id") Long ArticleId) {
        logger.info(String.format("Hitted articlecontroller deleteArticle method in %s",new Date()));
        service.deleteArticleById(ArticleId);
    }

    @GetMapping("/articles/{id}")
    public Article getArticleById(@PathVariable("id") Long ArticleId) {
        logger.info(String.format("Hitted articlecontroller getArticleById method in %s",new Date()));
        return service.fetchArticleById(ArticleId);
    }

    @PutMapping("/articles/{id}")
    public Article updateArticle(@PathVariable("id") Long ArticleId, @RequestBody Article Article) {
        logger.info(String.format("Hitted articlecontroller updateArticle method in %s",new Date()));
        return service.updateArticleById(ArticleId, Article);
    }

}
