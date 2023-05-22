/* Kata Level: 6.
 * 
 * You live in the city of Cartesia where all roads are laid out in a perfect grid. 
 * You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. 
 * The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends 
 * you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). 
 * You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, 
 * so create a function that will return true if the walk the app gives you will take you exactly ten 
 * minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.
 * 
 * Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). 
 * It will never give you an empty array (that's not a walk, that's standing still!).
 */

using System;
public class Kata
{
    // Solución usando métodos de extensión.
    public static bool IsValidWalk(string[] walk)
    {
        return walk.Length == 10 && (walk.Count(x => x.Equals("n")) == walk.Count(x => x.Equals("s"))) && (walk.Count(x => x.Equals("e")) == walk.Count(x => x.Equals("w")));
    }

    // Solución básica sin optimizar.
    public static bool IsValidWalk(string[] walk)
    {
        int verticalMoves = 0, horizontalMoves = 0;
        foreach(string move in walk)
        {
            if(move.Equals("n"))            verticalMoves++;
            else if(move.Equals("s"))       verticalMoves--;
            else if(move.Equals("w"))       horizontalMoves--;
            else if(move.Equals("e"))       horizontalMoves++;
        }
        return walk.Length == 10 && horizontalMoves == 0 && verticalMoves == 0;
    }
}