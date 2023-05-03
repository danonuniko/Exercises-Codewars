/* Kata Level: 6.
 * 
 * You probably know the "like" system from Facebook and other pages. 
 * People can "like" blog posts, pictures or other items. 
 * We want to create the text that should be displayed next to such an item.
 * Implement the function which takes an array containing the names of people that like an item. 
 * It must return the display text as shown in the examples:
 * 
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 * Note: For 4 or more names, the number in "and 2 others" simply increases.
 */

 public class LikesFacebook {
	
	// Mi solución.
	public static String whoLikesIt(String... names) {
		if(names.length == 0) {
			return "no one likes this";
		}
		else if(names.length == 1) {
			return names[0] + " likes this";
		}
		else if(names.length == 2) {
			return names[0] + " and " + names[1] + " like this";
		}
		else if(names.length == 3) {
			return names[0] + ", " + names[1] + " and " + names[2] + " like this";
		}
		else {
			return names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
		}
    }
	
	// Solución de la comunidad.
	public static String whoLikesIt2(String... names) {
	    switch (names.length) {
	      case 0: return "no one likes this";
	      case 1: return String.format("%s likes this", names[0]);
	      case 2: return String.format("%s and %s like this", names[0], names[1]);
	      case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
	      default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
	    }
    }
	
	public static void main(String[] args) {
		
		System.out.println(whoLikesIt());
		System.out.println(whoLikesIt("Daniel"));
		System.out.println(whoLikesIt("Daniel", "Marco"));
		System.out.println(whoLikesIt("Daniel", "Marco", "Pedro"));
		System.out.println(whoLikesIt("Daniel", "Marco", "Pedro", "Juan"));
		System.out.println(whoLikesIt("Daniel", "Marco", "Pedro", "Juan", "Julián"));
		System.out.println(whoLikesIt("Daniel", "Marco", "Pedro", "Juan", "Julián", "Perico", "Maria", "Carlota"));
		
	}

}
