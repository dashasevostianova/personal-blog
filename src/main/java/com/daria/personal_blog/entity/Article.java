package com.daria.personal_blog.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "articles")
public class Article {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String title;
    private String shortDescription;
    private String articleText;
    private LocalDate creationDate;

    public Article() {
    }

    public Article(int id, String title, String shortDescription, String articleText, LocalDate creationDate) {
        this.id = id;
        this.title = title;
        this.shortDescription = shortDescription;
        this.articleText = articleText;
        this.creationDate = creationDate;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getArticleText() {
        return this.articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    public LocalDate getCreationDate() {
        return this.creationDate;
    }
}