package com.company;
import java.util.*;

class Book{
    public String name, author;

    public Book(String name,String author){
        this.name = name;
        this.author = author;
    }

    public String toString(){
        return "Book{"+
                "name='" + name + '\'' +
                " author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library.");
        this.books.add(book);
    }
    public void issueBook(Book book, String issue_to){
        System.out.println("The book has been issued from the Library to " + issue_to+".");
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has returned.");
        this.books.add(b);
    }
}
public class Java_LMC {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Basics of Java", "Mr.XYZ");
        bk.add(b1);
        Book b2 = new Book("Basics of C++", "Mr.MNP");
        bk.add(b2);
        Book b3 = new Book("React.JS", "Mr.KLR");
        bk.add(b3);
        Book b4 = new Book("Software Engineering", "Mr.ABC");
        bk.add(b4);

        MyLibrary ml = new MyLibrary(bk);
        ml.addBook(new Book("Software Entrepreneurship","Mr.DEF"));
        System.out.println(ml.books);
        ml.issueBook(b4, "Aakash");
    }
}
