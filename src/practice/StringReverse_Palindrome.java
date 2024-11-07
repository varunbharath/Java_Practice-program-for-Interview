package practice;

public class StringReverse_Palindrome {
	public static void main(String[] args) {
        // Original string
        String word = "Mango";
        // To store the reversed string
        String word2 = "";
        
        // Loop to reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            word2 = word2 + word.charAt(i);
        }
        
        // Print the reversed string
        System.out.println("Reversed String: " + word2);

        // Check if the original string and reversed string are the same
        if (word.equalsIgnoreCase(word2)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    } 

}
