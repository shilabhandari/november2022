 package methods;

public class A {

	public static void main(String[] args) {
		
		A a = new A();
		a.A2();
		System.out.println(A.A2()[0]);
			
	}

	public static void A1() {
		
		A a = new A();
		a.A2();
		System.out.println("A1");
		
	}
	/*
	   public static void A2() {
    	
    	int x = 10;
    	int y = 20;
    	System.out.println(x+y);
    	System.out.println("another text");
    	System.out.println("hello");
    	System.out.println(x+y+x);
    	*/
    	//B.B1();
    	//A.A1();
    	
   // System.out.println("A2");
		
    	public static int[] A2() {
        	
        	int x = 10;
        	int y = 20;
        	int[] numbers = {x, y,x+1,y+1};
        	System.out.println(x+y);
        	System.out.println("another text");
        	System.out.println("hello");
        	System.out.println(x+y+x);
        	return numbers;
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}

	
	
	
}
