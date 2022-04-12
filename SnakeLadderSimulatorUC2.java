package day_4;
/*
 * Author: Rajesh
 *Snake And Ladder Simulator Program UC2 : Rolling the dice using random function.
 */
public class SnakeLadderSimulatorUC2 {
	
	int player1 = 0;
	int rollDie;
	public static void main(String[] args) {
		
		int rollDie = (int) ((Math.floor(Math.random()*10) % 6) + 1);
		System.out.println("Number of Rolled Die : "+rollDie);
	}
}
