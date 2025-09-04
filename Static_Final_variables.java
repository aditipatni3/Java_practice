class Constant{
  static final double PI= 3.14159;
   static double area(int r){
     return PI*r*r;
   }
}
public class Main{
  public static void main(String args[]){
    System.out.println(Constant.area(5));
  }
}
