/*
   CLASS LEVEL LOCK :- Every class in java has a unique lock which has nothing but Class level lock.
   -----------------
   
  - If a thread wants to execute 'static synchronized' method then thread requires class level lock .
    Once thread got class level lock , then it is allowed to execute an static synchronized class.
    Once method execution is complete ,class releases the lock.
    
  - While a thread executing 'static synchronized' method , the remaining 'static synchronized' 
    methods are not allowed to execute ,they went to waiting state. But other than these methods can run.   
   
   
 */

class displayy{
	public synchronized void displayN() { 
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}
	public synchronized void displayC() { 
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
class MyThreadNumber extends Thread{
	displayy d;
	MyThreadNumber(displayy d){
		this.d=d;
	}
	public void run() {
		d.displayN();
	}
}
class MyThreadCharacter extends Thread{
	displayy d;
	MyThreadCharacter(displayy d){
		this.d=d;
	}
	public void run() {
		d.displayC();
	}
}
public class ThreadDemo15 {

	public static void main(String[] args) {
		displayy d=new displayy();
		MyThreadNumber t1=new MyThreadNumber(d);
		MyThreadCharacter t2=new MyThreadCharacter(d);
		t1.start();
		t2.start();

	}

}
