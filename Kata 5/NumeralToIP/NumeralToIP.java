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

 public class NumeralToIP {

	public static String longToIP(long ip) {
		String binaryReverse = "" , binary = "";
		// Convertimos el número decimal a binario (dado la vuelta).
		while(ip > 0) {
			binaryReverse += ip % 2;
			ip = ip / 2;
		}
		// Obtenemos el número decimal en formato binario y orden correcto.
		for(int i = 0 ; i < binaryReverse.length() ; i++) 	binary = binaryReverse.charAt(i) + binary;
		// Añadimos cero mientras el número binario sea inferior a 32 unidades y lo separamos en 4 octetos.
		while(binary.length() < 32)		binary = "0" + binary;

		String a = binary.substring(0, 8);
		String b = binary.substring(8, 16);
		String c = binary.substring(16, 24);
		String d = binary.substring(24);

		// Obtenemos el valor decimal de cada uno de los octetos.
		String aReverse = "", bReverse = "", cReverse = "", dReverse = "";
		long aFinal = 0 , bFinal = 0 , cFinal = 0 , dFinal = 0;
		for(int i = 0 ; i < a.length() ; i++) 	aReverse = a.charAt(i) + aReverse;
		for(int i = 0 ; i < aReverse.length() ; i++) {
			if(aReverse.charAt(i) == '1')	aFinal += Math.pow(2, i);
		}

		for(int i = 0 ; i < b.length() ; i++) 	bReverse = b.charAt(i) + bReverse;
		for(int i = 0 ; i < bReverse.length() ; i++) {
			if(bReverse.charAt(i) == '1')	bFinal += Math.pow(2, i);
		}

		for(int i = 0 ; i < c.length() ; i++) 	cReverse = c.charAt(i) + cReverse;
		for(int i = 0 ; i < cReverse.length() ; i++) {
			if(cReverse.charAt(i) == '1')	cFinal += Math.pow(2, i);
		}

		for(int i = 0 ; i < d.length() ; i++) 	dReverse = d.charAt(i) + dReverse;
		for(int i = 0 ; i < dReverse.length() ; i++) {
			if(dReverse.charAt(i) == '1')	dFinal += Math.pow(2, i);
		}

		return aFinal + "." + bFinal + "." + cFinal + "." + dFinal;
	}

	public static void main(String[] args) {

		System.out.println(longToIP(0));
		System.out.println(longToIP(32));
		System.out.println(longToIP(1240));
		System.out.println(longToIP(2149583361L));
		
	}

}