package lesson2;

//Array Operations
//Enhanced For Loop
public class ForEachLoop {
    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Pink Shirt";
        names[1] = "Blue Skirt";
        names[2] = "Black Stockings";

        int[] numbers = {10, 200, 3000};

        for (String name : names ) {
            System.out.println("Item: " + name);
        }

        for (int number : numbers ) {
            System.out.println("Number: " + number);
        }
    }
}
