
public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessGame guess_game = new GuessGame();
		guess_game.startGame();
	}

}

class GuessGame
{
	Player p1;
	Player p2;
	Player p3;
	
	void startGame()
	{
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guess_p1 = 0;
		int guess_p2 = 0;
		int guess_p3 = 0;
		
		boolean p1_is_right = false;
		boolean p2_is_right = false;
		boolean p3_is_right = false;
		
		int target_number = (int)(Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while(true)
		{
			System.out.println("Number to guess is " + target_number);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guess_p1 = p1.number;
			System.out.println("Playone guessed " + p1.number);
			guess_p2 = p2.number;
			System.out.println("Playone guessed " + p2.number);
			guess_p3 = p3.number;
			System.out.println("Playone guessed " + p3.number);
			
			if(p1.number == target_number)
				p1_is_right = true;
			if(p2.number == target_number)
				p2_is_right = true;
			if(p3.number == target_number)
				p3_is_right = true;
			
			if(p1_is_right || p2_is_right || p3_is_right)
			{
				System.out.println("We have a winner!");
				System.out.println("Game over!");
				break;
			}
			else
			{
				System.out.println("Players will have to try again.");
			}
		}
	}
}

class Player
{
	int number = 0;
	
	void guess()
	{
		number = (int)(Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}
