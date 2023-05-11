/* Kata Level: 6.
 * 
 * Your task is to construct a building which will be a pile of n cubes. 
 * The cube at the bottom will have a volume of n^3 , the cube above 
 * will have volume of (n−1)^3 and so on until the top which will have a volume of 1^3.
 * 
 * You are given the total volume m of the building. 
 * Being given m can you find the number n of cubes you will have to build?
 * The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer 
 * m and you have to return the integer n such as n^3+(n−1)^3+...+1^3=m
 * if such a n exists or -1 if there is no such n.
 * 
 * Examples:
 * findNb(1071225) --> 45
 * findNb(91716553919377) --> -1
 */

public class Kata {

    // Literalmente misma solución que en Java cambiando la palabra pow por Pow.
	public static long findNb(long m) {
		long resultado = 0;
		for (int i = 0; i < m; i++) {
			resultado += (long) Math.Pow((i + 1), 3);
			if (resultado == m)
				return i + 1;
			else if (resultado > m)
				return -1;
		}
		return 0;
	}
	
}