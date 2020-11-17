//--> Sto cambiano la 2a branch 
package test;

public class C9 {
	public static void m(Integer[] b1, Integer[] b2) {
		
	    if (((b1[0] != null) && (b2[0] != null )) &&	
	    	((b1[0] instanceof Integer) && (b2[0] instanceof Integer))) {
	    	System.out.println("Valori passati = " + b1[0] + " " + b2[0]); 
	    	Integer app = b1[0];
	    	b1[0] = b2[0];
	    	b2[0] = app;
	    	//System.out.println(b1[0] + " " + b2[0]); 
	    }
	} 
	 
	public static void main(String[] args) {
		Integer[] a1 = {2 , 9 };
		Integer[] a2 = {4 , 7 };
		m(a1, a2); 
		System.out.println("Valori swappati = " + a1[0] + " " + a2[0]); 
	}
	
}
