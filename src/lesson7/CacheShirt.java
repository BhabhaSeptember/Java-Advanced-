package lesson7;

public class CacheShirt {
    
    private Shirt shirt;
  
    public void add(Shirt shirt){
        this.shirt = shirt;
    }
  
    public Shirt get(){
        return this.shirt;
    }  
    
//    @Override
//    public String toString() {
//        return "Shirt ID: " + shirt.getId() + "\n" +
//        "Description: " + shirt.getDescription() + "\n" +
//        "Color: " + shirt.getColor() + "\n" +
//        "Size: " + shirt.getSize() + "\n";
//    }
}
