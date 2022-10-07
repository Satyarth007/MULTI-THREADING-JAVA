/*
   - Whenever last non-daemon thread terminology automatically all daemon threads will be terminated,
     irrespective of their position.
     
   - If commenting at point 1 both main and child thread are non-daemon and both threads will be
     executed until their completion.
   
   - If we are not commenting at point 1 then main thread is non-daemon and child thread is daemon.
     Hence, whenever main thread terminates child thread will be terminated .
          
 */

class MyThread19 extends Thread{
	public void  run() {
		for(int i=0;i<10;i++) {
			System.out.println("CHILD THREAD");  //this may not be completed 10 times
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
public class ThreadDemo19b {

	public static void main(String[] args) {
		MyThread19 t=new MyThread19();
		t.setDaemon(true);          // POINT 1
		t.start();
		System.out.println("END OF THE MAIN THREAD");

	}

}
