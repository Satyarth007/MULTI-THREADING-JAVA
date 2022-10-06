/*
                            DEADLOCK CONCEPTS
                            -----------------
   - If two threads are waiting for each other for longer duration of time , such type of 
     infinite waiting is called as 'DEADLOCK'.
     
   - Synchronized keyword is the only reason for deadlock situation.
   - We should take special care if using synchronized keyword.
   - There are NO RESOLUTION TECHNIQUE for DEADLOCK, but SEVERAL PREVENTION TECHNIQUES are available.
   
     
   DEADLOCK VS STARVATION
   ----------------------
   
  - Long waiting of thread where waiting never ends is called DEADLOCK.
  
  - Whereas long waiting of a thread where waiting ends at a particular point is called STARVATION.  
  
  - EX:- low priority threads has to wait until completion of high priority threads. 
  
  
 */

class A{
	public synchronized void d1(B b) {
		System.out.println("Thread 1 starts execution of d1() method.");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread 1 trying to call B's last().");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A, this is last() method.");
	}
}
class B{
	public synchronized void d2(A a) {
		System.out.println("Thread 2 starts execution of d2() method.");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread 2 trying to call A's last().");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B, this is last() method.");
	}
}

public class ThreadDemo18 extends Thread {

	A a=new A();
	B b=new B();
	public void m1() {
		this.start();
		a.d1(b);          // main thread executing this
	}
	public void run() {
		b.d2(a);		  // child thread executing this
	}
	public static void main(String[] args) {
		//DEADLOCK CONCEPTS BY SATYARTH
		
		ThreadDemo18 d= new ThreadDemo18();
		d.m1();

	}

}


/*
 * OUTPUT:-				Thread 1 starts execution of d1() method.
						Thread 2 starts execution of d2() method.
						Thread 2 trying to call A's last().
						Thread 1 trying to call B's last().
						
						{still the waiting is going on}
	
 */
