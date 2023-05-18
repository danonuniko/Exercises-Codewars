/* Kata Level: 6.
 * 
 * Introduction:
 * The wave (known as the Mexican wave in the English-speaking world outside North America) 
 * is an example of metachronal rhythm achieved in a packed stadium when successive groups of spectators briefly stand, yell, and raise their arms.
 * Immediately upon stretching to full height, the spectator returns to the usual seated position.
 * 
 * The result is a wave of standing spectators that travels through the crowd, even though individual spectators never move away from their seats.
 * In many large arenas the crowd is seated in a contiguous circuit all the way around the sport field, 
 * and so the wave is able to travel continuously around the arena; in discontiguous seating arrangements, the wave can instead reflect back and forth through the crowd. 
 * When the gap in seating is narrow, the wave can sometimes pass through it. 
 * Usually only one wave crest will be present at any given time in an arena, although simultaneous, counter-rotating waves have been produced.
 * 
 * Task:
 * In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
 * You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up. 
 * 
 * Rules:
 * 
 * 1.  The input string will always be lower case but maybe empty.
 * 2.  If the character in the string is whitespace then pass over it as if it was an empty seat.
 * 
 * Example:
 * 
 * wave("hello") => ["Hello", "hEllo", "heLlo", "helLo", "hellO"]
 * Good luck and enjoy!
 */

import java.util.*;

public class MexicanWave {

    public static String[] wave(String str) {
        
        int count = 0;
        for(int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == ' ')    continue;
            count++;
        }
      
        ArrayList<String> result = new ArrayList<String>();
        String[] solution = new String[count];

        for(int i = 0; i < str.length() ; i++) {
            String word = "";
            if(str.charAt(i) == ' ')    continue;
            else {
                word = str.substring(0, i).toLowerCase() + str.substring(i, i+1).toUpperCase() + str.substring(i+1).toLowerCase();
                result.add(word);
            }
        }
        for(int i = 0 ; i < count ; i++) 	solution[i] = result.get(i);
        
        return solution;
    }

    // Versión simplificada comunidad.
    public static String[] waveCommunity(String str) {    
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          if (ch == ' ') continue;
          list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
        }
        return list.toArray(new String[0]);
      }

    public static void main(String[] args) {

        String[] solution = wave("Hello");
        for(String word : solution)     System.out.println(word);

		solution = wave("CODEWARS");
		for(String word : solution)     System.out.println(word);

		solution = wave("two WoRds");
		for(String word : solution)     System.out.println(word);

    }
}