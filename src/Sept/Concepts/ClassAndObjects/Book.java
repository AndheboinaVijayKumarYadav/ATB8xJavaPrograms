package Sept.Concepts.ClassAndObjects;

public class Book {
    static int totalBooks;
    // below code block will run one time once the class is loaded
    static {
        totalBooks = 0;
    }

   // below code block will run each time new instance/object is created for Book class
    {
        totalBooks++;
    }
    static int getTotalBooks(){
        return totalBooks;
    }

    String title;
    String author;
    String isbn;

    // Constructor
    Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void borrowBook(){
        System.out.println("Book is borrowed");
    }

    public void returnBook(){
        System.out.println("Return Book");
    }
}
