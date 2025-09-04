class BankAccount{
  private String accountNumber;
  private int balance;
  private static String bankName;
  private static double interestRate;
  
  public BankAccount(String accountNumber, int balance){
    this.accountNumber=accountNumber;
    this.balance=balance;
  }
  
  
  
  public static void setBankName(String Name){
    bankName=Name;
  }
  private static String getBankName(){
    return bankName;
  }
  
  
  
  public static void setRate(double Rate){
    interestRate=Rate;
  }
   private static double getRate(){
    return interestRate;
  }
  
  public void display(){
    System.out.println("bankaccount:" +accountNumber+ " has balance "+ balance + " and is in the bank "+ bankName + " which gives interst upto "+ interestRate);
  }
}

public class Main{
  public static void main(String args[]){
    BankAccount firstOne=new BankAccount("123456", 450);
    firstOne.setBankName("HDFC");
    firstOne.setRate(10.50);
    
    firstOne.display();
  }
}
