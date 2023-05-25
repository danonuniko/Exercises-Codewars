/* Kata Level: 8.
 * 
 * Complete the solution so that it reverses all of the words within the string passed in.
 * Words are separated by exactly one space and there are no leading or trailing spaces.
 * 
 * Example(Input --> Output):	"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
 */

import java.util.*;

public class WordsInReverseOrderString {
 
    public static String reverseWords(String str){
        String[] palabras = str.split(" ");
        String resultado = "";
        for(int i = palabras.length - 1; i >= 0; i--){
            resultado += palabras[i] + " ";
            
            /* for(int i=palabras.length-1 ; i>=0 ; i--){			Alternativa de bucle for para evitar el uso de substring.
             * resultado += palabras[i];
             * if(i>0)	resultado+=" ";
             */
        }
        return resultado.substring(0, resultado.length() - 1);
    }
     
    //Solución de la comunidad 1.
    public static String reverseWords1(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
     
    public static void main(String[] args) {
         
        System.out.println(reverseWords("The greatest victory is that which requires no battle"));
        
    }
      
}