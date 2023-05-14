/* Kata Level: 7.
 * 
 * Definition:
 * Disarium number is the number that the sum of its digits powered with their respective positions is equal to the number itself.
 * 
 * Task:
 * Given a number, Find if it is Disarium or not.
 * 
 * Notes:
 * Number passed is always Positive.
 * Return the result as String.
 * 
 * Input >> Output Examples:
 * 
 * disariumNumber(89) ==> return "Disarium !!"
 * Explanation: Since , 8^1 + 9^2 = 89 , thus output is "Disarium !!"
 * 
 * disariumNumber(564) ==> return "Not !!"
 * Explanation: Since , 5^1 + 6^2 + 4^3 = 105 != 564 , thus output is "Not !!"
 */

using System;

public class Kata
{

    // Me veo obligado a hacer un bucle for anidado a otro para poder realizar la potencia. Math.Pow me da un error que no puedo solventar.
    // Línea con error de código que no soluciono:       resultado += Math.Pow(int.Parse(number.ToString().Substring(i, 1), i));
    public static string DisariumNumber(int number)
    {
        int resultado = 0;
        for(int i = 1; i <= number.ToString().Length ; i++)
        {
            int multiplicacion = 1;
            for(int  j = 1 ; j <= i ; j++)
            {
              multiplicacion *= int.Parse(number.ToString().Substring(i-1, 1));
            }
            resultado += multiplicacion;
        }
        return resultado == number ? "Disarium !!" : "Not !!";
    }
    public static void Main(string[] args)
    {
        Console.WriteLine(DisariumNumber(89));
        Console.WriteLine(DisariumNumber(564));
    }
}