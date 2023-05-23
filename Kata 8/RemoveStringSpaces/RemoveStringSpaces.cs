/* Kata Level: 8.
 * 
 * DESCRIPTION:	Simple, remove the spaces from the string, then return the resultant string.
 */
 
public static class SpacesRemover
{
    public static string NoSpace(string input)
    {
        return string.Join("", input.Split());
    }  

    // Opción 2.
    public static string NoSpace(string input)
    {
        return input.Replace(" ", "");
    } 
    
    // Opción 3, sin optimizar.
    public static string NoSpace(string input)
    {
        string result = "";
        foreach(char letter in input)
        {
            if(letter != ' ')   result += letter;
        }
        return result;
    } 
}