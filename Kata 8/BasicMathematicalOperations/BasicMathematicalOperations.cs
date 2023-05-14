/* Kata Level: 8.
 * 
 * Your task is to create a function that does four basic mathematical operations.
 * The function should take three arguments - operation(string/char), value1(number), value2(number).
 * The function should return result of numbers after applying the chosen operation.
 * 
 * Examples(Operator, value1, value2) --> output:
 * 
 * ('+', 4, 7) --> 11
 * ('-', 15, 18) --> -3
 * ('*', 5, 5) --> 25
 * ('/', 49, 7) --> 7
 */

public class Kata
{
    public static int BasicMathematicalOperations(char operation, int number1, int number2)
    {
        switch(operation)
        {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
            default:
                throw new System.ArgumentException("Unknown operation!", operation.ToString());
        }
    }
    public static void Main(string[] args)
    {
        System.Console.WriteLine(BasicMathematicalOperations('+', 4, 7));
        System.Console.WriteLine(BasicMathematicalOperations('-', 15, 18));
        System.Console.WriteLine(BasicMathematicalOperations('*', 5, 5));
        System.Console.WriteLine(BasicMathematicalOperations('/', 49, 7));
    }
}