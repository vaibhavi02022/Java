import java.util.*;
class Account{

	private int accno;
	private String ename;
	private int bal;
	private int count=0;
Scanner sc =new Scanner(System.in);
	public void open(){
		
		System.out.println("Accno");
        accno =sc.nextInt();
        System.out.println("ENAME");
        ename =sc.next();
        System.out.println("BAl");
        bal=sc.nextInt();
	}

	public void showData(){
		System.out.println("ACCNO"+accno);
		System.out.println("ENAME"+ename);
		System.out.println("BAL"+bal);
	}

	public void deposit(){
		System.out.println("Enter amount for deposit: ");
		int damt=sc.nextInt();
		bal=bal+damt;
		System.out.println("Account Balance after transcation " +bal);
	}

	public void withdraw(){

		System.out.println("Enter amount for withdraw:");
		int wamt=sc.nextInt();
		if(wamt>bal){
			System.out.println("Insufficient balance");
			System.out.println("Balance amount "+bal);
			System.out.println("You are trying to withdraw "+wamt);
		}else{
			    count++;          
			if(count>=3){
				System.out.println("You have exceed transaction limit");
		     
		     bal=bal-500;

	        }
	        bal=bal-wamt;
		System.out.println("Account Balance after transcation " +bal);


	    }
	}

	public void showBal(){
         System.out.println("Balance Amount after transcation: " +bal);
	}
} //end of class

class Main{
	public static void main(String[]args){
		Account acc =new Account();
		Scanner sc=new Scanner(System.in);
		int tagain_choice ,tchoice;
		do{
		System.out.println("Please select transaction choice");
		System.out.println("Press 1 for Open Details");
		System.out.println("Press 2 for Show Account Details");
		System.out.println("Press 3 for Deposit");
		System.out.println("Press 4 for Withdraw");
		System.out.println("Press 5 for Show Balance");

		tchoice=sc.nextInt();

		if(tchoice==1){
			acc.open();
		}else if(tchoice==2){
			acc.showData();
		}else if(tchoice==3){
			acc.deposit();
		}else if(tchoice==4){
            acc.withdraw();
		}else if(tchoice==5){
			acc.showBal();
		}
		else{
			System.out.println("Invalid transaction code");
		}
		
		System.out.println("Press 1 to transaction again");
		System.out.println("Press 2 to Exit");

		tagain_choice=sc.nextInt();

		}while(tagain_choice==1);

		System.out.println("Thank you for banking with us");
	
    }
}