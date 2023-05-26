/* Kata Level: 6.
 * 
 * Write a function that takes an integer as input, and returns the number of bits 
 * that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
 * 
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case.
 */

public class Kata
{
    public static int CountBits(int n)
    {
        if(n == 0)    return 0;
        string binaryReverse = "";
        while(n > 1) 
        {
            binaryReverse += (n % 2).ToString();
            n = n / 2;
        }
        binaryReverse += "1";
        String binary = "";
        for(int i = 0 ; i < binaryReverse.Length ; i++)   binary = binaryReverse[i] + binary;
        int count = 0;
        foreach(char letter in binary.ToCharArray())		if(letter == '1')		count++;
        return count;
    }

    public static int CountBits(int n)
    {
        return Convert.ToString(n, 2).Count(x => x == '1');
    }
}