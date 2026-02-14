import sbibank.Bank;
import sbibank.homeloan.Customer;

class sbi {
    public static void main(String[] args) {
        
        Bank bank = new Bank();
        bank.get(); 
        bank.showBankData();
        double x = bank.getRoi(); 

        
        Customer customer = new Customer();
        customer.getData();   
        customer.showData();  
        customer.mat_amt(x);
    }
}
