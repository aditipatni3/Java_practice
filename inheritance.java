class Animal{
  public void makeSound(){
    System.out.println("makes noise");
  }
}
class Cat extends Animal{
  @Override
  public void makeSound(){
    System.out.println("Meows");
  }
}
public class Main{
  public static void main(String args[]){
    Animal a= new Animal();
    a.makeSound();
    Cat kaaju=new Cat();
    kaaju.makeSound();
  }
}
