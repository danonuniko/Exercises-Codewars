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

static string Rps(string p1, string p2)
{
    if((p1 == "rock" && p2 == "paper") || (p1 == "paper" && p2 == "scissors") || (p1 == "scissors" && p2 == "rock"))  return "Player 2 won!";
    else if((p1 == "paper" && p2 == "rock") || (p1 == "scissors" && p2 == "paper") || (p1 == "rock" && p2 == "scissors"))  return "Player 1 won!";
    else  return "Draw!";
}

// Solución de la comunidad C#.
static string Rps(string p1, string p2) {
    if(p1 == p2) return "Draw!";
    int p = (p1 + p2) == "scissorspaper" || (p1 + p2) == "rockscissors" || (p1 + p2) == "paperrock" ? 1 : 2;
    return "Player " + p + " won!";
  }