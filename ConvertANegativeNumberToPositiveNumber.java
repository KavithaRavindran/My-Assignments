package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {
	
	public int convertMethod(int negNumber) {
		
		if(negNumber < 0)
			negNumber = -negNumber;
		return negNumber;

	}

	public static void main(String[] args) {
		int a = -10;
		ConvertANegativeNumberToPositiveNumber negative = new ConvertANegativeNumberToPositiveNumber();
		int result = negative.convertMethod(a);
		System.out.println("After converting negative number to positive: " +result);

			
	}


}
