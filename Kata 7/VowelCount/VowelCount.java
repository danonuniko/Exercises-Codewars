/* Kata Level: 7.
 * 
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * The input string will only consist of lower case letters and/or spaces.
 */

 public class VowelCount {

	public static int getCount(String str) {
		str = str.replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u').replace('ü', 'u').toLowerCase();
		int contadorVocales = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				contadorVocales += 1;
			}
		}
		return contadorVocales;
	}

	public static void main(String[] args) {

		System.out.println(getCount("Hola caracola"));
		System.out.println(getCount("Abracadabra pata de cabra"));
		System.out.println(getCount("Esternocleidomastoideo"));
		System.out.println(getCount("En un lugar de la Mancha de cuyo nombre no quiero acordarme"));
		
	}

}
