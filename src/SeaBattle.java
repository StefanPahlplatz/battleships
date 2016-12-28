import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeaBattle {
	public static final boolean	CHEAT = false;
	private static final CharSequence VALID_COORD = "([A-J]||[a-j])(1[0-2]|[1-9])";
	
	private ArrayList<Player> players;
	private int turn;
	private Scanner sc;
	
	public SeaBattle() {
		players = new ArrayList<>();
		turn = 0;
		sc = new Scanner(System.in);
	}
	
	/**
	 * Starts the game
	 */
	public void play() {
		while (true) {
			// Who's turn is it
			System.out.println(String.format("\n*** %s's turn ***", players.get(turn).getName()));
			
			// Draw the field
			players.get(turn).getField().print();
			
			// Ask for the input
			 Matcher m;
			 do {
				 m = Input.getString(sc);
			 } while (.matches(m, VALID_COORD)
			
			// Next turn
			if (players.size() > 1)
				turn ^= 1;
		}
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
}