package lesson8;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A03aMethodReference {
    
    public static void main(String[] args) {
        
        List<SalesTxn> tList = SalesTxn.createTxnList();
                      
        System.out.println("\n== CA Transations Lambda ==");
        tList.stream()
            .filter(t -> t.getState().equals(State.CA))
            .forEach(t -> t.printSummary()); 
        
        tList.stream()
            .filter(t -> t.getState().equals(State.CA))
            .forEach(SalesTxn::printSummary);  //'::' is method reference operator
        
        
        System.out.println("\n== CO Transations Lambda ==");
        tList.stream()
                .filter(t -> t.getState().equals(State.CO))
                .forEach(SalesTxn::printSummary);
    }   
}
