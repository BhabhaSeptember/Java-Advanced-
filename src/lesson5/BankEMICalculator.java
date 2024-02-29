/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5;

/**
 *
 * @author User
 */
public class BankEMICalculator {

    private String CustomerName;
    private String AccountNo;
    private double loanAmount;
    private double monthlyPayment;
    private EMICalcHelper helper = new EMICalcHelper();
    
    
    public void BankEMICalculator(String custName, String accNum, double loanAmt) {
        this.CustomerName = custName;
        this.AccountNo = accNum;
        this.loanAmount = loanAmt;  
}
    
    public void BankEMICalculator() {
        this.CustomerName = getCustomerName();
        this.AccountNo = getAccountNo();
        this.loanAmount = getLoanAmount();
    }
    
    
    //Below is inner class
    //It's a part of the outer class and inherits access to all private members thereof
    private class EMICalcHelper {

        int loanTerm = 60;
        double interestRate = 0.9;
        double interestPerMonth = interestRate/loanTerm;
        
        protected double calcMonthlyPayment(double loanAmount) {
            double EMI = (loanAmount * interestPerMonth) / (1.0 - (1.0/Math.pow(1.0 + interestPerMonth, loanTerm)));
            return(Math.round(EMI));
        }

    }

    /**
     * @return the CustomerName
     */
    public String getCustomerName() {
        return CustomerName;
    }

    /**
     * @param CustomerName the CustomerName to set
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * @return the AccountNo
     */
    public String getAccountNo() {
        return AccountNo;
    }

    /**
     * @param AccountNo the AccountNo to set
     */
    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    /**
     * @return the loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @return the monthlyPayment
     */
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    /**
     * @param monthlyPayment the monthlyPayment to set
     */
    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    
    
    @Override
   public String toString() {
       return "Customer Name    : " + getCustomerName() +
               "\nAccount Number   : " + getAccountNo() +
               "\nLoan Amount      : " + getLoanAmount();
   }
    
}

