/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author namehere
 */
public class CashRegister {
    double totalAmount;
    String companyName;
    ArrayList<String> transactionDate;
    
    
    public CashRegister(String name){
        this.totalAmount = 0;
        this.companyName = name;
        this.transactionDate = new ArrayList<>();
    }
    
    public void showRegister(){
        System.out.println(this.totalAmount);
        System.out.println(transactionDate.toString());
        System.out.println(companyName);
    }
    
    public void doTransaction(double moneyReceived, String transactionDate){
        this.totalAmount += moneyReceived;
        this.transactionDate.add(transactionDate);
        
    }
    
    public void doRefund(double moneyRefund, String transactionDate){
        this.totalAmount -= moneyRefund;
        this.transactionDate.add(transactionDate);
    }
}
