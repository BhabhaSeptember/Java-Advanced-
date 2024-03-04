package lesson7;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestStack {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        //LIFO operations (Last in operation is output first)
//        stack.push("one");
//        stack.push("two");
//        stack.push("three");
//        
        //FIFO operations (First in operation is output first)
        stack.add("four");
        stack.add("five");
        stack.add("six");

//        System.out.println("Stack = " + stack);
        
        
        
        int size = stack.size() - 1;
//        while (size >= 0) {
//            System.out.println("\nStack size = " + stack.size());
//            System.out.println("Item: " + stack.pop());
//            size--;
//        }
//
//
while (size >= 0) {
            System.out.println("\nStack size = " + stack.size());
            System.out.println("Item: " + stack.remove());
            size--;
        }
    }
}
