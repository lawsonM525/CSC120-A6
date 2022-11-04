
import java.util.Hashtable;
/* Library class: Building to store and take books from */
public class Library extends Building {
    private java.util.Hashtable<String, Boolean> collection;

    /** 
     *  Constructor for Library class
     *  @param name Name of the Library
     *  @param address Location of the library
     *  @param nFloors Number of floors in the library
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /** 
     *  Adds a book to our library collection and automatically makes it available
     *  @param title Title of the book
     */
    public void addTitle(String title){
      this.collection.put(title, true);
    }

    /** 
     *  Removes a book from our library collection altogether
     *  @param title Title of the book
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      return(title);
    } // return the title that we removed

    public void checkOut(String title){
      if (collection.contains(title)) {
        collection.replace(title, true, false);
      }
      else{
        System.out.println("This title is not is our collection.");
      }
    }

    public void checkIn(String title){
      if (collection.contains(title)) {
        collection.replace(title, false, true);
      }
      else{
        System.out.println("This title is not is our collection.");
      }
    }

      /** 
   *  Checks to see if the book exists in the collection
   *  @param title title of the book
   *  @return T/F: is the book in the collection?
   */
  public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
  if (collection.contains(title)) {
    return true;
  }
  else{
    return false;
  }
}

 /** 
 *  Checks to see if the book is available to check out
 *  @param title title of the book
 *  @return T/F: is the book available to be checked out?
 */
public boolean isAvailable(String title){ // returns true if the title is currently available, false otherwise
  if (collection.contains(title)) {
    return collection.get(title);
  }
  else{
    throw new RuntimeException("This book is not in this collection");
  }
}

 /** 
 *  Prints the collection
 */
public void printCollection(){
  System.out.println(this.collection);

}

    public static void main(String[] args) {
      new Library("Nielson","Chapin Drive",4);
    }
  
  }