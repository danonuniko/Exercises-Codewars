/* Kata Level: 6.
 * 
 * Your Task:
 * 
 * You have to create a function **GrεεκL33t** which takes a string as input and returns it in the form of (L33T+Grεεκ)Case.
 * Note: The letters which are not being converted in (L33T+Grεεκ) Case should be returned in the lowercase.
 * 
 * (L33T+Grεεκ)Case:
 * 
 * A=α (Alpha)      B=β (Beta)      D=δ (Delta)
 * E=ε (Epsilon)    I=ι (Iota)      K=κ (Kappa)
 * N=η (Eta)        O=θ (Theta)     P=ρ (Rho)
 * R=π (Pi)         T=τ (Tau)       U=μ (Mu)      
 * V=υ (Upsilon)    W=ω (Omega)     X=χ (Chi)	Y=γ (Gamma)
 * 
 * Examples:
 * 
 * GrεεκL33t("CodeWars") = "cθδεωαπs"
 * GrεεκL33t("Kata") = "κατα"
 */

using System.Collections.Generic;
  
public class L33TGreekCase
{
    public static string GreekL33t(string str)
    {
        Dictionary<char, char> traductor = new Dictionary<char, char>() { {'A', 'α'}, {'B', 'β'}, {'D', 'δ'}, {'E', 'ε'}, {'I', 'ι'}, {'K', 'κ'}, {'N', 'η'}, 
        {'O', 'θ'}, {'P', 'ρ'}, {'R', 'π'}, {'T', 'τ'}, {'U', 'μ'}, {'V', 'υ'}, {'W', 'ω'}, {'X', 'χ'}, {'Y', 'γ'} };
        string result = "";

        foreach(char letter in str.ToUpper())
        {
            if(traductor.ContainsKey(letter))   result += traductor[letter];
            else    result += letter.ToString().ToLower();
        }

        return result;
    }

    // Solución alternativa de la comunidad sin necesidad de utilizar diccionarios.
    public static string GreekL33tCommunity(string str)
    {
        string result = "",
        abc  =  "abdeiknoprtuvwxy",
        greek = "αβδεικηθρπτμυωχγ";
        
        foreach (char ch in str.ToLower())
        {
            if (abc.Contains(ch))   result += greek[abc.IndexOf(ch)];
            else    result += ch;
        }
        
        return result;
    }

    public static void Main(string[] args)
    {
        System.Console.WriteLine(GreekL33t("CodeWars"));
        System.Console.WriteLine(GreekL33t("Kata"));
    }
}