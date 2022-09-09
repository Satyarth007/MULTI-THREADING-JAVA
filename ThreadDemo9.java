// PREVENTING THREAD EXECUTION :-
/*  
 * We have three methods to prevent a particular thread execution :- (join and sleep will be on next java file)
 	1. yield();
 	2. join();
 	3. sleep();
 	
 	yield() :- it causes to pause current executing thread to give the chance 
 	=======    for waiting threads of same priority.
 	
 	* if there is no waiting thread or threads having low priority , then same thread continues executing.
 	* if multiple threads are waiting with same priority , then output depends on THREAD SCHEDULER.
 	
 	METHOD SYNTAX :- 
 		 | public static native void yield(); |
 	
 */

class MyThread9 extends Thread{
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("CHILD THREAD");
			Thread.yield();
		}
	}
}
public class ThreadDemo9 {

	public static void main(String[] args) {
		MyThread9 t=new MyThread9();
		t.start();
		for(int i=1;i<10;i++) {
			System.out.println("MAIN THREAD");
			
		}

	}

}
// NOTE :- SOME PLATEFORM WON'T PROVIDE SUPPORT FOR YIELD().
