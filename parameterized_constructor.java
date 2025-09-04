class Dog{
  String name;
  String color;
  
  public Dog(String name, String color){
    this.name=name;
    this.color=color;
  }
}

public class Main{
  public static void main(String args[]){
    Dog dog=new Dog("Bruno", "Golden");
    System.out.println(dog.name + " is a "+ dog.color +" dog.");
  }
}
