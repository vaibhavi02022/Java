import java.util.*;

class AxisBank{

	public static void main(String[]args){
		HashMap<Integer ,String>account =new HashMap<Integer,String>();

		account.put(1111,"Ramesh");
		account.put(1112,"Ashok");
		account.put(1113,"Chetan");
		account.put(1114,"Rajesh");
		account.put(1115,"Ranjit");

	for(Map.Entry m :account.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}

	Collection x=account.values();
	System.out.println("Result is: "+x);

    account.replace(1111,"Sarthak");

    
	for(Map.Entry m :account.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}


	}
}