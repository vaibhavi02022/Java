import java.io.*;
import java.util.*;

class Test {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter customer name: ");
            String cus_name = sc.nextLine();

            System.out.print("Enter product name: ");
            String pro_name = sc.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter rate: ");
            int rate = sc.nextInt();

            int total = quantity * rate;

            
            String data = "Customer Name: " + cus_name +
                          "\nProduct Name: " + pro_name  +
                          "\nQuantity: " + quantity  +
                          "\nRate: " + rate+
                          "\nTotal: " + total;

            // Write to file
            FileWriter fw = new FileWriter("D:\\billing.txt");
            fw.write(data);
            fw.close();

            System.out.println("Data written to file successfully.");
        
       
            sc.close();  // Always good to close the scanner
        }
    }

