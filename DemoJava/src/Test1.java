
public class Test1 {
	String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
     static void change(){  
    college = "BBDIT";
    //name="mm";
    Test1 t=new Test1();
	t.test();
    }  
	 void test() {
		 
	 }
     
     public static void main(String[] args) 
	    { 
	    	Test1 t=new Test1();
	    	t.change();
	    	System.out.println(college);
	       /* Test1 m = new Test1(); 
	  
	        // Calling finalize method Explicitly. 
	        m.finalize(); 
	        m.finalize(); 
	        m = null; 
	        char ch='1';
	        int n=10;
	        n=12;
	        
	  
	        // Requesting JVM to call Garbage Collector method 
	        System.gc(); 
	        System.out.println("Main Completes"); 
	    } 
	  
	    // Here overriding finalize method 
	    public void finalize() 
	    { 
	        System.out.println("finalize method overriden"); */
	    } 
	} 

