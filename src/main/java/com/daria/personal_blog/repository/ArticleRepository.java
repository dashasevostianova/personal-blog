package com.daria.personal_blog.repository;

import org.springframework.data.repository.CrudRepository;
import com.daria.personal_blog.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
