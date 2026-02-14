import java.util.*;
class Electricity_bill
{
	private int consumer_no;
	private String consumerName;
	private int no_of_unit;
	private String typeOfArea;
	private String typeOfUse;
	private int metro_home ;
    private int metro_comm ;
    private int urban_home ;
    private int urban_comm;

   Scanner sc=new Scanner(System.in);
     public Electricity_bill(){
     	 metro_home =10;
     	 metro_comm =20;
     	 urban_home =7;
     	 urban_comm=15;

     }

   public void acceptData()
   {
   	System.out.println("consumer_no");
	consumer_no =sc.nextInt();
    System.out.println("consumer Name");
	consumerName =sc.next();
    System.out.println("no_of_unit");
	no_of_unit =sc.nextInt();
    System.out.println("typeOfArea");
	typeOfArea=sc.next();
    System.out.println("typeOfUse");
	typeOfUse=sc.next();

   }


public void displayData(){
	System.out.println("consumer_no: "+consumer_no);
	System.out.println("consumerName: "+consumerName);
	System.out.println("No_of_unit: "+no_of_unit);
	System.out.println("typeOfArea: "+typeOfArea);
	System.out.println("typeOfUse: "+typeOfUse);
}

public void bill_amt(){
	int bill;
	if (typeOfArea.equals("metro") ||typeOfArea.equals("Metro")){
	  if( typeOfUse.equals("home")  ||typeOfUse.equals("Home")){
       bill=metro_home *no_of_unit;
       System.out.println("Bill For metro-home"+bill);
	}
    }


	else if(typeOfArea.equals("metro")||typeOfArea.equals("Metro")){
	 if(typeOfUse.equals("comm")||typeOfUse.equals("Comm")){
		bill=metro_comm*no_of_unit;
		System.out.println("Bill for metro-comm"+bill);
	}
}

	else if(typeOfArea.equals("urban")||typeOfArea.equals("Urban")){ 
		if(typeOfUse.equals("home")|| typeOfUse.equals("home")){
        bill=urban_home*no_of_unit;
        System.out.println("Bill for urban-home"+bill);
	}
}

	else if(typeOfArea.equals("urban")||typeOfArea.equals("Urban")){

		if( typeOfUse.equals("comm")||typeOfUse.equals("Comm")){
		bill=urban_comm*no_of_unit;
		System.out.println(bill);
	}
}
	else{
		System.out.println("Something went wrong");
	}
}
}//end of class

class Main{
	public static void main(String[]args){
        Electricity_bill obj =new Electricity_bill();
        obj.acceptData();
        obj.displayData();
        obj.bill_amt();
	}
}