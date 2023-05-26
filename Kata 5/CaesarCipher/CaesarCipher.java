/* Kata Level: 5.
 * 
 * ROT13 is a simple letter substitution cipher that replaces a letter with the letter 13 letters after it in the alphabet. 
 * ROT13 is an example of the Caesar cipher.
 * 
 * Create a function that takes a string and returns the string ciphered with Rot13. 
 * If there are numbers or special characters included in the string, they should be returned as they are. 
 * Only letters from the latin/english alphabet should be shifted, like in the original Rot13 "implementation".
 * 
 * Please note that using encode is considered cheating.
 */

public class CaesarCipher {
    
    public static String rot13(String message) {
        String minusculas = "abcdefghijklmnopqrstuvwxyzabcdefghijklm";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLM";
        String result = "";
        
        for(char letter : message.toCharArray())
        {
            if(minusculas.contains(Character.toString(letter)))   result += minusculas.charAt(minusculas.indexOf(letter) + 13);
            else if(mayusculas.contains(Character.toString(letter)))   result += mayusculas.charAt(mayusculas.indexOf(letter) + 13);
            else    result += letter;
        }
        return result;
    }

    public static void main(String[] args) {

		System.out.println(rot13("Test"));
		
	}
	
}