import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Brent's Rock Paper Scissors program!");
		 boolean keepPlaying = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		Human human = new Human();
		String name = scan.nextLine();
		System.out.println("Would you like to play against Random or Rock? (1. Radom/2. Rock)");
		int opponentChoice = scan.nextInt();
		System.out.println("Rock, Paper, or Scisors?(1.Rock/2.Paper/3.Scissors)");
		int g = scan.nextInt();
		human.setRoshambo(g);
		System.out.println(name + " " + human.generateRoshambo());


		Player opponent = null;
		if (opponentChoice == 1) {
			opponent = new Random();
			System.out.println("Opponents choice " + opponent.generateRoshambo());

		} else if (opponentChoice == 2) {
			opponent = new Rock();
			System.out.println("Opponents choice " + opponent.generateRoshambo());

		} else if (opponentChoice == 3){
			System.out.println("Opponents choice " + opponent.generateRoshambo());
		}
		String result = matchResult(g, human,opponent);
		System.out.println("Opponent got " + opponent.generateRoshambo() + " " + result);
		
	}
	public static String matchResult(int g,Human human, Player opponent) {
		if(opponent.generateRoshambo() == 1) {
		switch (g) {
		case 1:
			return "Tie";
		case 2:
			return "You loose";
		case 3:
			return "You win!!";
			default:
		}
				}
		return null;
}}
