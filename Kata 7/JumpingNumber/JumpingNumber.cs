/* Kata Level: 7.
 * 
 * Definition:
 * Jumping number is the number that All adjacent digits in it differ by 1.
 * 
 * Task: Given a number, Find if it is Jumping or not.
 * 
 * Notes:
 * Number passed is always Positive.
 * Return the result as String.
 * The difference between ‘9’ and ‘0’ is not considered as 1.
 * All single digit numbers are considered as Jumping numbers.
 * 
 * Input >> Output Examples:
 * 
 * jumpingNumber(9) ==> return "Jumping!!"
 * Explanation: It's single-digit number.
 * 
 * jumpingNumber(79) ==> return "Not!!"
 * Explanation: Adjacent digits don't differ by 1.
 * 
 * jumpingNumber(23) ==> return "Jumping!!"
 * Explanation: Adjacent digits differ by 1.
 * 
 * jumpingNumber(556847) ==> return "Not!!"
 * Explanation: Adjacent digits don't differ by 1.
 * 
 * jumpingNumber(4343456) ==> return "Jumping!!"
 * Explanation: Adjacent digits differ by 1.
 * 
 * jumpingNumber(89098) ==> return "Not!!"
 * Explanation: Adjacent digits don't differ by 1.
 * 
 * jumpingNumber(32) ==> return "Jumping!!"
 * Explanation: Adjacent digits differ by 1.
 */

public class Kata
{
    public static string JumpingNumber(int number)
    {
      if(number < 0)		return "Not!!";
      else if(number >= 0 && number < 10)		return "Jumping!!";
      else if(number >= 10 && number < 100)
      {
        if(int.Parse(number.ToString().Substring(0, 1)) != int.Parse(number.ToString().Substring(1)) + 1 && int.Parse(number.ToString().Substring(0, 1)) != int.Parse(number.ToString().Substring(1)) - 1)	return "Not!!";
        return "Jumping!!";
      }
      else
      {
        for(int i = 0 ; i < number.ToString().Length - 1 ; i++)
        {
          if(int.Parse(number.ToString().Substring(i, 1)) != int.Parse(number.ToString().Substring(i + 1, 1)) + 1 && int.Parse(number.ToString().Substring(i, 1)) != int.Parse(number.ToString().Substring(i + 1, 1)) - 1)	return "Not!!";
        }
        return "Jumping!!";
      }
    }

    // Soluciones de la comunidad.

    public static string JumpingNumberCommunity1(int n)
    {
        while (true)
        {
            if (n < 10) return "Jumping!!";
            if (Math.Abs(n % 10 - n / 10 % 10) != 1) return "Not!!";
            n /= 10;
        }
    }
	
	  public static string JumpingNumberCommunity2(int n)
    {
        return n < 10 ? "Jumping!!" : Math.Abs(n%10 - (n/10)%10) != 1 ? "Not!!" : JumpingNumber(n/10);
    }

    public static void Main(string[] args)
    {
        Console.WriteLine(JumpingNumber(3565678));          // Not!!
        Console.WriteLine(JumpingNumber(123432345));        // Jumping!!
        Console.WriteLine(JumpingNumber(4343456789));       // Jumping!!
        Console.WriteLine(JumpingNumber(357485));           // Not!!
    }
}