class Queue {

	private int[] queue ;
	private int front ;
	private int rear;
	private int size ;

	public Queue(int size) {
		this.size =size ;
		queue =new int[size];
		front=0;
		rear =-1;
	}

	public void insert(int item) {
		if(!isFull()){
			rear++;
			queue[rear]=item ;
		}else {
			System.out.println("queue is full");
		}
	}

	public boolean isFull(){
		return rear ==size-1;
	}

	public void Display() {
		System.out.println("Queue Elements:");
		for(int i=front ;i<=rear ;i++){
			System.out.println(queue[i]+" ");
		}
		System.out.println();
	}
}

public class QueueDemo {
	public static void main(String[]args){
		Queue queue =new Queue(6);

		queue.insert(3);
		queue.insert(5);
		queue.insert(9);
		queue.insert(1);
		queue.insert(12);

		queue.Display();
		//queue.insert(15);
		//queue.Display();

		if(queue.isFull()){
			System.out.println("Queue is full");
		}else{
			System.out.println("Queue is still empty");
		}

	}
}