class BankAccount{
  public int deposit, withdraw;
  public BankAccount(int deposit, int withdraw){
    this.deposit=deposit;
    this.withdraw=withdraw;
  }
  
  public int deposit(){
    return deposit;
  }
  public int withdrawMoney(){
    return withdraw;
  }
}

class SavingsAccount extends BankAccount{
  
  public SavingsAccount(int deposit, int withdraw){
    super(deposit, withdraw);
  }
  
  @Override
  public int withdrawMoney(){
    if(deposit<100){
      System.out.println("Low balance");
      return deposit-withdraw;
    }
    else{
      return withdraw;
    }
  }
}
public class Main{
  public static void main(String args[]){
    BankAccount my= new BankAccount(50, 100);
    BankAccount my2= new BankAccount(50, 0);
    my.withdrawMoney();
    my2.withdrawMoney();
    
    SavingsAccount my3= new SavingsAccount(50, 100);
    my3.withdrawMoney();
    SavingsAccount my4= new SavingsAccount(100, 100);
    my4.withdrawMoney();
    
  }
}
