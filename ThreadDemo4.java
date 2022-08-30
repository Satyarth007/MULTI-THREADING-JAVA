class MyThread4 extends Thread{
	public void start() {
		System.out.println("START METHOD");
	}
	public void run() {
		System.out.println("RUN METHOD");
	}
}
public class ThreadDemo4 {

	public static void main(String[] args) {
		// OVERRIDING start() :- it will executed just like a normal method.
		// Total output will be dependent on the MAIN THREAD ONLY, NO OTHER THREAD IS CREATED HERE. 
		
		MyThread4 t=new MyThread4();
		t.start();
		System.out.println("MAIN METHOD");
		
		// OUTPUT :-
		/* 
		     START METHOD
                     MAIN METHOD
		*/
	}

}
