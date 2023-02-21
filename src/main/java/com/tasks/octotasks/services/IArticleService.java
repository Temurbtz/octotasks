package com.tasks.octotasks.services;

import com.tasks.octotasks.entities.Article;

import java.util.List;

public interface IArticleService {

    Article saveArticle(Article article);

    List<Article> fetchListOfArticles();

    Article fetchArticleById(Long Id);

    void deleteArticleById(Long Id);

    Article updateArticleById(Long Id, Article article);

}
