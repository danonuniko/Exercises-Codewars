/* Kata Level: 7.
 * 
 * Implement a function that accepts 3 integer values a, b, c. 
 * The function should return true if a triangle can be built 
 * with the sides of given length and false in any other case.
 * 
 * (In this case, all triangles must have surface greater than 0 to be accepted).
 */

public class TriangleChecker {

	public static boolean isTriangle(int a, int b, int c){
	    return (a < b+c && b < a+c && c < a+b);
	  }
	
	public static void main(String[] args) {
		
		System.out.println(isTriangle(1, 2, 3));
		System.out.println(isTriangle(2, 4, 6));
		System.out.println(isTriangle(3, 3, 3));
		
	}

}
