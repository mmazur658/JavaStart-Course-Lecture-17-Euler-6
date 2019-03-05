package pl.marcinmazur.javastart.euler6;

public class SumsAndSquares {

	public int calcDiffrenceBetweenValues(int number) {

		int sumOfSquares = getSumOfSquares(number);
		int squareOfSum = getSquareOfSum(number);
		
		return squareOfSum - sumOfSquares;
	}
	
	public int getSumOfSquares(int number) {
		
		int sum=0;
		
		for (int i = 1; i <= number; i++) 
			sum += Math.pow(i, 2);
		
		return sum;
		
	}

	public int getSquareOfSum(int number) {
		
		int sum=0;
		
		for (int i = 1; i <= number; i++) 
			sum +=i;
		
		return (int) Math.pow(sum, 2);
	}
}
