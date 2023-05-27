/* Kata Level: 5.
* 
* Write a function that when given a URL as a string, parses out just the domain name and returns it as a string. For example:
* 
* url = "http://github.com/carbonfive/raygun" -> domain name = "github"
* url = "http://www.zombie-bites.com"         -> domain name = "zombie-bites"
* url = "https://www.cnet.com"                -> domain name = cnet"
*/

using System.Text.RegularExpressions;

public class Kata
{
    // Solución en C# utilizando aquella desarrollada en Python.
    //La expresión regular es la misma. La diferencia es los métodos a usar para extraer la información que buscamos. 
    public static Group RegexURL(string web)
    {
        Regex rx = new Regex(@"^(?:https?:\/\/)?(?:www.)?([\w-]+).*");
        Match match = Regex.Match(web, @"^(?:https?:\/\/)?(?:www.)?([\w-]+).*");
        return match.Groups[1];
    }

    public static void Main(string[] args)
    {
        Console.WriteLine(RegexURL("https://google.es"));
        Console.WriteLine(RegexURL("http://google.es"));
        Console.WriteLine(RegexURL("https://www.google.es"));
        Console.WriteLine(RegexURL("http://www.google.es"));
        Console.WriteLine(RegexURL("www.google.es"));
        Console.WriteLine(RegexURL("google.es"));
        Console.WriteLine(RegexURL("google.es.com"));
        Console.WriteLine(RegexURL("google-spain.es"));
    }
}