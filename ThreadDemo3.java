class MyThread3 extends Thread
{
	
}

	public class ThreadDemo3 {


	public static void main(String[] args) {
		// NO OVERRIDING OF run()
		MyThread3 t=new MyThread3();
		t.start();
		// NO OUTPUT WILL BE RECIEVED 
		// IT IS RECOMMENDED TO OVERRIDE run() OTHERWISE DON'T USE MULTI-THREADING
	}

}
