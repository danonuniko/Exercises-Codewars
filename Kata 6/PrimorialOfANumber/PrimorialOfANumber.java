/* Kata Level: 6.
 * 
 * Definition (Primorial Of a Number):
 * 
 * Is similar to factorial of a number, In primorial, not all the natural numbers get multiplied, only prime numbers are multiplied to calculate the primorial of a number. 
 * It's denoted with P# and it is the product of the first n prime numbers.
 * 
 * Task:	Given a number N , calculate its primorial.
 * 
 * Notes:
 * 
 * Only positive numbers will be passed (N > 0).
 * 
 * Input >> Output Examples:
 * 
 * numPrimorial (3) ==> return (30)
 * Explanation:	Since the passed number is (3), then the primorial should obtained by multiplying 2 * 3 * 5 = 30.
 * Mathematically written as, P3# = 30.
 * 
 * numPrimorial (5) ==> return (2310)
 * Explanation: Since the passed number is (5), then the primorial should obtained by multiplying  2 * 3 * 5 * 7 * 11 = 2310.
 * Mathematically written as, P5# = 2310.
 * 
 * numPrimorial (6) ==> return (30030)
 * Explanation: Since the passed number is (6), then the primorial should obtained by multiplying  2 * 3 * 5 * 7 * 11 * 13 = 30030.
 * Mathematically written as, P6# = 30030.
 */

import java.math.*;

public class PrimorialOfANumber {

    /*  Misma lógica aplicada en la solución de Python. 
        Funciona pero no supera todos los test de CodeWars: 
        expected:<[746774268964828593379161937487578291264399479746271584034218603910133666828369500695498718331779495118418455509590351974136341922446114938262510506167002342268631595703536109127451442926407460402397724985027850558831146615511416018374372190214503867381430896948719480916952070580148611940833097956362404941084190998904644290]> but was:<[-6670173089129356606]>
        No entiendo como pretende que consiga una solución que acepte un número de más de 100 dígitos.
    */
	public static String numPrimorial(int n) {
        long resultado = 1;
        int multiplicaciones = 0;
        int numeroPrimo = 2;
        
        while(multiplicaciones < n) {
          int contador = 0;
          for(int i = numeroPrimo-1 ; i >= 2 ; i--) {
            if(numeroPrimo % i == 0)
              contador++;
          }
          if(contador == 0) {
            resultado *= numeroPrimo;
            multiplicaciones++;
          }
          numeroPrimo++;
        }
        return Long.toString(resultado);
    }

    // Solución de la comunidad 1. Utiliza la clase BigInteger.
    public static String numPrimorialCommunity(int n) {
        
        BigInteger p = BigInteger.valueOf(2);
        BigInteger result = BigInteger.ONE;
        for(int i=0; i<n; ++i, p = p.nextProbablePrime())
          result = result.multiply(p);
        
        return result.toString();
    }

    // Solución de la comunidad 2. Divide el trabajo en una seríe de funciones.
    public static boolean isPrime(int n) {

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)     return false;
        }
        return true;
    }

    public static int[] primes(int n) {
        int[] prime = new int[n];
        prime[0] = 2;
        int index = 1;

        for (int i = 3; ; i += 2) {
            if (isPrime(i))         prime[index++] = i;
            if (index == n)         return prime;
        }
    }

    public static String numPrimorialCommunity2(int n) {

        BigInteger result = new BigInteger("1");
        int [] prime = primes(n);

        for (int aPrime : prime)    result = result.multiply(BigInteger.valueOf(aPrime));

        return result.toString();
    }

    
	public static void main(String[] args) {
		
		System.out.println(numPrimorial(3));
		System.out.println(numPrimorial(5));
		System.out.println(numPrimorial(6));

	}
	
}
