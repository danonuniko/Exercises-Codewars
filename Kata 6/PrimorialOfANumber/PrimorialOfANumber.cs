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

public class Kata {
    // Solución aprobada en Python y adaptada en Java pero que no supera todos los test. No sabemos si funciona en C# porque no existe en CodeWars.
    public static string numPrimorial(int n) {
        long resultado = 1;
        int multiplicaciones = 0;
        int numeroPrimo = 2;
        
        while(multiplicaciones < n) 
        {
            int contador = 0;
            for(int i = numeroPrimo-1 ; i >= 2 ; i--) 
            {
                if(numeroPrimo % i == 0)    contador++;
            }
            if(contador == 0) 
            {
                resultado *= numeroPrimo;
                multiplicaciones++;
            }
            numeroPrimo++;
        }
        return resultado.ToString();
    }

    public static void Main(string[] args)
    {
        
        Console.WriteLine(numPrimorial(3));
        Console.WriteLine(numPrimorial(5));
        Console.WriteLine(numPrimorial(6));
        
    }
}