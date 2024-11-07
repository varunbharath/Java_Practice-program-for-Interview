package practice;

public class Fibonacci_numbers {
	public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int num;  // Declare the variable num

        System.out.println(a);
        System.out.println(b);

        for(int i = 0; i < 5; i++) {
            num = a + b;  // Calculate the next Fibonacci number
            a = b;
            b = num;
            System.out.println(num);  // Print the next Fibonacci number
        }
    }

}
