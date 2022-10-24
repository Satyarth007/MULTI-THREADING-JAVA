/*
   MULTI-THREADING ENHANCEMENT 
   ---------------------------
   
 							THREAD GROUPS
 							=============
 	
 	- Based on functionality we can group threads into a single unit which is nothing but a 'thread-group'
 	  i.e. thread group contains group of threads.
 	  
 	- They can also contain sub -thread groups.
 	
 	  MAIN ADVANTAGES:-
 	  ===============
 	  1. We can perform common operations easily.
 	  2. Every thread in java belongs to some group.
 	  3. main thread belongs to main group.
 	  4. every thread group in java is the child group of system group either directly or indirectly.
 	     Hence, system groups access root access for all the threads groups in java.
 	     
NOTE:- ThreadGroup is a java class present in java.lang package and it is a direct child class of OBJECT.

 	  CONSTRUCTOR:-
 	  ===========
 	  
 	   1. ThreadGroup g = new ThreadGroup(String gName);
 	   
 	   - creates a new ThreadGroup with specified group.
 	   - parent of this new group is the thread group of currently executing thread.
 	   
 	   ex:- ThreadGroup g1 = new ThreadGroup("FIRST GROUP");
 	        System.out.println(g1.getParent().getName());      => MAIN
 	        
 	   2. ThreadGroup g = new ThreadGroup(ThreadGroup g, String gName);
 	   
 	   - creates a new ThreadGroup with a specified group name.
 	   - The parent of this new group is specified parent group.
 	   
 	   ex:- ThreadGroup g2=new ThreadGroup(g, "SECOND GROUP");     
 
 */
public class ThreadDemo20 {

	public static void main(String[] args) {
		
		ThreadGroup g1= new ThreadGroup("FIRST GROUP");
		System.out.println(g1.getParent().getName());
		
		ThreadGroup g2= new ThreadGroup(g1,"SECOND GROUP");
		System.out.println(g2.getParent().getName());
		
		
		

	}

}
