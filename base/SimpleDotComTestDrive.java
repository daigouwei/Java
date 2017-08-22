import java.io.*;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SimpleDotCom dot = new SimpleDotCom();
		//int[] locations = {2, 3, 4};
		//dot.setLocationCells(locations);
		//String userGuess = "5";
		//String result = dot.checkYourself(userGuess);
		
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int)(Math.random() * 5);
		int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive == true)
		{
			String guess = helper.getUserInput("enter a numper");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			if(result.equals("kill"))
			{
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}

	}

}

class GameHelper
{
	String getUserInput(String prompt)
	{
		String inputLine = null;
		System.out.print(prompt + "  ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0)
				return null;
		}catch(IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
}

class SimpleDotCom
{
	int[] locationCells;
	int numOfHits = 0;
	
	void setLocationCells(int[] loc)
	{
		locationCells = loc;
	}
	
	String checkYourself(String stringGuess)
	{
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int cell : locationCells)
		{
			if(cell == guess)
			{
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits == locationCells.length)
		{
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}
