
package lesson7;


public class CacheString {
  
    private String message;
  
    public void add(String message){
        this.message = message;
    }
  
    public String get(){
        return this.message;
    }  
    
//    @Override
//    public String toString() {
//        return message;
//    }
  
}
