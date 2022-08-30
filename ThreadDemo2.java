class MyThread2 extends Thread{
	public void run() {
		System.out.println("NO ARGUMENT METHOD");
	}
	public void run(int i) {
		System.out.println("INTEGER ARGUMENT METHOD");
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		//OVERLOADING OF run() :-   only no argument run() is invoked by the start().
		MyThread2 t=new MyThread2();
		t.start();
//		t.run(8);   :-  we have to call the argument based run() explicitly

	}

}
