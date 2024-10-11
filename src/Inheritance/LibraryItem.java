package Inheritance;

public class LibraryItem {

    // this inheritance is example of Hierarchical inheritance
    // where all child class extends one parent class i.e. LibraryItem
    private String itemId;
    private String author;
    private String title;

    public void checkOut(){
        System.out.println("Your checked out ");
    }

    public void returnItem(){
        System.out.println("Item is returned");
    }
}
