package Week3.Day1;

public class Calculator

{
	
	public void add (int n1, int n2 ) 
	{
		
		System.out.println(n1+n2);
	}
	
	public void add (int n3, int n4, int n5) 
	{
		
		System.out.println(n3+n4+n5);
	}

	public void sub (double n1,double n2) 
	{
		
		System.out.println (n1-n2);
	}
	public void sub(int n3,int n4) 
	{
		
		System.out.println (n3-n4);
		
	}
	
	public void mul (int n1, double n2 ) 
	{
		
		System.out.println(n1*n2);
		
	}
	
	public void mul (double n1,double n2)
	{
		
		System.out.println(n1*n2);
	}
	
	public static void main(String[] args)
	{
		
		Calculator obj=new Calculator();
		obj.add(88, 98);
		obj.add(88, 1001,24);
		obj.sub(24.56,15.66);
		obj.sub(99, 1);
		obj.mul(98,1);
		obj.mul(66.56,99.98);
		
		
	}}


