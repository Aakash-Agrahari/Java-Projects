package com.company;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book; //At this POT we have 0 book and name of books are set from 'book'.
        no_of_books++;                  // From here book starts to increase as per we add.
        System.out.println(book + " has been added to the Library.");
    }

    void showAvailableBook(){
        System.out.println("These are the list of available books in the Library:");
        for(String book : this.books){
            if(book==null){ //It is required to use this else it will show null as it iterates the array.
                continue;
            }
            System.out.println("*" + book);
        }
    }

    void issueBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println(book + " has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist.");
    }

    void returnBook(String book){
        addBook(book); //It is same like addBook method so, we used it instead of this.books[no_of_books]=book
    }

}

public class Java_Online_Library {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Fundamentals of Java");
        centralLibrary.addBook("Basics of C++");
        centralLibrary.addBook("Microprocessor");
        centralLibrary.addBook("Advanced Java");
        centralLibrary.addBook("Economics of Software Industry");
        centralLibrary.showAvailableBook();

        centralLibrary.issueBook("Economics of Software Industry");
        centralLibrary.showAvailableBook();
        centralLibrary.returnBook("Economics of Software Industry");
        centralLibrary.showAvailableBook();

    }
}
