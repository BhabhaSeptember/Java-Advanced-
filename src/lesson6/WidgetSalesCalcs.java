package lesson6;

public interface WidgetSalesCalcs extends SalesCalcs {

    public String getWidgetType();
    
    @Override
    public default void printItemReport() {
        System.out.println("--" + this.getName() + " Report--");
        System.out.println("Sales Price = R" + this.calcSalesPrice());
        System.out.println("Cost = R" + this.calcCost());
        System.out.println("Profit = R" + this.calcProfit());
        System.out.println("Type = " + this.getWidgetType());
    }
}
