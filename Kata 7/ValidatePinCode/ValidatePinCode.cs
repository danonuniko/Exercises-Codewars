using System;
using System.Text.RegularExpressions;
public static class ValidatePinCode
{
  public static bool ValidatePin(string pin)
  {

    /*  SOLUCIÓN APLICANDO EXPRESIONES REGULARES.

    Me falla porque acepta también cadenas de 5 carácteres (no reconoce bien el OR que quiero especificar).
    Funciona porque no acepta cadenas menores de 4 caracteres o mayores de 6. 
    Es por ello que necesitaría agregar la condición if y descartar pins con 5 carácteres.
    Aún así falla por más detalles.
    Con cualquiera de las 2 expresiones regulares pasa más de 80 test en CodeWars pero falla en torno a 15 test. MIRAR SOLUCIONES DE LA COMUNIDAD.

    string pattern = "[0-9]{4}|[0-9]{6}"    o   @"\d{4}|\d{6}";
    if (pin.Length != 4 && pin.Length != 6)    return false;
    return Regex.IsMatch(pin, pattern);


    SOLUCIÓN DE LA COMUNIDAD:       return Regex.IsMatch(pin, @"^(\d{6}|\d{4})\z");         ANALIZAR DIFERENCIAS.
    
    */

    if (pin.Length != 4 && pin.Length != 6)    return false;
    foreach(char letter in pin)
    {
      try
      {
        int number = int.Parse(letter.ToString());
      }
      catch
      {
        return false;
      }
    }
    return true;
  }

  public static void Main(string[] args)
  {
    Console.WriteLine(ValidatePin("1234"));
    Console.WriteLine(ValidatePin("12345"));
    Console.WriteLine(ValidatePin("a234"));
  }
}