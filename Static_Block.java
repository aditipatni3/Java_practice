class Initializer{
  static int initialValue;
  static{
    initialValue=1000;
    System.out.println("Initializing.....");
  }



  public static void main(String args[]){
    System.out.println("before creating an instance " + Initializer.initialValue);
    Initializer obj= new Initializer();
    System.out.println("After creating instance " + obj.initialValue);
  }
}
