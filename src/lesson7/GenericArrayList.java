package lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericArrayList {

    public static void main(String args[]) {

        List<Integer> partList = new ArrayList<>(3);

        partList.add(new Integer(1111));
        partList.add(new Integer(2222));
        partList.add(new Integer(3333));
        partList.add(new Integer(4444)); // Arraylist auto grows
        
//Below results in compile errow because Integer type has been specified for array list
//        partList.add("Oops a string!"); 

      Iterator<Integer> elements = partList.iterator();
//      while (elements.hasNext()) {
//          Integer partNumberObject = elements.next(); //autobox
//          int partNumber = partNumberObject.intValue();
//          System.out.println("Part number: " + partNumber);
//      }

      for (Integer partNumberObj : partList) {
            int partNumber = partNumberObj; // Demonstrates autoboxing.
            System.out.println("Part number: " + partNumber);
        }
        
        
      

    }
}
