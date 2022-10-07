
/*
  								DAEMON THREADS
  								--------------
  	- The threads which are executing in the background are called Daemon threads.
  	  EX :- GARBAGE COLLECTOR, ATTACH LISTENER, SIGNAL DISPATCHER , ETC
  	
  	- The main objective of daemon thread is to provide support for non-daemon threads(MAIN THREAD).
  	  EX :- if main thread runs with low memory then JVM runs garbage collector to destroy useless objects
  	  		so that memory will be improved for main thread.
  	
  	- Usually, Daemon threads having low priority but based on our requirement Daemon threads can run 
  	  on high priority.
  	  
  	- We can check daemon nature of thread using isDaemon() of thread class.
  	
  	     		public boolean isDaemon()
  	  
  	- We can change the daemon nature using setDaemon() of thread class.
  	     		
  				public void setDaemon(boolean b)
  				
  	- But changing daemon nature is possible before starting of a thread only. After starting a thread
  	  if we are trying to change daemon nature we will get RUNTIME EXCEPTION :-
  	  				  
  	  				  IllegalThreadStateException
  	  				  
  	- By default main thread is always NON-DAEMON.
  	
  	- Only other thread's daemon nature will be inherited from parent to child , i.e. if the parent is 
  	  daemon then child is daemon too but if parent is non-daemon then child is also non-daemon. 
  	  
  	- It is IMPOSSIBLE to change demon nature of main thread because it's already 
  	  started by JVM at start.  				  
 */

class MyThread19 extends Thread{
	
}
public class ThreadDemo19a {

	public static void main(String[] args) {
		// DAEMON THREADS BY SATYARTH
		
		System.out.println(Thread.currentThread().isDaemon());  // FALSE
//	    Thread.currentThread().setDaemon(true);	:- RE-IllegalThreadStateException
		
		MyThread19 t=new MyThread19();
		System.out.println(t.isDaemon());  // FALSE
		t.setDaemon(true);
		System.out.println(t.isDaemon());  // TRUE

	}

}

