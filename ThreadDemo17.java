/*
                              INTER THREAD COMMUNICATION
                              --------------------------
   - Two threads can communicate by using wait(), notify() and notifyAll().
   
   - The thread which is expecting the updation is responsible to call wait() then immediately 
     thread will enter into waiting state.
     
   - The thread which is responsible for updation, after performing updation is responsible to call 
     notify() then waiting thread will get the notification and complete its execution with updated items
    
NOTE :- wait(),notify() and notifyAll() are present in Object class but not in Thread class because
  		thread can call this on any object.
  		
NOTE :- To call wait(), notify() and notifyAll() methods on any object, thread should be owner of that
  		object i.e. thread should has LOCK of that object i.e. thread should be in the SYNCHRONIZED AREA.
  		Used only inside synchronized area otherwise RUNTIME EXCEPTION SAYING :-
  		                     RE :- IllegalMonitorStateException 

NOTE :- If a thread calls wait() on any object it immediately releases the lock of particular 
  		object and enter into waiting state.
  		
NOTE :- If a thread calls notify() on any object it releases the lock of that object but may 
		not immediately.
		
NOTE :- Except wait(), notify() and notifyAll() there is no other method where thread releases the lock.

		METHODS AVAILABLE:-
		-----------------
		
	* public final void wait() throws InterruptedException	
    * public final native void wait(long ms) throws InterruptedException	
	* public final void wait(long ms, int ns) throws InterruptedException	
	* public final native void notify() throws InterruptedException	
	* public final native void notifyAll() throws InterruptedException	  
	 
	
NOTE:- Every wait() throws InterruptedException which is a checked exception, hence whenever we are 
	   using wait() compulsory we should handle it.
  		                     
        
                              
                              
 */



class THREADX extends Thread
{
	int sum=0;
	public void run() {
		synchronized(this) {
			System.out.println("CHILD THREAD STARTS CALCULATION");	 //2
			for(int i=1;i<=100;i++) {
				sum+=i;
			}
			System.out.println("CHILD THREAD GIVING NOTIFICATION "); //3
			this.notify();
		}
	}
}	
public class ThreadDemo17 {
	public static void main(String[] args) throws InterruptedException{
		THREADX x=new THREADX();
		x.start();
		synchronized(x) {
			System.out.println("MAIN THREAD CALLING WAIT METHOD");    //1
			x.wait();
			System.out.println("MAIN THREAD GOT NOTIFICATION");       //4
			System.out.println(x.sum);			          //5
		}

	}

}

/*
 OUTPUT:- 
 			MAIN THREAD CALLING WAIT METHOD
			CHILD THREAD STARTS CALCULATION
			CHILD THREAD GIVING NOTIFICATION 
			MAIN THREAD GOT NOTIFICATION
			5050
 */
