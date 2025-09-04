class Book{
  String title, author;
  int price;
  
  public Book(){
    title="Missing title";
    author="Unknown Author";
    price=0;
  }
  
  public Book(String title, String author){
    this.title=title;
    this.author=author;
    price=0;
  }
  
  public Book(String title, String author, int price){
    this.title=title;
    this.author=author;
    this.price=price;
  }
  
  public void display(){
    System.out.println(title + " written by " + author + " costs "+ price);
  }
}

public class Main{
  public static void main (String args[]){
    Book b1=new Book();
   b1.display();
   
   Book b2=new Book("Kafka on the shore", "murakami");
   b2.display();
   
   Book b3=new Book("alchemist", "Paulo", 500);
   b3.display();
    
  }
}
