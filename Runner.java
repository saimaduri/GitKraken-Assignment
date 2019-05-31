public class Runner {

    public static void main (String[]args) {
    	printQuotient(7, 2);
    	System.out.println();
        System.out.println(perfectSquare(64));
    }

    public static void printQuotient(float a, float b) {
        System.out.printf("%.3f", a/b);
    }

    public static boolean perfectSquare(int a) {
        for(int x=0;x<a;x++){
	    	if(x*x==a)
	    	    return true;
	        }
	    return false;
    }

    public static interface PerfectSquare{
	    public static boolean perfectSquare(int a){
	    	return false;
	    }
	}

	public static interface PrintQuotient {
		public static void printQuotient(float a, float b){}
	}
    
}

