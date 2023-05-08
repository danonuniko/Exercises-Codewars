using System;

public static class Kata
{
    public static int GetVowelCount(string str)
    {
        int vowelCount = 0;
        string vowels = "aeiouáéíóúü";
        foreach(char letter in str.ToLower())
        {
          if(vowels.Contains(letter))   vowelCount += 1;
        }
        return vowelCount;
    }

    public static void Main(string[] args)
    {
      Console.WriteLine(GetVowelCount("hola que tal estás"));
    }
}