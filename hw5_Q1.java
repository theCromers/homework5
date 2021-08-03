package hw5;

public class hw5_Q1 {
	public static void main(String[] args) {
		System.out.println(getStrippedNumber(10));
		System.out.println(getStrippedNumber(25));
		System.out.println(getStrippedNumber(200));
	}
	public static int getStrippedNumber(int num) {
	    int numberOfDecSets;
	    if ((numberOfDecSets = num % 10) == 0) {
	        return num - numberOfDecSets;
	    } else {
	        num= num - (numberOfDecSets + 1 );
	        return num;
	    }
	}

}
