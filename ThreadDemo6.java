class MyThread6 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("CHILD THREAD");
		}
	}
}
public class ThreadDemo6 {

	public static void main(String[] args) {
		// RUNNABLE INTERFACE TO CREATE A THREAD
		MyThread6 r=new MyThread6();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("MAIN THREAD");
		}
		

	}

}
