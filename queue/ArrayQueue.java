package queue;
import java.util.Arrays;
import java.util.Iterator;

/** This class implements the Abstract queue with an array representation of it.
 * @author jmaccou
 *
 * @param <T> the Type of data stored in the queue.
 */
public class ArrayQueue<T> extends AbstractQueue<T> {
	private T dataArray[];
	
	/** Constructor of the ArrayQueue, were we instantiate the Array.
	 */
	public ArrayQueue() {
		this.grow(0);
	}

	@Override
	public void add(T data) {
		this.grow(this.size()+1);
		for(int i = this.size()-1; i>0; i--) {
			this.dataArray[i] = this.dataArray[i-1];
		}
		this.dataArray[0] = data;
	}

	@Override
	public T remove() {
		assert this.size() != 0;
		T data = this.dataArray[this.size()-1];
		this.grow(this.size()-1);
		return data;
	}

	@Override
	public int size() {
		return this.dataArray.length;
	}

	@Override
	public Iterator<T> iterator() {
		return new QueueIterator();
	}
	
	protected T getElementAt(int pos) {
		return this.dataArray[pos];
	}
	
	/** We can suppress the warning unchecked as the new array created is empty, there is no reason that this should be conflicts.
	 */
	@SuppressWarnings("unchecked")
	private void grow(int newSize) {
		if(newSize <= 0) {
			this.dataArray = (T[]) new Object[0];
		}
		else {
			this.dataArray = Arrays.copyOf(this.dataArray, newSize);
		}
	}
	
	private class QueueIterator implements Iterator<T> {
		int position;
		
		QueueIterator() {
			this.position = ArrayQueue.this.size()-1;
		}
		
		@Override
		public boolean hasNext() {
			return this.position >= 0;
		}

		@Override
		public T next() {
			final T dataElement = ArrayQueue.this.getElementAt(this.position);
			--this.position;
			return dataElement;
		}
	}
}
