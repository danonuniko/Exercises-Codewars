/* Kata Level: 5.
 * 
 * Take the following IPv4 address: 128.32.10.1
 * This address has 4 octets where each octet is a single byte (or 8 bits).
 * 
 * 1st octet 128 has the binary representation: 10000000
 * 2nd octet 32 has the binary representation: 00100000
 * 3rd octet 10 has the binary representation: 00001010
 * 4th octet 1 has the binary representation: 00000001
 * 
 * So 128.32.10.1 == 10000000.00100000.00001010.00000001
 * 
 * Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361
 * 
 * Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.
 * 
 * Examples:
 * 
 * 2149583361 ==> "128.32.10.1"
 * 32         ==> "0.0.0.32"
 * 0          ==> "0.0.0.0"
 */

using System;

public class Kata
{
  public static string UInt32ToIP(uint ip)
  {
        string binaryReverse = "" , binary = "";
        // Convertimos el número decimal a binario (dado la vuelta).
        while(ip > 0) 
        {
          binaryReverse += ip % 2;
          ip = ip / 2;
        }
        // Obtenemos el número decimal en formato binario y orden correcto.
        for(int i = 0 ; i < binaryReverse.Length ; i++) 	binary = binaryReverse[i] + binary;
        // Añadimos cero mientras el número binario sea inferior a 32 unidades y lo separamos en 4 octetos.
        while(binary.Length < 32)		binary = "0" + binary;

        string a = binary.Substring(0, 8), b = binary.Substring(8, 8), c = binary.Substring(16, 8), d = binary.Substring(24);

        // Obtenemos el valor decimal de cada uno de los octetos.
        string aReverse = "", bReverse = "", cReverse = "", dReverse = "";
        uint aFinal = 0 , bFinal = 0 , cFinal = 0 , dFinal = 0;
        for(int i = 0 ; i < a.Length ; i++) 	aReverse = a[i] + aReverse;
        for(int i = 0 ; i < aReverse.Length ; i++) 
        {
          if(aReverse[i] == '1')	aFinal += (uint) Math.Pow(2, i);
        }

        for(int i = 0 ; i < b.Length ; i++) 	bReverse = b[i] + bReverse;
        for(int i = 0 ; i < bReverse.Length ; i++) 
        {
          if(bReverse[i] == '1')	bFinal += (uint) Math.Pow(2, i);
        }

        for(int i = 0 ; i < c.Length ; i++) 	cReverse = c[i] + cReverse;
        for(int i = 0 ; i < cReverse.Length ; i++) 
        {
          if(cReverse[i] == '1')	cFinal += (uint) Math.Pow(2, i);
        }

        for(int i = 0 ; i < d.Length ; i++) 	dReverse = d[i] + dReverse;
        for(int i = 0 ; i < dReverse.Length ; i++) 
        {
          if(dReverse[i] == '1')	dFinal += (uint) Math.Pow(2, i);
        }

        return aFinal + "." + bFinal + "." + cFinal + "." + dFinal;  
  }
}