package com.alpha.work1;

public class Runner {

    public void run() {
//        Book book1 = new Book();
//        book1.setId(1);
//        book1.setName("Избранные произведения");
//        book1.setAuthor("Роберт Шекли");
//        book1.setPages(752);
//        book1.setPublishing("Библио");
//        book1.setYear(1992);
//        book1.setPrice(500.50);
//
//        book1.view();
//
//        Book book2 = new Book(2, "Осколки космоса", "Роберт Шекли");
//
//        book2.view();
//
//        Book book3 = new Book(3, "Бесконечный вестерн", "Роберт Шекли", "Библио", 1968, 50, 200.0);
//
//        book3.view();

        Book[] books = BooksCreator(10);
        System.out.println("BOOKS:");
        BooksView(books);
        BooksIncreasePrise(books, 10);
        System.out.println("\nBOOK NEW PRICES:");
        BooksView(books);
        System.out.println("\n \"Author3\" BOOKS:");
        ViewAuthersBooks(books, "Author3");
        System.out.println("\n \"Publisher4\" BOOKS:");
        ViewPublishersBooks(books, "Publisher4");
        System.out.println("\n BOOKS AFTER 1965:");
        ViewAfreYearBooks(books, 1965);
    }

    public Book[] BooksCreator(int num){
        Book[] books = new Book[num];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(i,"Книга " + i, "Author" + i, "Publisher" + i, 1960 + i, 100.00*i);
        }
        return books;
    }

    public void BooksView(Book[] books){
        for (Book book : books){
            book.view();
        }
    }

    public void BooksIncreasePrise(Book[] books, double percent){
        for (int i = 0; i < books.length; i++) {
            books[i].setPrice(books[i].getPrice()*(100 + percent)/100);
        }
    }

    public void ViewAuthersBooks(Book[] books, String author){
        for (Book book : books){
            if (book.getAuthor().equals(author)){
                book.view();
            }
        }
    }

    public void ViewPublishersBooks(Book[] books, String publisher){
        for (Book book : books){
            if (book.getPublishing().equals(publisher)){
                book.view();
            }
        }
    }

    public void ViewAfreYearBooks(Book[] books, int year){
        for (Book book : books){
            if (book.getYear() > year){
                book.view();
            }
        }
    }

}
