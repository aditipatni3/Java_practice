class IDGenerator{
  static int nextID=1;
  static int generateID(){
    return nextID++;
   
  }
}

public class Main{
  public static void main(String args[]){
    System.out.println(IDGenerator.generateID());
    System.out.println(IDGenerator.generateID());
    System.out.println(IDGenerator.generateID());
    System.out.println(IDGenerator.generateID());
    System.out.println(IDGenerator.generateID());
  }
}
