package queue;

/** This method create an abstract queue to implement the is empty method that shoule be the same for all the queues.
 * @author jmaccou
 *
 * @param <T> the type of data stored in the queue.
 */
public abstract class AbstractQueue<T> implements Queue<T> {
	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}
}
