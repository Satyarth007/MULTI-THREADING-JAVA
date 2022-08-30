class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println("CHILD THREAD");
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		// Defining a THREAD by extending the THREAD CLASS
		
		// Till here only one thread i.e. MAIN THREAD is working 
	
		MyThread1 t=new MyThread1();
		t.start();
		
		// FROM HERE TWO THREADS ARE WORKING i.e. MAIN AND CHILD
		
		for(int i=0;i<6;i++) {
			System.out.println("MAIN THREAD");
		}

	}

}
// NOTE:- main thread and main method are different entities.
// NOTE:- WE CAN'T EXPECT THE ORDER OF OUTPUT.