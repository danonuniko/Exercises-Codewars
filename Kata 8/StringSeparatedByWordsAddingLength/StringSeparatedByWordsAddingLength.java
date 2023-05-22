/* Kata Level: 8.
 * 
 * What if we need the length of the words separated by a space to be added at the end of that same word and have it returned as an array?
 * 
 * Example(Input --> Output)
 * 
 * "apple ban" --> ["apple 5", "ban 3"]
 * "you will win" -->["you 3", "will 4", "win 3"]
 * 
 * Your task is to write a function that takes a String and returns an Array/list with the length of each word added to each element .
 * Note: String will have at least one element; words will always be separated by a space.
 */

 public class StringSeparatedByWordsAddingLength {

    // No existe en Codewars. Modificamos el código realizado en C#.
    public static String[] AddLength(String str)
    {
        String[] words = str.split(" ");
        for(int i = 0 ; i < words.length ; i++)     words[i] += " " + words[i].length();
        return words;
    }

    public static void main(String[] args)
    {
        String[] words = AddLength("Hola que tal estás");
        for(String word : words)   System.out.println(word);
    }
}