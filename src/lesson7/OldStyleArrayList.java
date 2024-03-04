package lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OldStyleArrayList {

    public static void main(String args[]) {
        List partList = new ArrayList(3);
//No Type definition hence different types of objects in array list below:
        partList.add(new Integer(1111));
        partList.add(new Integer(2222));
        partList.add(new Integer(3333));
//        partList.add("Oops a string!"); //Causes type casting error when file is run

        
        Iterator elements = partList.iterator();
        
        while (elements.hasNext()) {
// Runtime error would occur below if 'integer' was specified as array list type
            Integer partNumberObject = (Integer) (elements.next()); 
            int partNumber = (int) partNumberObject.intValue();

            System.out.println("Part number: " + partNumber);
        }
    }
}
