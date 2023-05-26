/* Kata Level: 6.
 * 
 * Write a function that takes an integer as input, and returns the number of bits 
 * that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
 * 
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case.
 */

 public class BitCounting {

	// Solución propia sin optimizar. No haría falta darle la vuelta al número binario para colocarlo correctamente. Podemos contarlo al revés dado el objetivo del ejercicio.
    public static int countBits(int n){
        if(n == 0)    return 0;
		String binaryReverse = "";
        while(n > 1) {
            binaryReverse += Integer.toString(n % 2);
            n = n / 2;
        }
        binaryReverse += "1";
        String binary = "";
        for(int i = 0 ; i < binaryReverse.length() ; i++)   binary = binaryReverse.charAt(i) + binary;
        int count = 0;
        for(char letter : binary.toCharArray())		if(letter == '1')		count++;
        return count;
	}

    public static int countBitsCommunity(int n){
        return Integer.bitCount(n);
    }

    public static int countBitsCommunityV2(int n){
		return (int) Integer.toBinaryString(n).chars()
              .filter(c -> c == '1')
              .count();
	}

    public static void main(String[] args) {

		System.out.println(countBits(1234));
        System.out.println(countBits(0));
        System.out.println(countBits(5));
        
	}
}