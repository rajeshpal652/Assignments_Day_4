package day_4;
/*
 * Author: Rajesh
 *Snake And Ladder Simulator Program UC6 : Reporting the number of times dice was played to win the game. 
 */
public class SnakeLadderSimulatorUC6 {
	static int player1Position = 0;
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WINNING_POSITION = 100;
	
	public static void main(String[] args) {
		
		int numberDicePlayed = 0;
	
	while(player1Position <= WINNING_POSITION) {
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
			if (player1Position - rollDie <= 0) {
				player1Position = 0;
			}else {
			player1Position -= rollDie;
			System.out.println("Position of player after stepping on snake  is " + player1Position);
			}
			break;
			
		}
		numberDicePlayed ++;
		if (player1Position > 100) {                                //if position is greater than 100 it will roll back to previous value
			player1Position -= rollDie;
        } else if (player1Position == 100) {
            System.out.println("Player wins");
            break;
        } else {
        	player1Position = player1Position;
        }
		
	}
	System.out.println("Number of times Dice was played to win the game : "+numberDicePlayed);
	
	
}

}
