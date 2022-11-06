class MyThread22 extends Thread{
	MyThread22(ThreadGroup g, String name){
		super(g,name);
	}
	public void run() {
		System.out.println("CHILD THREAD");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			
		}
	}
}
public class ThreadDemo22 {

	public static void main(String[] args) throws Exception{
		// SOME MORE FUNCTIONS OF THREAD GROUP 
		
		ThreadGroup pg= new ThreadGroup("PARENT GROUP");
		ThreadGroup cg= new ThreadGroup("CHILD GROUP");
		
		MyThread22 t1=new MyThread22(pg,"CHILD THREAD - 1");
		MyThread22 t2=new MyThread22(pg,"CHILD THREAD - 2");
		t1.start();
		t2.start();
		
		System.out.println(pg.activeCount());
		
		System.out.println(pg.activeGroupCount());
		
		pg.list();
		Thread.sleep(10000);
		
		System.out.println(pg.activeCount());
		
		System.out.println(pg.activeGroupCount());

	}

}
