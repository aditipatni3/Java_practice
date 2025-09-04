class Account{
  String accountNumber;
  int balance;
 
  
  public Account(String accountNumber, int balance){
    if(accountNumber==null || accountNumber.isEmpty()){
      System.err.println("Invalid account Number");
      return;
    }
    
    if(balance<0){
      System.err.println("balance cannot be negative");
      return;
    }
   
    this.accountNumber=accountNumber;
      this.balance=balance;
  }
  
  public void display(){
   
    System.out.println(accountNumber + " has balance amount "+ balance);
 
}
}

public class Main{
  public static void main(String args[]){
    Account new1= new Account("123", 123);
     Account new2= new Account("", 123);
    Account new3= new Account("123", -123);
    
   
    new1.display();
  
    
    
  }
}
