package queue;

/**This interface is made to implement an queue in Java, with the two principal methods, add and remove.
 * @author jmaccou
 *
 * @param <T> the type of data that we have to store in the queue
 */
public interface Queue<T> extends Iterable<T> {
	/** This method should take the data and add it as the last element of the queue.
	 * @param data the data to add to the queue.
	 */
	public void add(T data);
	
	/** This method takes the first element of the queue, remove it from the queue and return it.
	 * @return the first element of the queue.
	 */
	public T remove();
	
	/** This method take the queue and test if it's empty or not.
	 * @return {@code true} if the queue is empty, {@code false} elsewhere.
	 */
	public boolean isEmpty();
	
	/** This method return the size of the queue to know the number of elements inside it.
	 * @return the size of the queue.
	 */
	public int size();
}
