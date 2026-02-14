class Queue {
	int size ;
	int front ,rear ;
	int [] arr ;

	public Queue(int size){
		this.size =size ;
		arr =new int[size];
		front =0 ;
		rear =-1 ;
	}

	public boolean isFull(){
		return rear ==size-1;
	}

	public boolean isEmpty(){
		return front >rear ;
	}

	public void insert(int value) {
		if(isFull()){
			System.out.println("Queue is full");
		}
		else{
			rear++ ;
			arr[rear]=value ; //add value
			System.out.println(value +"inserted");
		}
	}
	public void remove(){
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
		}
		else {
			System.out.println(arr[front]+"removed");
			front++;
		}
	}
	public void Display(){
		if(isEmpty()){
			System.out.println("Queue is Empty!");
		}else {
			System.out.println("Queue Elements");
			for(int i=front ;i<=rear ;i++){
				System.out.println(arr[i]+" ");
			}

		}
	}

}
//end of class


public class QueueRemove{
	public static void main (String[]ARGS){
		Queue queue =new Queue(5);

		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.Display();
		queue.remove();
		queue.Display();

		queue.insert(40);
		queue.insert(50);
		queue.insert(60);
		queue.insert(70);

		queue.Display();
		





		

	}

}