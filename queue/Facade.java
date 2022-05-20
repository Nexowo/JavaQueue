package queue;

import java.util.Iterator;

/**Implementation of the design pattern facade 
 * @author jmaccou
 *
 */
public class Facade {
	private ArrayQueue<Integer> myQueue;
	
	/**
	 * Constructor of the facade
	 */
	public Facade() {
		this.myQueue = new ArrayQueue<>();
	}
	
	/**
	 * Main method of the pattern.
	 * We can suppress the warning as there is no conflict between int and Integer.
	 */
	@SuppressWarnings("boxing")
	public void doSomething() {
		for(int i=1; i<=5; ++i) {
			this.myQueue.add(i);
		}
		
		Iterator<Integer> it1 = this.myQueue.iterator();
		
		while(it1.hasNext()) {
			System.out.print(it1.next());
		}

		System.out.println("\n"); //$NON-NLS-1$
		
		Iterator<Integer> it2 = new OddPosIterator(this.myQueue);
		
		while(it2.hasNext()) {
			System.out.print(it2.next());
		}
	}
}
