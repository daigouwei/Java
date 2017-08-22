
public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		String userGuess = "5";
		String result = dot.checkYourself(userGuess);

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
