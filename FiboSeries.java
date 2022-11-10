package week1.day2;

public class FiboSeries {

	public static void main(String[] args) {
		
		    int n = 8, fnum = 0, snum = 1, sum;
			System.out.println(fnum);
			for(int i = 1;i<n;i++)
			{
				
				sum = fnum + snum;
				fnum = snum;
				snum = sum;
				System.out.println(sum);
			}
	}

}
