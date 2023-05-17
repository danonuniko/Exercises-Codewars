/* Kata Level: 7.
 * 
 * Make a program that filters a list of strings and returns a list with only your friends name in it.
 * If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...
 * 
 * Ex: Input = ["Ryan", "Kieran", "Jason", "Yous"], Output = ["Ryan", "Yous"]
 * friend ["Ryan", "Kieran", "Mark"] `shouldBe` ["Ryan", "Mark"]
 * 
 * Note: keep the original order of the names in the output.
 */

using System.Collections.Generic;
using System.Linq;

public static class Kata {
    public static IEnumerable<string> FriendOrFoe (string[] names) 
    {
        List<string> result = new List<string>();
        foreach(string name in names)
        {
            if(name.Length == 4)   result.Add(name);
        }
        return result;
    }

    public static IEnumerable<string> FriendOrFoe (string[] names) 
    {
        return names.Where(name => name.Length == 4);
    }
}