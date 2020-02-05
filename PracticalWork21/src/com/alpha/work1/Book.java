package com.alpha.work1;

public class Book {

    private Integer id;
    private String name;
    private String author;
    private String publishing;
    private Integer year;
    private Integer pages;
    private double price;

    public Book() {
    }

    public Book(Integer id, String name, String author, String publishing, Integer year, Integer pages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public Book(Integer id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Book(Integer id, String name, String author, String publishing, int year, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void view(){
        if (this.id != null){
            System.out.println(this.id);
        }
        if (this.name != null){
            System.out.println(this.name);
        }
        if (this.author != null){
            System.out.println(this.author);
        }
        if (this.publishing != null){
            System.out.println(this.publishing);
        }
        if (this.year != null){
            System.out.println(this.year);
        }
        if (this.pages != null){
            System.out.println(this.pages);
        }
        if (this.price != 0.0){
            System.out.println(this.price);
        }
    }

}
