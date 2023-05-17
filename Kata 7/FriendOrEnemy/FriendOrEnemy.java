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

import java.util.*
;
 public class FriendOrEnemy {

    public static ArrayList<String> friendOrEnemy(String[] names) {
        ArrayList<String> result = new ArrayList<String>();
        for(String name : names) {
            if(name.length() == 4)  result.add(name);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(friendOrEnemy(new String[] {"Ryan", "Kieran", "Jason", "Yous"}));
        System.out.println(friendOrEnemy(new String[] {"Ryan", "Kieran", "Mark"}));
    }
    
}
