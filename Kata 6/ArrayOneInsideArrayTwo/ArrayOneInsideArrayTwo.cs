/* Kata Level: 6.
 * 
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
 * 
 * Example 1:
 * 
 * a1 = ["arp", "live", "strong"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns ["arp", "live", "strong"]
 * 
 * Example 2:
 * 
 * a1 = ["tarp", "mice", "bull"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns []
 * 
 * Notes:
 * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 * Beware: In some languages r must be without duplicates.
 */

public class Kata
{
    public static string[] inArray(string[] array1, string[] array2)
    {
        List<string> result = new List<string>();
        foreach(string word1 in array1)
        {
            foreach(string word2 in array2)
            {
                if(word2.Contains(word1))
                {
                    result.Add(word1);
                    break;
                }
            }
        }
        result.Sort();
        return result.ToArray();
    }

    public static void Main(string[] args) {

        string[] result = inArray(new String[] {"arp", "live", "strong"}, new String[] {"lively", "alive", "harp", "sharp", "armstrong"});
        foreach(String word in result)	System.Console.WriteLine(word);
    
    }
}
