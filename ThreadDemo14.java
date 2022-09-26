/* CODE AND CONCEPTS BY SATYARTH
 * MY PERSONAL MULTI-THREADING NOTES.
   --------------------------------- 
  - Synchronized is the modifier applicable only for methods and blocks.
  
  - If multiple threads are trying to operate on same java object , then there may be a chance of 
    DATA INCONSISTENCY problem.
    
  - At a time only one thread is allowed to operate.
  
  - Disadvantage:- Increases waiting time.  
  
  - Internally, Every synchronization concept is implemented by using LOCK.Every object in java has a 
    unique LOCK, whenever we are using synchronized keyword then only LOCK concept came into picture. 
    
  - If a thread wants to execute synchronized method on the given object, first it has to get lock 
    on that object. Once its locked then it is ready to execute any synchronized method on the object.
    
  - Once execution completes , automatically thread releases the lock.
  
  - Locking mechanism is maintained my JVM.
  
  - Here java object has two parts :- 
       1. Non-synchronized area :- this can be accessed by any no. of threads simultaneously.
       2. Synchronized area :- this can be accessed by only one thread at a time. 
       
  - General programming practice:-
        synchronized area{
             wherever we are performing ADD/REMOVE/DELETE/REPLACE 
             i.e. where state of object is changing
          }
          
        non-synchronized area{
             wherever object state won't be changes like READ/DISPLAY operation     
          }
          
            
 */
class Display{
	public synchronized void wish(String name) {

// NOTE :- If we are NOT declaring wish() as synchronized then we will get IRREGULAR OUTPUT.	
		
		for(int i=0;i<4;i++) {
			System.out.println("GOOD MORNING : ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
		
	}
}
class MyThread14 extends Thread{
	Display d;
	String name;
	MyThread14(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}
public class ThreadDemo14 {

	public static void main(String[] args) {
		// SYNCHRONIZATION 
		Display d=new Display();
		MyThread14 t1=new MyThread14(d,"RAINA");
		MyThread14 t2=new MyThread14(d,"DHONI");
		t1.start();
		t2.start();
		

	}

}
