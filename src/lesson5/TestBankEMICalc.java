package lesson5;


public class TestBankEMICalc {

    public static void main(String[] args) {
        
             
        BankEMICalculator acct1 = new BankEMICalculator();
        acct1.setCustomerName("Judy");
        acct1.setAccountNo("456_123_0056");
        acct1.setLoanAmount(20_000.00);
        
        System.out.println(acct1);
        
//        double EMIamt = acct1.getMonthlypayment();
//        System.out.print(EMIamt);
    }
    
}
