package com.in28minutes.springin28minutesbook.BookModel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Books {

    @Id
    @GeneratedValue
    private long id;

    private String author;

    private String title;

    private int years;


    public Books() {
    }

    public Books(long id, String author, String title, int year) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.years = years;
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + years +
                '}';
    }
}
