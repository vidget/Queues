import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class App {

	public static void main(String[] args) {
		
		
		
		//(head) <-00000 <- (tail)
		
		//QUEUE is FIFO first in, first out
		//Always adding to the tail and removing from the head
		
		//QUEUE can have a maximum size. 
		//			Throws exception    Returns special value
		//INSERT	add(e)				offer(e) -- false
		//REMOVE 	remove()			poll()
		//EXAMINE	element()			peek()
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		//Throws an exception when there  is no items in the QUEUE
		//System.out.println("Head of queue is: "+ q1.element());
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		//displays the first element
		System.out.println("Head of queue is: "+ q1.element());
		
		
		//q1.add(40); If try to add this line it would exceed the size of the QUEUE 
		//would cause a runtime exception.
		
		// I can handle it with a TRY-CATCH block
		
		try{
			q1.add(40);
		}
		catch(IllegalStateException e)
		{
			System.out.println("Tried to add to many items");
		}
		
		// to see what's in the QUEUE
		for(Integer value: q1){
			System.out.println("Queue value "+ value);
		}
		
		//removes the value from the HEAD of the QUEUE
		//Integer value = q1.remove(); //this applies it to a variable
		
		System.out.println("Removed from queue: "+ q1.remove());
		System.out.println("Removed from queue: "+ q1.remove());
		System.out.println("Removed from queue: "+ q1.remove());
		
		//Using the try catch block to catch if too many items are removed
		try{
			System.out.println("Removed from queue: "+ q1.remove());
		}catch(NoSuchElementException e){
			System.out.println("Tried to remove too many items from queue");
		}
		
		////////////////////////////////////////////////////////////////////
		
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		
		q2.offer(40);
		q2.offer(50);
		q2.offer(60);
		
		// to see what's in the QUEUE
		for(Integer value: q2)
		{
			System.out.println("Queue value "+ value);
		}
		
		
		///////////OUTPUT///////////////
		/*
		 Head of queue is: 10
		 Tried to add to many items
		 Queue value 10
		 Queue value 20
		 Queue value 30
		 Removed from queue: 10
		 Removed from queue: 20
		 Removed from queue: 30
		 Tried to remove too many items from queue
		 Queue value 40
		 Queue value 50
		*/
	}

}
