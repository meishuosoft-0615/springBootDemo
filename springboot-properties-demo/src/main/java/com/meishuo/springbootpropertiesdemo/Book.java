package com.meishuo.springbootpropertiesdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @title 实体类
 * @author Meishuosoft
 * @date Created 2020-12-31 2:28
 */
@Component
@PropertySource(value = "classpath:book.properties")
@ConfigurationProperties("book")
public class Book {
    private String name;
    private String author;
    private Float price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
