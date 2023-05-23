/* Kata Level: 5.
 * 
 * The marketing team is spending way too much time typing in hashtags.
 * Let's help them with our own Hashtag Generator!
 * 
 * Here's the deal:
 * 
 * It must start with a hashtag (#).
 * All words must have their first letter capitalized.
 * If the final result is longer than 140 chars it must return false.
 * If the input or the result is an empty string it must return false.
 * 
 * Examples:
 * " Hello there thanks for trying my Kata"  =>  "#HelloThereThanksForTryingMyKata"
 * "    Hello     World   "                  =>  "#HelloWorld"
 * ""                                        =>  false
 */

public class HashtagGenerator {

    // Revisar código en Python para entender porque seguimos esta lógica de programación.
    public static String hashtagGenerator(String input) {
        if(input.equals(""))    return "false";
        else {
            String result = "";
            String[] words = input.split(" ");
            for(String word : words) {
                if(word != "")     result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            }
            return result;
        }
    }

    public static void main(String[] args) {

        System.out.println(hashtagGenerator(" Hello there thanks for trying my Kata"));
        System.out.println(hashtagGenerator("    Hello     World   "));
        System.out.println(hashtagGenerator(""));
        
    }
}
