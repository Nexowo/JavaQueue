package queue;

import java.util.Iterator;

/** Implements an iterator to get all the odd positive numbers of the queue.
 * @author jmaccou
 *
 */
public class OddPosIterator implements Iterator<Integer> {
	private Iterator<Integer> queueIterator;
	private Integer next;
	
	/**Constructor of the Iterator.
	 * @param queue the queue we want to iterate on.
	 */
	public OddPosIterator(ArrayQueue<Integer> queue) {
		this.queueIterator = queue.iterator();
	}

	/** We already test the has next before entering in the function then we can suppress this warning.
	 */
	@SuppressWarnings("boxing")
	@Override
	public boolean hasNext() {
		if(!this.queueIterator.hasNext()) {
			return false;
		}
		
		Integer i = this.queueIterator.next();
		if(i%2 == 1) {
			this.next = i;
			return true;
		}
		return this.hasNext();
	}

	@Override
	public Integer next() {
		return this.next;
	}

}
