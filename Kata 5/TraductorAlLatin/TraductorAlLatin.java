/* Kata Level: 5.
 * 
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
 * Leave punctuation marks untouched.
 * 
 * Examples:
 * 
 * pig_it('Pig latin is cool') # igPay atinlay siay oolcay
 * pig_it('Hello world !')     # elloHay orldway !
 */

 public class TraductorAlLatin {

	public static String pigIt(String str) {

		String[] words = str.split(" "); 
		for(int i = 0; i<words.length; i++){
			if(words[i].matches("[a-zA-Z]+"))
			words[i] = words[i].substring(1)+words[i].charAt(0) +"ay"; 
		}  
		return String.join(" ", words);

	}

    public static void main(String[] args) {

        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
        
    }

}
