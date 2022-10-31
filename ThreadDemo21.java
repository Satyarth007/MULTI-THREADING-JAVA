/*
 							METHODS OF THREAD GROUP
 							=======================
    1. String getName() :- returns name of the THREAD GROUP
       ================	
 						
    2. int getMaxPriority():- returns max priority of thread group.
       ====================
       
    3. void setMaxPriority(int p):- to set maximum priority (DEFAULT =10)
       ==========================
    
    NOTE:- Thread in the thread group that have already higher priority won't be affected but 
           for newly added threads this max priority is applicable.
    
    4. ThreadGroup getParent():- returns parent group of current thread.
       =======================
       
    5. void list():- prints info about thread group to console
       ============
       
    6. int activeCount():- returns no. of active threads present in thread group.
       =================
    
    7. int activeGroupCount():- return no. of active groups in thread group.
       ======================
       
    8. int enumerate(Thread[] t):- to copy all active threads of this Thread group into provided 
       =========================   thread array. sub-thread groups are also considerd 
       
    9. int enumerate(ThreadGroup[] g):- to copy all active sub-thread into thread group array
       ==============================
       
    10. boolean isDaemon():- to check weather the thread group is daemon or not.
        ==================
        
    11. void setDaemon(boolean b):- to set thread group as daemon
        =========================
     
    12. void interrupt():- to interrupt all waiting/sleeping thread present in thread group.
        ================
                                     	
    13. void destroy():-to destroy thread group and sub thread group.
        ==============               	
 */
public class ThreadDemo21 {

	public static void main(String[] args) {
		ThreadGroup g1 = new ThreadGroup("tg");
		
		Thread t1= new Thread(g1,"Thread 1");
		
		Thread t2 = new Thread(g1,"Thread 2");
		
		g1.setMaxPriority(3);
		
		Thread t3=new Thread(g1,"Thread 3");
		
		System.out.println(t1.getPriority());   // 5
		System.out.println(t2.getPriority());   // 5
		System.out.println(t3.getPriority());   // 3

	}

}
