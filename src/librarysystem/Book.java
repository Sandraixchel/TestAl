/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem;

/**
 *
 * @author KAREN
 */
public class Book {
    
    //PROPERTIES
    protected String id;
    protected String author_first;
    protected String author_last;
    protected String book_title;
    protected String genre;
    
    //CONSTRUCTORS

    public Book(String id, String author_first, String author_last, String book_title, String genre) {
        this.id = id;
        this.author_first = author_first;
        this.author_last = author_last;
        this.book_title = book_title;
        this.genre = genre;
    }
    
    
    //METHODS

    public String getId() {
        return id;
    }

    public String getAuthor_first() {
        return author_first;
    }

    public String getAuthor_last() {
        return author_last;
    }

    public String getBook_title() {
        return book_title;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" + "ID= " + id + "\n, Author Name= " + author_first + "\n, Author Last Name= " + author_last + "\n, Book Title=" + book_title + "\n, Genre=" + genre + '}';
    }


    
    
   
    
    
}
