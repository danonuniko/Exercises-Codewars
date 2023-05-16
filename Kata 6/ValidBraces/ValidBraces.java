/* Kata Level: 6.
 *
 * DESCRIPTION:
 * Write a function that takes a string of braces, and determines if the order of the braces is valid. 
 * It should return true if the string is valid, and false if it's invalid.
 * 
 * All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 * What is considered Valid?
 * A string of braces is considered valid if all braces are matched with the correct brace.
 * 
 * Examples:
 * 
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 */

import java.util.Stack;

public class ValidBraces {

	// Mi solución, aprendida con el reto #10 de moureDev. Si necesito repasar la lógica en él lo explico con comentarios.
	public static boolean isValid(String braces) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0 ; i < braces.length() ; i++) {
			if(braces.charAt(i) == '(' || braces.charAt(i) == '[' || braces.charAt(i) == '{')
				stack.push(braces.charAt(i));
			if(braces.charAt(i) == ')' || braces.charAt(i) == ']' || braces.charAt(i) == '}') {
				if(stack.isEmpty())
					return false;
				char top = stack.pop();
				if(top == '(' && braces.charAt(i) != ')' || top == '[' && braces.charAt(i) != ']' || top == '{' && braces.charAt(i) != '}')
					return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		System.out.println(isValid("(){}[]"));		// true
		System.out.println(isValid("([{}])"));		// true
		System.out.println(isValid("(}"));			// false
		System.out.println(isValid("[(])" ));		// false
		System.out.println(isValid("[({})](]"));	    // false
		
	}

}