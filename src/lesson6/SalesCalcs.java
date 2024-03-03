package lesson6;

public interface SalesCalcs {

    public String getName();

    public double calcSalesPrice();

    public double calcCost();

    public double calcProfit();
    
    public static final String reportTitle = "=====Static List Report=====";
    
    public default void printItemReport() {
        System.out.println("--" + this.getName() + " Report--");
        System.out.println("Sales Price = R" + this.calcSalesPrice());
        System.out.println("Cost = R" + this.calcCost());
        System.out.println("Profit = R" + this.calcProfit());
    }
    
    
    public static void printItemArray(SalesCalcs[] items) {
//        System.out.println("=====Sales Report=====");
System.out.println(reportTitle);
        for(SalesCalcs item : items) {
            System.out.println("--" + item.getName() + " Report--");
            System.out.println("Sales Price = R" + item.calcSalesPrice());
            System.out.println("Cost = R" + item.calcCost());
            System.out.println("Profit = R" + item.calcProfit());
        }
    }
}
