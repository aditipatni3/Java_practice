class Rectangle{
  private int length, breadth;
  public Rectangle(int length, int breadth){
    this.length=length;
    this.breadth=breadth;
  }
  
  public Rectangle(Rectangle other){
    this.length=other.length;
    this.breadth=other.breadth;
  }
  
  public void display(){
    System.out.println("length of the rectangle: "+ length);
    System.out.println("breadth of the rectangle:" + breadth);
  }
}

public class Main{
  public static void main(String args[]){
    Rectangle rect1= new Rectangle(10, 20);
    Rectangle copy= new Rectangle(rect1);
    rect1.display();
    copy.display();
  }
}
