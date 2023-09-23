package ru.education.project.entity;

public class Book {

    private int id;
    private String title;
    private String author;
    private int yearOfCreate;

    public Book() {

    }

    public Book(int id, String title, String author, int yearOfCreate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfCreate = yearOfCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfCreate() {
        return yearOfCreate;
    }

    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfCreate=" + yearOfCreate +
                '}';
    }
}
