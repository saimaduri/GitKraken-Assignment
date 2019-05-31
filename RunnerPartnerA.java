public class Runner implements PrintQuotient {

    public static void main (String[]args) {
    	printQuotient(7, 2);
    }

    public static void printQuotient(float a, float b) {
        System.out.printf("%.3f", a/b);
    }
    
}