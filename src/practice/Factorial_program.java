package practice;

public class Factorial_program {
	public static void main (String args[]) {
		int num=5;
		int fact=num;
		while (num>1) {
			num--;
			fact=fact*num;
			
			
		}
		System.out.println(fact);
	}
	

}
