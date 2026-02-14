import java.util.*;
class Test{
	public static void main(String[]args){
		HashMap<String,Integer> emp=new HashMap<String,Integer>();
		emp.put("Ram" ,10000);
		emp.put("Ramesh" ,20000);
		emp.put("Amol",30000);

		int ram_bsal=0,ramesh_bsal=0,amol_bsal=0;
		for(Map.Entry e:emp.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
			if(e.getKey().toString().equals("Ram")){
				ram_bsal=Integer.parseInt(e.getValue().toString());
			}
			if(e.getKey().toString().equals("Ramesh")){
				ramesh_bsal=Integer.parseInt(e.getValue().toString());
			}
			if(e.getKey().toString().equals("Amol")){
				amol_bsal=Integer.parseInt(e.getValue().toString());
			}
		}

		System.out.println("----Allowance details are----");

		HashMap<String,Integer>allow=new HashMap<String,Integer>();
		allow.put("HRA",30);
		allow.put("TA",20);
		allow.put("PF",10);

        double hra_amt=0,ta_amt=0,pf_amt=0;

        for(Map.Entry al: allow.entrySet()){
        	System.out.println(al.getKey()+" "+al.getValue());

        	if(al.getKey().toString().equals("HRA")){
        		hra_amt=Double.parseDouble(al.getValue().toString())/100;
        	}

        	if(al.getKey().toString().equals("TA")){
        		ta_amt=Double.parseDouble(al.getValue().toString())/100;
        	}

        	if(al.getKey().toString().equals("PF")){
        		pf_amt=Double.parseDouble(al.getValue().toString())/100;
        	}
        }
        System.out.println("Ram Basic Salary :"+ram_bsal);
        System.out.println("Ramesh Basic Salary :"+ramesh_bsal);
        System.out.println("Amol Basic Salary :"+amol_bsal);

        System.out.println("----Ram Payment----");

        double hra=ram_bsal*hra_amt;
        double ta=ram_bsal*ta_amt;
        double pf=ram_bsal*pf_amt;

        double ram_totsal=ram_bsal+hra+ta+pf;
        System.out.println("Total Salary: "+ram_totsal);


        System.out.println("----Ramesh Payment----");

         hra=ramesh_bsal*hra_amt;
         ta=ramesh_bsal*ta_amt;
         pf=ramesh_bsal*pf_amt;

        double ramesh_totsal=ramesh_bsal+hra+ta+pf;
        System.out.println("Total Salary: "+ramesh_totsal);

        System.out.println("----Amol Payment----");

         hra=amol_bsal*hra_amt;
         ta=amol_bsal*ta_amt;
          pf=amol_bsal*pf_amt;

        double amol_totsal=amol_bsal+hra+ta+pf;
        System.out.println("Total Salary: "+amol_totsal);





	}
}