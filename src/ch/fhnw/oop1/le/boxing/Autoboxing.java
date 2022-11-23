package ch.fhnw.oop1.le.boxing;

class Autoboxing {

	public static void main(String[] args) {
		Integer m1 = 2;
	    Integer n1 = 2;
	    System.out.println("A: " + (m1 == n1));   
	    Integer m2 = 127;
	    Integer n2 = 127;
	    System.out.println("B: " + (m2 == n2));   
	    Integer m3 = 128;
	    Integer n3 = 128;
	    System.out.println("C: " + (m3 == n3));   
	    Integer m4 = 1000;
	    Integer n4 = 1000;
	    System.out.println("D: " + (m4 == n4));
	    Integer m5 = 128;
	    Integer n5 = 128;
	    System.out.println("E: " + (m5 + 0 == n5 + 0));  
	    
	    // int n = (Integer) null;  
	    
        System.out.println("F: " + (new Integer(1) == 1));
    }
}
