/* Kata Level: 7.
 * 
 * Definition:
 * Strong number is the number that the sum of the factorial of its digits is equal to number itself.
 * 
 * For example, 145 is strong, since 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * 
 * Task:
 * Given a number, Find if it is Strong or not and return either "STRONG!!!!" or "Not Strong !!".
 * 
 * Notes:
 * Number passed is always Positive.
 * Return the result as String.
 * 
 * Input >> Output Examples:
 * 
 * strong_num(1) ==> return "STRONG!!!!"
 * Since, the sum of its digits' factorial (1) is equal to number itself, then its a Strong.
 * 
 * strong_num(123) ==> return "Not Strong !!"
 * Since the sum of its digits' factorial of 1! + 2! + 3! = 9 is not equal to number itself, then it's Not Strong .
 * 
 * strong_num(2)  ==>  return "STRONG!!!!"
 * Since the sum of its digits' factorial of 2! = 2 is equal to number itself, then its a Strong.
 * 
 * strong_num(150) ==> return "Not Strong !!"
 * Since the sum of its digits' factorial of 1! + 5! + 0! = 122 is not equal to number itself, Then it's Not Strong .
 */

 public class StrongNumber {

	public static String isStrongNumber(int num) {
		String numeroTexto = Integer.toString(num);
		int resultadoTotal = 0;
		int factorial = 1;
		for(int i = 0 ; i < numeroTexto.length() ; i++) {
			for(int j = 1 ; j <= Character.getNumericValue(numeroTexto.charAt(i)) ; j++)
				factorial *= j;
			resultadoTotal += factorial;
			factorial = 1;
		}
        return (resultadoTotal == num) ? "STRONG!!!!" : "Not Strong !!";
    }

	public static void main(String[] args) {
	
		System.out.println(isStrongNumber(1));
		System.out.println(isStrongNumber(145));
		System.out.println(isStrongNumber(2));
		System.out.println(isStrongNumber(9));
	
	}

}