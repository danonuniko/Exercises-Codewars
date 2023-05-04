/* Kata Level: 8.
 * 
 * Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */

public class EvenOrOdd {

    public static String even_or_odd(int number) {
        if(number%2==0) return "Even"; else return "Odd";        
    }

    public static void main(String[] args){
        System.out.println(even_or_odd(0));
        System.out.println(even_or_odd(13));
        System.out.println(even_or_odd(12));
        System.out.println(even_or_odd(225));

    }
}