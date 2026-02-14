import java.util.*;
class Test{
	public static void main(String[]args){
		HashMap<String ,Integer>semi1=new HashMap<String ,Integer>();


		System.out.println("------Sem 1------");
		semi1.put("C Lang" ,50);
		semi1.put("CPP Lang" ,50);
		semi1.put("Eng",50);

		for(Map.Entry m:semi1.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		HashMap<String,Integer>semi2=new HashMap<String,Integer>();
		System.out.println( "------Sem 2------");

		semi2.put("Java" ,60);
		semi2.put("PHP",60);
		semi2.put("Apty",60);

		for(Map.Entry m:semi2.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		HashMap<String,Integer>semi3=new HashMap<String,Integer>();
		System.out.println("-----Sem 3-----");

		semi3.put("ASP",80);
		semi3.put("AWS",80);
		semi3.put("SALESFORCE",80);

		for(Map.Entry m:semi3.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		HashMap<String,Integer>semi4=new HashMap<String,Integer>();
		System.out.println("-----Sem 4-----");

		semi4.put("Project",100);
		semi4.put("viva",80);

		for(Map.Entry m:semi4.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

		//total marks and percentage of each semi

		System.out.println("----Total mark and Percentage of each sem----");

		int tot_mark1=0;

		for(Map.Entry m:semi1.entrySet()){
			tot_mark1=tot_mark1+Integer.parseInt(m.getValue().toString());


		}
System.out.println("Total marks foe sem1 :"+tot_mark1);
int per1=tot_mark1/3;
System.out.println("Percentage for Sem1: "+per1);


      int tot_mark2=0;

      for(Map.Entry m:semi2.entrySet()){
      	tot_mark2=tot_mark2+Integer.parseInt(m.getValue().toString());

      }
System.out.println("Total marks for sem2 :"+tot_mark2);
int per2=tot_mark2/3;
System.out.println("Percentage for Sem2: "+per2);

int tot_mark3=0;
for(Map.Entry m: semi3.entrySet()){
	tot_mark3=tot_mark3+Integer.parseInt(m.getValue().toString());
}
System.out.println("Total marks foe sem3 :"+tot_mark3);
int per3=tot_mark3/3;
System.out.println("Percentage for Sem2: "+per3);


int tot_mark4=0;
for(Map.Entry m: semi4.entrySet()){
	tot_mark4=tot_mark4+Integer.parseInt(m.getValue().toString());
}
System.out.println("Total marks foe sem4 :"+tot_mark4);
int per4=tot_mark4/2;
System.out.println("Percentage for Sem2: "+per4);


//total mark of all sem

System.out.println("Total marks of all sem");

int all_tot_mark=0;
all_tot_mark =tot_mark1+tot_mark2+tot_mark3+tot_mark4;
System.out.println("Total Mark: "+all_tot_mark);


//display list of sub and marks >=55
System.out.println("---Display list of sub and marks >=55---");

		HashMap<String ,Integer>all=new HashMap<String ,Integer>();
		all.putAll(semi1);
		all.putAll(semi2);
		all.putAll(semi3);
		all.putAll(semi4);

		for(Map.Entry m:all.entrySet()){
			
				int marksm=Integer.parseInt(m.getValue().toString());
				if(marksm>=55){
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}

//marks>=72
System.out.println("---Display list of sub and marks >=72---");


		for(Map.Entry m:all.entrySet()){
			int markss=Integer.parseInt(m.getValue().toString());
			if(markss>=72){
				System.out.println(m.getKey()+" "+m.getValue());

			}
		}





	}
}