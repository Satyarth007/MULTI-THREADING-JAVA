class MyThread5 extends Thread{
	public void start() {
		super.start();  // INVOKING THREAD CLASS start().
		System.out.println("START METHOD");
	}
	public void run() {
		System.out.println("RUN METHOD");
	}
}
public class ThreadDemo5 {

	public static void main(String[] args) {
		// Here, we are still overriding the start() but we have invoked start() of THREAD CLASS too .
		// so here we have two threads working simultaneously.
		MyThread5 t=new MyThread5();
		t.start();
		System.out.println("MAIN METHOD");
		// there are three possibilities of output .
		/*  
		       P-1 			   P-2		                     P-3
		   START METHOD 		RUN METHOD			  START METHOD
		   RUN METHOD			START METHOD		          MAIN METHOD
		   MAIN METHOD			MAIN METHOD			  RUN METHOD
		 
		*/
		

	}

}
