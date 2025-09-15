import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Main{
  public static void main(String[] args){
    LinkedList<Integer> numbers= new LinkedList<Integer>();
    numbers.add(0);
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    System.out.println("Printing Linked list: " + numbers);
    
    //Append specified element to the end of LL
    numbers.addLast(6);
    System.out.println("Append specified element to the end of LL: " + numbers);
    
    //iterate through all elements
    for(int i : numbers){
      System.out.println("iterating Linked list: " + numbers);
    }
    
    //iterate starting at specified position
      Iterator i= numbers.listIterator(2);
      while(i.hasNext()){
        System.out.println(i.next());
      }
      
      //iterate in descending order
      Iterator it=  numbers.descendingIterator();
      while(it.hasNext()){
        System.out.println(it.next());
      }
      
      //insert specified element at specified posititon 
      numbers.add(3, 999);
      System.out.println(numbers);
      
      //insert elements into the linked list at the first and last positions.
      numbers.addFirst(999);
      numbers.addLast(1000);
      System.out.println(numbers);
      
      //insert some elements at the specified position
      LinkedList<Integer> newLL= new LinkedList<Integer>();
      newLL.add(99);
      newLL.add(420);
      newLL.add(199);
      numbers.addAll(1, newLL);
      System.out.println(numbers);
      
      // get the first and last occurrence of the specified elements
      System.out.println(numbers.getFirst());
      System.out.println(numbers.getLast());
      
      // display elements and their positions
      for (int id=0;id<numbers.size(); id++){
        System.out.println(id+ " -> " + numbers.get(id));
      }
      
      //remove a specified element 
      numbers.remove(3);
      System.out.println(numbers);
      
      //swap
      Collections.swap(numbers, 0, 3);      
      System.out.println(numbers);
      
      
      //convert LL into ArrayList
      ArrayList<Integer> array_of_numbers= new ArrayList<Integer>(numbers);
      System.out.println(array_of_numbers);
  }
}
