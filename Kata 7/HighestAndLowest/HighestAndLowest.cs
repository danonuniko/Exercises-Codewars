/* Kata Level: 7.
 * 
 * In this little assignment you are given a string of space separated numbers, 
 * and have to return the highest and lowest number.
 * 
 * Examples:
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * 
 * Notes:
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 */

public class Kata
{
    public static string HighAndLow(string numbers)
    {
        int max = int.MinValue, min = int.MaxValue;
        string[] numbers_array = numbers.Split();
        foreach(string number in numbers_array)
        {
            if(int.Parse(number) > max)         max = int.Parse(number);
            if(int.Parse(number) < min)         min = int.Parse(number);
        }
        return $"{max} {min}";
    }

    // Solución comunidad.
    public static string HighAndLow(string numbers)
    {
        var numbersList = numbers.Split(' ').Select(x => Convert.ToInt32(x));
        return string.Format("{0} {1}", numbersList.Max(), numbersList.Min());
    }
    
    public static void Main(string[] args)
    {
        System.Console.WriteLine(HighAndLow("1 2 3 4 5"));
        System.Console.WriteLine(HighAndLow("1 2 -3 4 5"));
        System.Console.WriteLine(HighAndLow("1 9 3 4 -5"));
    }
}