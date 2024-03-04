package lesson7;

public class TestCacheAny {

    public static void main(String args[]) {
//        CacheString myMessage = new CacheString(); // Type
//        myMessage.add("CacheString: Save this for me"); // Type
//        System.out.println(myMessage.get());
////
////
//        CacheShirt myShirt = new CacheShirt();     // Type
//        myShirt.add(Shirt.newShirt(1234, "V-neck", "Orange", "XS"));
//        System.out.println(myShirt.get());
////
////
//        //Generics
//        CacheAny<String> myGenericMessage = new CacheAny<String>(); 
//        myGenericMessage.add("CacheAny: Save this for me"); // Generic
//        System.out.println(myGenericMessage.get());
////
////
        CacheAny<Shirt> myGenericShirt = new CacheAny<Shirt>();
        myGenericShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
        System.out.println( myGenericShirt.get());
       
     
    }
}
