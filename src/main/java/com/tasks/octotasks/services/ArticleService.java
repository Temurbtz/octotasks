package com.tasks.octotasks.services;

import com.tasks.octotasks.entities.Article;
import com.tasks.octotasks.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleRepository ArticleRepository;

    @Override
    public Article saveArticle(Article Article) {
        return ArticleRepository.save(Article);
    }

    @Override
    public List<Article> fetchListOfArticles() {
        return ArticleRepository.findAll();
    }

    @Override
    public Article fetchArticleById(Long Id) {
        return ArticleRepository.findById(Id).get();
    }

    @Override
    public void deleteArticleById(Long Id) {
        ArticleRepository.deleteById(Id);
    }

    @Override
    public Article updateArticleById(Long Id, Article Article) {
        Article ArticleDb = ArticleRepository.findById(Id).get();
        ArticleDb.setTitle(Article.getTitle());
        ArticleDb.setText(Article.getText());
        return ArticleRepository.save(ArticleDb);
    }

}
