import java.util.Collections;

import java.util.ArrayList;

class Main{
  public static void main(String[] args){
    ArrayList<String> colors= new ArrayList<String>();
      colors.add("Red");
      colors.add("Pink");
      colors.add("Vermilion");
      colors.add("Hot Pink");
      
      System.out.println(colors);
      
      //Insert at first position
      colors.add(0, "BLUE");
      colors.add(5, "YELLOW");
      System.out.println(colors);
      
      //Retrieve Element by Index
      System.out.println(colors.get(2));
      
      //update ArrayList element
      colors.add(3, "GOLDEN");
      System.out.println(colors);
      
      //remove third element
      colors.remove(2);
      System.out.println(colors);
      
      //search element in ArrayList
     if (colors.contains("BLUE")){
       System.out.println("BLUE present!");
     }
     else{
       System.out.println("BLUE not found!");
     }
  
  //sort arrayList
  Collections.sort(colors);
      
   //copy ArrayList
    ArrayList<String> colorsNew= new ArrayList<String>();
   for (String i : colors){
     colorsNew.add(i);
   }
   System.out.println(colorsNew);
   
   
   //shuffle arrayList
   Collections.shuffle(colors);
   System.out.println(colors);
   
   //extract Sublist from ArrayList
   ArrayList<String> subColors= new ArrayList<>(colors.subList(0,3));
   System.out.println(subColors);
   
   //compare two ArrayList
   System.out.println(colors.equals(colorsNew));
   System.out.println(colors.equals(subColors));
   
   //swap ArrayList elements
  Collections.swap(colors, 0, 3);
  System.out.println(colors);
  
  //join two arrayLists
  colors.addAll(subColors);
  System.out.println(colors);
  
  //clone ArrayList
  ArrayList<String> clonedArray= (ArrayList<String>)colors.clone();
  System.out.println(colors);
  
  //clear ArrayList
  subColors.removeAll(subColors);
  System.out.println(subColors);
  
  //check is arrayList is empty
  System.out.println(subColors.isEmpty());
  
  //trim arrayList capacity
  colors.trimToSize();
  System.out.println(colors);
  
  //increase ArrayList capacity
  colors.ensureCapacity(8);
  colors.addAll(colorsNew);
  System.out.println(colors);
      
      
  }
}
