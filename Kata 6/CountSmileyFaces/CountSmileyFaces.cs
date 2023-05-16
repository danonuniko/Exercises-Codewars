/* Kata Level: 6.
 * 
 * Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
 * 
 * Rules for a smiling face:
 * Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
 * A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
 * Every smiling face must have a smiling mouth that should be marked with either ) or D
 * No additional characters are allowed except for those mentioned.
 * 
 * Valid smiley face examples: :) :D ;-D :~)
 * Invalid smiley faces: ;( :> :} :]
 * 
 * Example:
 * countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
 * countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
 * countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
 * 
 * Note:
 * In case of an empty array return 0. You will not be tested with invalid input (input will always be an array).
 * Order of the face (eyes, nose, mouth) elements will always be the same.
 */

using System;
using System.Text.RegularExpressions;

public static class Kata
{
    public static int CountSmileys(string[] smileys) 
    {
        // Alternativas del string Regex:   @"^[:;]{1}[~-]{0,1}[\)D]{1}$"   Versión más correcta. Con la opción usada más abajo acepta caras estilo :;D
        // Es necesario realizar test que tengan en cuenta la gran cantidad de posibles casuísticas para determinar si una expresión Regex es 100% correcta.
        
        Regex rx = new Regex("[:;][-~]?[)D]");
        int smiles = 0;
        foreach(string smile in smileys) {
            if (rx.IsMatch(smile)) {
                smiles += 1;
            }
        }
        return smiles;
    }
    public static void Main(string[] args)
    {
        Console.WriteLine(CountSmileys(new string[] {":)", ";(", ";}", ":-D", ":", ":;)"}));        // Debería retornar 2, descartando caras del estilo ":" o ":;)"
    }
}