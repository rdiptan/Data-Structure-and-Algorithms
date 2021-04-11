package circular_queue;

public class Main {
	public static void main(String[] args) {
		Queue soft= new Queue();
		soft.enqueue(10);
		soft.enqueue(20);
		soft.enqueue(30);
		soft.enqueue(40);
		soft.enqueue(50);
		soft.dequeue();
		soft.enqueue(60);	
		soft.enqueue(70);
		soft.dequeue();
		soft.dequeue();
		soft.enqueue(80);	
		soft.enqueue(90);
		
		soft.display();
	}
}
