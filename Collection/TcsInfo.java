import java.util.ArrayList;
class TcsInfo{
	public static void main(String[]args){
		ArrayList<String>emp =new ArrayList<String>();
		emp.add("Adams");
		emp.add("Turner");
		emp.add("Alex");
		emp.add("John");
		emp.add("Martin");
		emp.add("Smith");

		ArrayList<Integer>sal =new ArrayList<Integer>();
		sal.add(8000);
		sal.add(6000);
		sal.add(4000);
		sal.add(10000);
		sal.add(4000);
		sal.add(15000);

		ArrayList<String>job=new ArrayList<String>();
		job.add("Clerk");
		job.add("HR");
		job.add("Analyst");
		job.add("Dev");
		job.add("HR");
		job.add("Manager");

		//all data of Employee
        System.out.println("\nall data of Employee");
		for(int i=0;i<emp.size();i++){
			System.out.println(emp.get(i)+" "+sal.get(i)+" "+job.get(i));
		}

		//display data whose salary is >7000
		System.out.println("\ndisplay data whose salary is >7000");

		for(int i=0;i<emp.size();i++){
			if(sal.get(i)>7000){
			System.out.println(emp.get(i)+" "+sal.get(i)+" "+job.get(i));


			}
		}

		System.out.println("\nWorking as HR and Manager");
		for(int i=0;i<emp.size();i++){
			if(job.get(i).equals("HR") || job.get(i).equals("Manager")){
			System.out.println(emp.get(i)+" "+sal.get(i)+" "+job.get(i));

			}
		}
    int tot_sal=0;
		System.out.println("\nTotal sal paid to all employee ");
		for(int i=0;i<sal.size();i++){
        tot_sal=tot_sal+sal.get(i);

		}
		System.out.println("\nTotal sal paid to all employee "+tot_sal);

		System.out.println("\nRemove Turner");
		for(int i=0;i<emp.size();i++){
			if(emp.get(i).equals("Turner")){
				emp.remove(i);
				sal.remove(i);
				job.remove(i);
			}
		}
		System.out.println("\n Updated list:");
		for(int i=0;i<emp.size();i++){
			System.out.println(emp.get(i)+" "+sal.get(i)+" "+job.get(i));
		}
System.out.println("\n Update sal of john Sal 40000");
		

		for(int i=0;i<emp.size();i++){
			if(emp.get(i).equals("John")){
				sal.set(i,40000);

			}

		}
		System.out.println("\nall data of Employee");
		for(int i=0;i<emp.size();i++){
			System.out.println(emp.get(i)+" "+sal.get(i)+" "+job.get(i));
		}







	}
}