/* Kata Level: 8.
 * 
 * Write a function to convert a name into initials. 
 * This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.
 * 
 * It should look like this:
 * 
 * Sam Harris => S.H
 * patrick feeney => P.F
 */

 public class AbreviaturaNombre {

	// Mi solución.
	public static String iniciales(String texto) {
		String textoFinal = "";
		String[] palabras = texto.split(" ");
		for(String palabra : palabras) {
			textoFinal += Character.toUpperCase(palabra.charAt(0)) + ".";
		}
		// Eliminamos el punto posterior a la última letra mayúscula.
		return textoFinal.substring(0,textoFinal.length()-1);	
	}

	// Solución de la comunidad.
	public static String abbrevName(String name) {
	    String[] names = name.split(" ");
	    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

	public static void main(String[] args) {

		System.out.println(iniciales("Sam Harris"));
		System.out.println(iniciales("patrick feeney"));
		System.out.println(iniciales("Daniel Collado Vizcarro"));
	}

}
