// THREAD PRIORITY -     RANGING ( 1 TO 10 )

// least priority =1
// highest priority = 10
class MyThread8 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("CHILD THREAD");
		}
	}
}
public class ThreadDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		   some constants :- 
		 * Thread.MIN_PRIORITY   :- 1
		 * Thread.NORM_PRIORITY  :- 5
		 * Thread.MAX_PRIORITY   :- 10 
		 
		 THREAD CLASS DEFINES FOLLOWING METHODS TO get AND set PRIORITY OF A THREAD :-
		 1. getPriority();
		 2. setPriority(int P);
		 
NOTE :- t.setPriority(18) will give Runtime Exception saying :- IllegalArgumentException.
NOTE :- DEFAULT PRIORITY OF MAIN THREAD =5.
NOTE :- REST THREADS HAVE DEFAULT PRIORITY ACCORDING TO THEIR PARENT-CHILD RELATIONSHIP.	
NOTE :- SOME SYSTEM WON'T PROVIDE SUPPORT FOR THREAD PRIORITY.	
		*/
		MyThread8 t=new MyThread8();
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("MAIN THREAD");
		}
	}

}
