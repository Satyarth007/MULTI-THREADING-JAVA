/*
   sleep() :-  If a thread don't want to perform any action for a particular amount of time, 
   =======		then we should go for sleep() method.
   
   METHOD SYNTAX :- 
   =============
   1. public static native void sleep(long ms) throws InterruptedException
   		EX :- t.sleep(2000);   ==> means stop the thread for 2 seconds
   2. public static void sleep(long ms, int ns) throws InterruptedException
   		EX :- t.sleep(2000,100);   ==> means stop the thread for 2.1 seconds
   
 NOTE :- Every sleep() throws InterruptedException, which is a checked exception.
 
 NOTE :- In thread life cycle ->
 		 If the thread is in sleeping state then two things can occur:-
 		 1. If the time expires.
 		 2. If the sleeping thread gets interrupted.
   
 */

public class ThreadDemo11 {

	public static void main(String[] args) throws InterruptedException {
		// Suppose an example of slide rotator:-
		for(int i=1;i<=10;i++) {
			System.out.println(" SLIDE - "+i);
			Thread.sleep(5000);   // each print statement of 'for loop' will come after 5 sec
		}

	}

}
