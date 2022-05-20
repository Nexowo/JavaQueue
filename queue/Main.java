package queue;

/** Main class to test the code.
 * @author jmaccou
 *
 */
public class Main {

	/** 
	 * @param args the arguments we can give to the main method.
	 * we can suppress the warning as there is no conflict between Integer and int.
	 */
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.doSomething();
	}

}
