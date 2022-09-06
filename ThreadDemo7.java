class MyThread7 extends Thread{
	public void run() {
		System.out.println("RUN METHOD :"+Thread.currentThread().getName());
	}
}
public class ThreadDemo7 {

	public static void main(String[] args) {
		// We can set and get the name of particular thread.
		// for this we use two defined methods :-
		//     1. getName()
		//     2. setName(String name)
		
		System.out.println(Thread.currentThread().getName());   // main
		MyThread7 t=new MyThread7();
		t.start();
		
		System.out.println(t.getName());  // Thread-0 :- because its the first thread 
		t.setName("satyarth");
		System.out.println(t.getName());  // we change the thread t name from Thread-0 to satyarth
		
		System.out.println(Thread.currentThread().getName());   // main

		// NOTE :- Thread.currentThread() helps to get current working thread object

	}

}
