class Employee {
	String name ;
	String job ;
	int wages ;
	int wdays ;

	Employee (String name ,String job ,int wages ,int wdays){
		this.name =name ;
		this.job =job ;
		this.wages=wages;
		this.wdays=wdays ;
	}

	void displayInfo() {

		int payment =wages*wdays ;
		System.out.println("Name: "+name+", job: "+ job +", Wages:"+wages+", Work Days:" +wdays+", Payment:"+payment);
	}
}


class Queue {
	Employee queue[];
	int front,rear,size;

	Queue(int size){
		this.size =size;
		queue =new Employee[size];
		front=0;
		rear=-1;
	}

	void insert(Employee emp) {
		if(rear ==size-1){
			System.out.println("Queue is full");
		}
		else{
			queue[++rear]=emp;
			System.out.println(emp.name +"  is inserted");
		}
	}

	void display(){
		if(front >rear){
		System.out.println("Queue is Empty");

		}

		System.out.println("\n Employee Queue with Payment:");

		for(int i=front ;i<=rear;i++){
			queue[i].displayInfo();
		}
	}

}


public class EmployeeQueueDemo {
	public static void main(String[]args){
		Queue queue =new Queue(5);


		queue.insert(new Employee("Amol" ,"Analyst" ,2000,20));
		queue.insert(new Employee("Sneha" ,"Developer" ,1000,30));
		queue.insert(new Employee("Sonali" ,"HR" ,800,30));
		queue.insert(new Employee("Vaibhavi" ,"HR" ,800,30));
		queue.insert(new Employee("Akansha" ,"HR" ,800,30));
		
		queue.display();

		
		queue.insert(new Employee("John" ,"Analyst" ,2000,20));
		queue.insert(new Employee("Alex" ,"Analyst" ,2000,20));
		queue.display();


	}
}