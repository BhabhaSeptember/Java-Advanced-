package lesson6;

public class TestSales {

    public static void main(String[] args) {
//        //CrushedRock Constructor = (salesPrice, cost, weight)
//        CrushedRock rock1 = new CrushedRock(12, 10, 50);
//        SalesCalcs rock2 = new CrushedRock(12, 10, 50);
//
//        System.out.println("Rock 1 Sales Price: " + rock1.calcSalesPrice());
//        System.out.println("Rock 2 Sales Price: " + rock2.calcSalesPrice());

//        //Using utility class "ItemReport" 
//        SalesCalcs[] itemList = new SalesCalcs[5];
//        ItemReport report = new ItemReport();
//
//        itemList[0] = new CrushedRock(12.0, 10.0, 50.0);
//        itemList[1] = new CrushedRock(8.0, 6.0, 10.0);
//        itemList[2] = new RedPaint(10.0, 8.0, 25.0);
//        itemList[3] = new Widget(6.0, 5.0, 10);
//        itemList[4] = new Widget(14.0, 12.0, 20);
//
//        System.out.println("==Sales Report==");
//        for (SalesCalcs item : itemList) {
//            report.printItemData(item);
//        }


        //Using default method
//        SalesCalcs[] itemList = new SalesCalcs[5];
//        
//        itemList[0] = new CrushedRock(12, 5, 50);
//        itemList[1] = new RedPaint(8, 4, 10);
//        itemList[2] = new Widget (6, 5, 10);
//        itemList[3] = new CrushedRock(8, 4, 20);
//        itemList[4] = new RedPaint(14, 10, 50);
//        
//        System.out.println("=====Sales Report=====");
//        for(SalesCalcs item : itemList) {
//            item.printItemReport();
//        }
        
        
//        //Using static method/helper method
//        SalesCalcs[] itemList = new SalesCalcs[5];
//        
//        itemList[0] = new CrushedRock(12, 5, 50);
//        itemList[1] = new RedPaint(8, 4, 10);
//        itemList[2] = new Widget (6, 5, 10);
//        itemList[3] = new CrushedRock(8, 4, 20);
//        itemList[4] = new RedPaint(14, 10, 50);
//        
//        SalesCalcs.printItemArray(itemList);
        
        //Extending interfaces
        WidgetSalesCalcs widget = new WidgetPro(10, 3, 100, "Type A");
        widget.printItemReport();

    }
}
