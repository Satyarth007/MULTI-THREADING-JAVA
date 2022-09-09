/*
  join() :- If a thread wants to wait until completing some other thread then we should go for join(). 
  ======
  METHOD SYNTAX :- 
  	1. public final void join() throws InterruptedException
  	2. public final void join(long ms) throws InterruptedException
  	3. public final void join(long ms, int ns) throws InterruptedException
  	
  	NOTE :- Every join() throws interrupted exception , hence we compulsory handle it.
  	
  	ACCORDING TO THREAD LIFE CYCLE IN CASE OF join() :- 
  		1. either t2 gets completed.
  		2. either time expires. 
  		3. or waiting thread gets interrupted.
 */

// CASE 1 :- When main thread is waiting for child thread 
class MyThread10 extends Thread{
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println(" THOR ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
public class ThreadDemo10 {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println(" STRONGEST AVENGER :- ");
		MyThread10 t=new MyThread10();
		t.start();
		
		t.join();     // THIS WILL MAKE THE MAIN THREAD WAIT TILL THE CHILD THREAD COMPLETES
		
		for(int i=0;i<10;i++) {
			 	System.out.println(" HULK ");
		}
		

	}

}

// CASE 2 :- When child thread is waiting for main thread 
/*
class MyThread10 extends Thread{
	static Thread mt;
	public void run() {
	try{
		mt.join();     // this will make child thread wait for main thread
		}
		catch(){}
		
		for(int i=0;i<10;i++) {
			System.out.println(" THOR ");
		}
	}
}
public class ThreadDemo10 {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println(" STRONGEST AVENGER :- ");
		
		MyThread10.mt=Thread.currentThread();  // creating main thread object
		
		MyThread10 t=new MyThread10();
		t.start();
		
		for(int i=0;i<10;i++) {
			 	System.out.println(" HULK ");
			 	Thread.sleep(2000);
		}
		

	}

}
// CASE 3 :- WHEN BOTH THE THREAD CALLS join() 
   If main thread call join() for child thread and child thread calls join() for main thread,
   then the program will be stucked. This is something like DEADLOCK. 
   
   
// CASE 4 :- WHEN THREAD CALLS join() FOR ITSELF 
  If a thread calls a join join() on the thread itself then the program 
  will be stucked forever. This is something is called as DEADLOCK.   
  EX :- 
  	
  		public class ThreadDemo{
  			public static void main(String[] args){
  				Thread.currentThread().join();
  				}	
  			}
  		OUTPUT:- no output for infinite time 		
  
  
  
  
  
  
  
  
  
  
  
*/
