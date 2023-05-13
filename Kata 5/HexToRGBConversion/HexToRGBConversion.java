/* Kata Level: 5.
 * 
 * When working with color values it can sometimes be useful to 
 * extract the individual red, green, and blue (RGB) component values for a color. 
 * Implement a function that meets these requirements:
 * 
 * Accepts a case-insensitive hexadecimal color string as its parameter (ex. "#FF9933" or "#ff9933").
 * Returns a Map<String, int> with the structure {r: 255, g: 153, b: 51} where r, g, and b range from 0 through 255
 * 
 * Note: your implementation does not need to support the shorthand form of hexadecimal notation (ie "#FFF")
 * 
 * Example:
 * "#FF9933" --> {r: 255, g: 153, b: 51}
 */

import java.util.*;

public class HexToRGBConversion {
	
	public static int[] hexStringToRGB(String hex) {
		hex = hex.toUpperCase();
		Map<Character, Integer> mapa = new HashMap<>();
		mapa.put('0', 0);
		mapa.put('1', 1);
		mapa.put('2', 2);
		mapa.put('3', 3);
		mapa.put('4', 4);
		mapa.put('5', 5);
		mapa.put('6', 6);
		mapa.put('7', 7);
		mapa.put('8', 8);
		mapa.put('9', 9);
		mapa.put('A', 10);
		mapa.put('B', 11);
		mapa.put('C', 12);
		mapa.put('D', 13);
		mapa.put('E', 14);
		mapa.put('F', 15);
		int[] resultados = new int[3];
		resultados[0] = mapa.get(hex.charAt(1))*16 + mapa.get(hex.charAt(2));
		resultados[1] = mapa.get(hex.charAt(3))*16 + mapa.get(hex.charAt(4));
		resultados[2] = mapa.get(hex.charAt(5))*16 + mapa.get(hex.charAt(6));
	    return resultados;
	  }
	
	public static void main(String[] args) {

		int[] resultado = hexStringToRGB("#FF9933");
		for(int numero : resultado)
			System.out.print(numero + " ");
		System.out.println("");
		
		resultado = hexStringToRGB("#FF00FF");
		for(int numero : resultado)
			System.out.print(numero + " ");

	}

}
