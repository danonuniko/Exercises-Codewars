/* Kata Level: 6.
 * 
 * A pangram is a sentence that contains every single letter of the alphabet at least once. 
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */

import java.util.*;

public class Panagramas {
    
    // Primera opción. Concatenación de if's.
    public static boolean check(String sentence) {
        sentence = sentence.toLowerCase();
        if (sentence.contains("a") && sentence.contains("b") && sentence.contains("c") && sentence.contains("d")
                && sentence.contains("e") && sentence.contains("f") && sentence.contains("g") && sentence.contains("h")
                && sentence.contains("i") && sentence.contains("j") && sentence.contains("k") && sentence.contains("l")
                && sentence.contains("m") && sentence.contains("n") && sentence.contains("o") && sentence.contains("p")
                && sentence.contains("q") && sentence.contains("r") && sentence.contains("s") && sentence.contains("t")
                && sentence.contains("u") && sentence.contains("v") && sentence.contains("w") && sentence.contains("x")
                && sentence.contains("y") && sentence.contains("z")) {
            return true;
        }
        return false;
    }
    
    // Segunda opción. Recorremos la frase con un for, añadimos las letras a un Set y comprobamos el tamaño del mismo.
    public static boolean check1(String sentence) {
        sentence = sentence.toLowerCase();
        String letras = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> resultado = new HashSet<>();
        
        for(int i = 0 ; i < sentence.length() ; i++) {
            if(letras.contains(Character.toString(sentence.charAt(i)))) {
                resultado.add(sentence.charAt(i));
            }
        }
        return resultado.size() == 26 ? true : false;
    }
    
    // Solución de la comunidad 1.
    public class PangramChecker {
        public boolean check(String sentence){
                for (char c = 'a'; c<='z'; c++)
                    if (!sentence.toLowerCase().contains("" + c))
                        return false;
                return true;
        }
    }
    
    public static void main(String[] args) {

        String primeraPrueba = "Hola Mundo";
        String segundaPrueba = "The quick brown fox jumps over the lazy dog";
        System.out.println(check(primeraPrueba));
        System.out.println(check(segundaPrueba));
        System.out.println(check1(primeraPrueba));
        System.out.println(check1(segundaPrueba));
        
    }
}
 