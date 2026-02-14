import java.util.*;

class Test{
	public static void main(String[]args){
		HashMap<String,Integer>names = new HashMap<String,Integer>();
		names.put("Akash" ,5000);
		names.put("Ramesh" ,7000);
		names.put("Ajay" ,10000);
		names.put("Ganesh" ,20000);
		names.put("Manish" ,3000);

		for(Map.Entry m:names.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		//salary more than 7000

		
        int y;
		for(Map.Entry m:names.entrySet()){
			y=Integer.parseInt(m.getValue().toString());
			if(y>=7000){
				System.out.println("Employee list are: "+m.getKey()+" "+m.getValue());
			}

			}
		
		//salary in between 5000 to 10000

			int salaryy;
			for(Map.Entry m :names.entrySet()){
				salaryy =Integer.parseInt(m.getValue().toString());
				if(salaryy>5000 && salaryy<10000){
					System.out.println("Employee list are: "+m.getKey()+" "+m.getValue());
				}
			}

			//whose salary is 3000 and 5000

			int sal;
			for(Map.Entry m: names.entrySet()){
				sal=Integer.parseInt(m.getValue().toString());
				if(sal==3000 || sal==5000){
					System.out.println("Employee list are: "+m.getKey()+" "+m.getValue());

				}
			}

			//Display Ajay

			for(Map.Entry m :names.entrySet()){
				if(m.getKey().equals ("Ajay")){
					System.out.println("Employee :"+m.getKey()+" "+m.getValue());
				}
			}

			//manish by 45000 update sal
			names.replace("Manish" ,45000);

			for(Map.Entry m:names.entrySet()){
					System.out.println("Employee :"+m.getKey()+" "+m.getValue());

			}

			//tot salary paid to emp

			int tot_sal=0;
			for(Map.Entry m:names.entrySet()){

				tot_sal =tot_sal+Integer.parseInt(m.getValue().toString());
			}

				System.out.println("Total Salary :"+ tot_sal);
				

	}
}