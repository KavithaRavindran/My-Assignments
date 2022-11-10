package week1.day2;

public class ArmStrongNum {

	public static void main(String[] args) {
		
			int num = 100, rem, temp;
			double res = 0;
			temp = num;
			while(temp!=0)
			{
				rem = temp % 10;
				res = res + Math.pow(rem, 3);
				temp = temp / 10;
			}
			if (res == num)
				System.out.println(" Given number is an Armstrong number");
			else
				System.out.println("Given number is not an Armstrong number");

	}

}
