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

public class Kata
{
    // Revisar código en Python para entender porque seguimos esta lógica de programación.
    public static string hashtagGenerator(string input) {
        if(input.Equals(""))	return "false";
		string result = "#";
		foreach(string word in input.Split()) {
			if(!word.Equals(""))    result += word[0].ToString().ToUpper() + word.Substring(1).ToLower();
            
        }
		return result;
    }

    public static void Main(string[] args)
    {

        System.Console.WriteLine(hashtagGenerator(" Hello there thanks for trying my Kata"));
        System.Console.WriteLine(hashtagGenerator("    Hello     World   "));
        System.Console.WriteLine(hashtagGenerator(""));

    }
}
