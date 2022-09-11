/*
  NOTE 1:- Whenever we are calling interrupt method , if the target thread not in sleeping or waiting state
  ======   the there is no impact of interrupt() immediately.Interrupt call will wait until target thread
  		   enters into sleeping/waiting state.
  		   
  NOTE 2:- If the target thread never entered into sleeping/waiting state in its lifetime, then there is no 
  ======   	impact of interrupt() .This is the only call where interrupt() will be wasted.
  
 */

class MyThread13 extends Thread{
	public void run() {
		
			for(int i=1;i<=1000;i++) {
				System.out.println("I AM A LAZY THREAD "+i);
				
			}
			System.out.println("I AM ENETRING INTO SLEEPING STATE!");
		try {
			Thread.sleep(2000);
			System.out.println("AM I DREAMING!");
		}
		catch(InterruptedException e) {
			System.out.println("I GOT INTERRUPTED!");
		}
	}
}
public class ThreadDemo13 {

	public static void main(String[] args) {
		MyThread13 t=new MyThread13();
		t.start();
		t.interrupt();  // this interrupt() call will wait 1000 times execution of for loop.
		               
		System.out.println("END OF MAIN THREAD!");

	}

}
