import java.util.Scanner;

class Student {
	String name ,college ,branch ;
	int year ;

	Student(String name ,String college ,String branch ,int year) {
		this.name =name ;
		this.college =college ;
		this.branch =branch ;
		this.year=year;
	}


	void display() {
		System.out.println("Name :"+name );
		System.out.println("college :"+college);
		System.out.println("Branch :"+branch);
		System.out.println("Year"+year);
	}
}  //end of Student

class StudentQueue{

	Student[] queue ;
	int front ,rear ,size ;

	StudentQueue(int size) {
		this.size =size ;
		queue =new Student[size];
		front =0 ;
		rear =-1 ;
	}

	void register(Student student) {
		if(rear ==size-1){
			System.out.println("? Registration full(Max"+size+"students");
		}

		queue[++rear] =student; //adding object in queue
		System.out.println(student.name +"Registered successfully");
	}

	void showAll(){
		if(front >rear) {
			System.out.println("No student registered");

		}

		System.out.println("/n Registered students:");
		for(int i=front ;i<=rear ;i++) {
			queue[i].display();
		}
	}
}

public class Campus{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		StudentQueue queue =new StudentQueue(4);
		System.out.println("---Campus Free Registration---\n(Max 4 students)");

		while(true){
			System.out.println("\n Do you want to register a student? (yes/no)");
			String choice =sc.next();
			if(!choice.equalsIgnoreCase("yes"))
				break;


			System.out.println("Enter name");
			String name =sc.next();

			System.out.print("Enter collegeName ");
			String college =sc.next();

			System.out.println("Enter Branch");
			String branch =sc.next();

			System.out.println("Enter year(1/2/3/4):");
			int year =sc.nextInt();

			Student s =new Student(name ,college ,branch,year);
			queue.register(s);
		}

		queue.showAll();
		sc.close();
	}
}