import java.util.ArrayList;
/* This is a stub for the House class */
public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private Boolean hasDiningRoom;

  public House(String name, String address, int nFloors, Boolean hDR) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hDR;
    System.out.println("You have built a house: 🏠");
  }

  public Boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  public int nResidents(){
    return this.residents.size();
  }

  public void moveIn(String name){
    this.residents.add(name);
  }

  public String moveOut(String name){
    this.residents.remove(name);
    return name+" has moved out. Bye!";
  }

  public boolean isResident (String person){
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
    new House("Wilson House", "27 Elm Street", 4, false);
  }

}