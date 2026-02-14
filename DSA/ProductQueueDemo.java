import java.util.Scanner ;

class Product {
	String name ;
	double rate ;
	int qty ;

	Product(String name ,double rate ,int qty){
		this.name =name;
		this.rate =rate ;
		this.qty =qty ;
	}

	void display(){
		System.out.println("Name:  "+name +",Rate:  "+rate+",Qty:  ,"+qty+", Bill amount:  " +rate*qty);
	}
}


class ProductQueue {
	int size ;
	int front,rear;
	Product[]queue;

	ProductQueue(int size){
		this.size =size ;
		queue =new Product[size];
		front=0;
		rear=-1; 
	}

	void insert(Product p){
		if(isFull()){
			System.out.println("Queue is Full!");
		}
		else{
			queue[++rear]=p; //obj added in queue
			System.out.println("Product inserted:"+p.name);
		}
	}

	void remove(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		else{
			System.out.println("Remove product" +queue[front].name);
			front ++;
		}
	}

	void display() {
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		else{
			System.out.println("All products list are");
			for(int i=front ;i<=rear ;i++){
				queue[i].display();
			}
		}

	}

	boolean isFull(){
		return(rear==size-1);
	}

	boolean isEmpty() {
		return (front>rear);
	}
} //end of class


public class ProductQueueDemo {
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		ProductQueue q =new ProductQueue(5);

		q.insert(new Product("Table" ,5000 ,5));
		q.insert(new Product("chair" ,3000 ,5));
		q.insert(new Product("Marker" ,100 ,10));

		q.display();
		q.remove();
		q.display();

		System.out.print("Enter product name");
		String name =sc.next();


		System.out.print("Enter product rate");
		double rate =sc.nextDouble();

		System.out.print("Enter product quantity");
		int qty =sc.nextInt();

		q.insert(new Product(name,rate,qty));
		q.display();

		sc.close();

	}
}


















