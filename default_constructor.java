import java.lang.*;
class Cat{
  String name;
  int age;
  public Cat(int age, String name){
    this.age=age;
    this.name=name;
  }
  public Cat(){
    this.age=0;
    this.name="unknown";
  }
  }
public class Main{
public static void main(String args[]){
  Cat c= new Cat();
  System.out.println(c.age);
  System.out.println(c.name);
  
  Cat meow= new Cat(2, "Kaaju");
  System.out.println(meow.age);
  System.out.println(meow.name);
}}
