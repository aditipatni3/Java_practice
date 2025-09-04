class Counter{
  static int count=0;
  public Counter(){
    this.count=count+1;
  }
}

public class Main{
  public static void main(String args[]){
    Counter obj=new Counter();
    System.out.println(obj.count);
    Counter obj2=new Counter();
    System.out.println(obj2.count);
     Counter obj3=new Counter();
    System.out.println(obj3.count);
    
  }
}
