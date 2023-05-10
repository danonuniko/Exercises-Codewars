/* Kata Level: 8.
 * 
 * Let's play! You have to return which player won! In case of a draw return Draw!.
 * 
 * Examples(Input1, Input2 --> Output):
 * 
 * "scissors", "paper" --> "Player 1 won!"
 * "scissors", "rock" --> "Player 2 won!"
 * "paper", "paper" --> "Draw!"
 */

 public class RockPaperScissors {
	
	// Mi solución.
	public static String ppt(String a, String b) {
		if (a.equals("scissors") && b.equals("paper") || a.equals("paper") && b.equals("rock")
				|| a.equals("rock") && b.equals("scissors"))
			return "Player 1 won!";
		else if (a.equals("scissors") && b.equals("rock") || a.equals("paper") && b.equals("scissors")
				|| a.equals("rock") && b.equals("paper"))
			return "Player 2 won!";
		return "Draw!";
	}

	// Solución de la comunidad.
	public static String rps(String p1, String p2) {
		if (p1 == p2)
			return "Draw!";
		int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
		return "Player " + p + " won!";
	}

	public static void main(String[] args) {
		
		System.out.println(ppt("scissors", "rock"));
		System.out.println(ppt("paper", "paper"));
		System.out.println(ppt("scissors", "paper"));

	}

}
