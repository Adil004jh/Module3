package recurssion;

public class recursion_day1_4 {
	public class MultiplicationTable {
	    public static void main(String[] args) {
	        int num = 5;
	        System.out.println("Multiplication table of " + num + " is:");
	        printMultiplicationTable(num, 1);
	    }
	    
	    public static void printMultiplicationTable(int num, int i) {
	        if (i <= 10) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	            printMultiplicationTable(num, i + 1);
	        }
	        }
	    }
