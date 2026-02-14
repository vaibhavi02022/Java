package sbibank;
import java.util.*;
 
 public class Bank {
    
    private String bankName;
    private String branch;
    private String ifscCode;

    Scanner sc=new Scanner(System.in);

    public void get()
    {
         System.out.println("Bank Name: ");
        bankName = sc.next();
        System.out.println("Branch: ");
        branch = sc.next();
        System.out.println("IFSC Code: ");
        ifscCode = sc.next();
    }



    public void showBankData() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branch);
        System.out.println("IFSC Code: " + ifscCode);
    }

    public double getRoi() {
        
        double roi = 0.1;  

        return roi;  
    }
}
