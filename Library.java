
import java.util.*;
/* This is a stub for the Library class */
public class Library extends Building {
    private java.util.HashTable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new HashTable<String, boolean>;
      System.out.println("You have built a library: 📖");
    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }