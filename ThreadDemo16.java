/*
  SYNCHRONIZED BLOCK :- If very few lines of code required synchronization then it is not recommended 
 --------------------   to declare entire method as synchronized . We have to enclose that portion of 
  						code as synchronized only.
  						
  	MAIN ADVANTAGES OF SYNCHRONIZED BLOCK :- 
  	--------------------------------------
  	1. It reduces waiting time of threads.
  	2. Improves performance of the system.
  	
  	* We can declare SYNCHRONIZED BLOCK in following ways:-
  	
  	1. to get LOCK of CURRENT OBJECT :-
  	   -----------------------------
  	   synchronized(this){
  	   
  	   			necessary code
  	   		}
  	   		
  	2. to get LOCK of PARTICULAR OBJECT 'b' :- 
  	   -------------------------------------
  	   synchronized(b){
  	   
  	   			necessary code
  	   
  	   }
  	3. to get CLASS LEVEL LOCK :- 
  	   -------------------------------------
  	   synchronized(XXX.class){
  	   
  	   			necessary code-
  	   
  	   }     
  	   
  	      		
 NOTE :- LOCK CONCEPT is available for class and object types but not for primitives .Hence , we can't 
  	     pass primitive type as argument to synchronized block otherwise COMPILE TIME ERROR saying-
  	     ex:-
  	     
  	     		int x=10;
  	     		synchronized(x){		CE:- Unexpected type
  	     								     found : int
  	     				some code			 required : reference
  	     		}
  	     		
  	     		
  	 */
class show{
	public void wish(String name) {
		;;;;;;;;;; // suppose thousand lines of code
		synchronized(this) {
			for(int i=0;i<0;i++) {
				System.out.println("GOOD MORNING");
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(name);
				}
			}
		}
		;;;;;;;;;; // suppose thousand lines of code
		
	}
}
class MyThread16 extends Thread{
	show s;
	String name;
	MyThread16(show s, String name){
		this.s=s;
		this.name=name;
	}
	public void run() {
		s.wish(name);
	}
}
public class ThreadDemo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show s=new show();
		MyThread16 t1=new MyThread16(s,"satya");
		MyThread16 t2=new MyThread16(s,"satu");
		t1.start();
		t2.start();
	}

}
