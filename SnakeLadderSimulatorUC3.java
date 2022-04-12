package day_4;
/*
 * Author: Rajesh
 *Snake And Ladder Simulator Program UC3 : After rolling the dice player checks for a option, No play, Ladder or Snake.
 */
public class SnakeLadderSimulatorUC3 {
	static int player1Position = 0;
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	
	public static void main(String[] args) {
		
		int rollDie = (int) ((Math.floor(Math.random()*10) % 6) + 1);
		int optionCheck = (int) (Math.floor(Math.random()*10) % 3);
		
		switch (optionCheck) {
		case NO_PLAY:
			player1Position += 0;
			System.out.println("Position of player at No Play is " + player1Position);
			break;
		case LADDER:
			player1Position += rollDie;
			System.out.println("Position of player after climbing ladder is " + player1Position);
			break;
		case SNAKE:
			player1Position -= rollDie;
			System.out.println("Position of player after stepping on snake  is " + player1Position);
			break;	
		}
	}

}
