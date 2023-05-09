/* Kata Level: 6.
 * 
 * Some numbers have funny properties. For example:
 * 89 --> 8¹ + 9² = 89 * 1
 * 695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
 * 46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 * 
 * Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
 * we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
 * 
 * In other words:
 * Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
 * If it is the case we will return k, if not return -1.
 * 
 * Note: n and p will always be given as strictly positive integers.
 * 
 * digPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
 * digPow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92 * k
 * digPow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
 * digPow(46288, 3) should return 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 */

using System;

/*
Me pasa lo mismo que con la solución en Python. 
Supera los primeros test pero no supera los segundos por exceso de tiempo, no por errores en la lógica.
*/
public class DigPow {
    public static long digPow(int n, int p) {
        long resultado = 0;
        string n_str = n.ToString();
        for(int i = 0 ; i < n_str.Length ; i++)
        {
            resultado += (long) Math.Pow(int.Parse(n_str[i].ToString()), p+i);
        }

        int contador = 1;
        while(n*contador <= resultado)
        {
            if(n*contador == resultado)		return contador;
            contador++;
        }
        return -1;
	}

    /* 
    Solución correcta basada en la solución de la comunidad de Python.
    Misma lógica que la solución de arriba pero más eficiente porque consigue llegar al mismo resultado sin necesidad de utilizar el bucle while.
    */
    public static long digPow(int n, int p) {
        long resultado = 0;
        string n_str = n.ToString();
        for(int i = 0 ; i < n_str.Length ; i++)
        {
            resultado += (long) Math.Pow(int.Parse(n_str[i].ToString()), p+i);
        }
        
        if(resultado % n == 0)  return resultado / n;
        return -1;
    }

}