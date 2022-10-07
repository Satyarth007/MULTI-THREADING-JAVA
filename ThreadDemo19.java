class MyThread19 extends Thread{
	
}
public class ThreadDemo19 {

	public static void main(String[] args) {
		// DAEMON THREADS BY SATYARTH
		
		System.out.println(Thread.currentThread().isDaemon());  // FALSE
//	    Thread.currentThread().setDaemon(true);	:- RE-IllegalThreadStateException
		
		MyThread19 t=new MyThread19();
		System.out.println(t.isDaemon());  // FALSE
		t.setDaemon(true);
		System.out.println(t.isDaemon());

	}

}
