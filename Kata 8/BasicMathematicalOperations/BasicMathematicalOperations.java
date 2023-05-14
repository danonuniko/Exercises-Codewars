/* Kata Level: 8.
 * 
 * Your task is to create a function that does four basic mathematical operations.
 * The function should take three arguments - operation(string/char), value1(number), value2(number).
 * The function should return result of numbers after applying the chosen operation.
 * 
 * Examples(Operator, value1, value2) --> output:
 * 
 * ('+', 4, 7) --> 11
 * ('-', 15, 18) --> -3
 * ('*', 5, 5) --> 25
 * ('/', 49, 7) --> 7
 */

 public class BasicMathematicalOperations {

	// Mi solución.
	public static Integer basicMath(String op, int v1, int v2) {
		switch (op) {
		case "+":
			return v1 + v2;
		case "-":
			return v1 - v2;
		case "*":
			return v1 * v2;
		case "/": // La función devuelve un int, por lo que no podemos hacer la división con resultado tipo float.
			if (v2 != 0)
				return v1 / v2;
			throw new IllegalArgumentException("Division by zero");
		default:
			throw new IllegalArgumentException("Unknown operation: " + op);
		}
	}

	// Solución de la comunidad.
	public static Integer basicMath1(String op, int v1, int v2) {
		return (op == "+") ? (v1 + v2)
				: (op == "-") ? (v1 - v2) : (op == "*") ? (v1 * v2) : (v2 == 0) ? null : (v1 / v2);
	}

	public static void main(String[] args) {

		System.out.println(basicMath("+", 3, 6));
		System.out.println(basicMath("-", 3, 6));
		System.out.println(basicMath("*", 3, 6));
		System.out.println(basicMath("/", 6, 3));
		System.out.println(basicMath("/", 2, 0));
		System.out.println(basicMath("a", 2, 5));

	}

}