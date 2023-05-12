/* Kata Level: 5.
 * 
 * The rgb function is incomplete. Complete it so that passing in RGB decimal 
 * values will result in a hexadecimal representation being returned. 
 * Valid decimal values for RGB are 0 - 255. 
 * Any values that fall out of that range must be rounded to the closest valid value.
 * 
 * Note: Your answer should always be 6 characters long, 
 * the shorthand with 3 will not work here.
 * 
 * The following are examples of expected output values:
 * 
 * RgbToHex.rgb(255, 255, 255) // returns FFFFFF
 * RgbToHex.rgb(255, 255, 300) // returns FFFFFF
 * RgbToHex.rgb(0, 0, 0)       // returns 000000
 * RgbToHex.rgb(148, 0, 211)   // returns 9400D3
 */

import java.util.*;

public class RGBToHexConversion {

	public static String rgb(int r, int g, int b) {

		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(0, "0");
		mapa.put(1, "1");
		mapa.put(2, "2");
		mapa.put(3, "3");
		mapa.put(4, "4");
		mapa.put(5, "5");
		mapa.put(6, "6");
		mapa.put(7, "7");
		mapa.put(8, "8");
		mapa.put(9, "9");
		mapa.put(10, "A");
		mapa.put(11, "B");
		mapa.put(12, "C");
		mapa.put(13, "D");
		mapa.put(14, "E");
		mapa.put(15, "F");

		String resultado = "";

		if (r <= 0)
			resultado += "00";
		else if (r >= 255)
			resultado += "FF";
		else
			resultado += mapa.get(r / 16) + mapa.get((int) ((float) ((float) r / 16 - (int) r / 16) * 16));

		if (g <= 0)
			resultado += "00";
		else if (g >= 255)
			resultado += "FF";
		else
			resultado += mapa.get(g / 16) + mapa.get((int) ((float) ((float) g / 16 - (int) g / 16) * 16));

		if (b <= 0)
			resultado += "00";
		else if (b >= 255)
			resultado += "FF";
		else
			resultado += mapa.get(b / 16) + mapa.get((int) ((float) ((float) b / 16 - (int) b / 16) * 16));

		return resultado;

	}

	public static String rgb1(int r, int g, int b) {

		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(0, "0");
		mapa.put(1, "1");
		mapa.put(2, "2");
		mapa.put(3, "3");
		mapa.put(4, "4");
		mapa.put(5, "5");
		mapa.put(6, "6");
		mapa.put(7, "7");
		mapa.put(8, "8");
		mapa.put(9, "9");
		mapa.put(10, "A");
		mapa.put(11, "B");
		mapa.put(12, "C");
		mapa.put(13, "D");
		mapa.put(14, "E");
		mapa.put(15, "F");

		String resultado = "";
		String primerNumero = "";
		String segundoNumero = "";
		int multi = 0;
		float resto = 0.0f;

		if (r <= 0)
			resultado += "00";
		else if (r >= 255)
			resultado += "FF";
		else {
			primerNumero = mapa.get(r / 16);
			resto = ((float) r / 16) - r / 16;
			multi = (int) (resto * 16);
			segundoNumero = mapa.get(multi);
			resultado += primerNumero + segundoNumero;
		}

		if (g <= 0)
			resultado += "00";
		else if (g >= 255)
			resultado += "FF";
		else {
			primerNumero = mapa.get(g / 16);
			resto = ((float) g / 16) - g / 16;
			multi = (int) (resto * 16);
			segundoNumero = mapa.get(multi);
			resultado += primerNumero + segundoNumero;
		}

		if (b <= 0)
			resultado += "00";
		else if (b >= 255)
			resultado += "FF";
		else {
			primerNumero = mapa.get(b / 16);
			resto = ((float) b / 16) - b / 16;
			multi = (int) (resto * 16);
			segundoNumero = mapa.get(multi);
			resultado += primerNumero + segundoNumero;
		}

		return resultado;

	}

	public static void main(String[] args) {

		System.out.println(rgb(255, 255, 255));
		System.out.println(rgb(255, 255, 300));
		System.out.println(rgb(0, 0, 0));
		System.out.println(rgb(148, 0, 211));

	}

}
