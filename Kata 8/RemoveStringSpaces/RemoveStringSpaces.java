/* Kata Level: 8.
 * 
 * DESCRIPTION:	Simple, remove the spaces from the string, then return the resultant string.
 */

 public class RemoveStringSpaces {

	// Mi solución 1.
    public static String noSpace(final String x) {
        String resultado = "";
        for(int i = 0 ; i < x.length() ; i++) {
          if(x.charAt(i) != ' ')
            resultado += x.charAt(i);
        }
        return resultado;
    }
    
    // Mi solución 2.
    public static String noSpace1(final String x) {
        return x.replaceAll(" ", "");		// Funciona igual utilizando el método replace en vez de replaceAll.
    }
    
	public static void main(String[] args) {

        System.out.println(noSpace("cuentame un cuento y verás que contento"));

	}

}