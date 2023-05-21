/* Kata Level: 6.
 * 
 * The Hamming Distance is a measure of similarity between two strings of equal length. 
 * Complete the function so that it returns the number of positions where the input strings do not match.
 * 
 * Examples:
 * 
 * a = "I like turtles"
 * b = "I like turkeys"
 * Result: 3
 * 
 * a = "Hello World"
 * b = "Hello World"
 * Result: 0
 * 
 * a = "espresso"
 * b = "Expresso"
 * Result: 2
 * 
 * You can assume that the two input strings are of equal length.
 */

public class NumberDifferencesLettersTwoStrings {
	
    // Solución en Java. No existe en Codewars pero modificamos la solución de C#.
	public static int distance(String a, String b) {
		int count = 0;
        for(int i = 0 ; i < a.length() ; i++) {
            if(a.charAt(i) != b.charAt(i))    count++;
        }
        return count;
	}

	public static void main(String[] args) {
        System.out.println(distance("I like turtles", "I like turkeys"));
        System.out.println(distance("Hello World", "Hello World"));
        System.out.println(distance("espresso", "Expresso"));
    }
	
}
