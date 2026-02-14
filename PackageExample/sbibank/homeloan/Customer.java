package sbibank.homeloan;
import sbibank.Bank;

import java.util.Scanner;

public class Customer {
    private String cname;
    private double fdamt;
    private int noy;      
    Scanner sc = new Scanner(System.in);

    

    public void getData() {
        System.out.print("Enter Customer Name: ");
        cname = sc.nextLine();

        System.out.print("Enter Fixed Deposit Amount: ");
        fdamt = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        noy = sc.nextInt();
    }

    public void showData() {
        System.out.println("Customer Name: " + cname);
        System.out.println("Fixed Deposit Amount: " + fdamt);
        System.out.println("Number of Years: " + noy);
       }

    public void mat_amt(double roi) {
        double imat=(fdamt*roi)*noy;
        double matamt=imat+fdamt;
        System.out.println( "Total amout: "+matamt);  
    }


}
