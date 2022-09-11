/*
  Interrupt():- A thread can interrupt a sleeping thread or waiting thread by using interrupt() method. 
  ===========  
  
  METHOD SYNTAX :-
  =============
  public void interrupt();
 */
class MyThread11 extends Thread{
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I AM A LAZY THREAD ");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("I GOT INTERRUPTED!");
		}
	}
}
public class ThreadDemo12 {

	public static void main(String[] args) {
		MyThread11 t=new MyThread11();
		t.start();
		t.interrupt();  // If we comment this entire line, then child thread won't be interrupted
		                // and the for loop runs 10 times.
		System.out.println("END OF MAIN THREAD!");
		
		// BUT IF WE ARE NOT COMMENTING THE t.interrupt() THEN :-
		/*
		 OUTPUT =>
		 			END OF MAIN THREAD!
         			I AM A LAZY THREAD 
		 			I GOT INTERRUPTED!

		 */

	}

}
