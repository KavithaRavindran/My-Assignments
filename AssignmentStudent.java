package Week3.Day1;

public class AssignmentStudent {

		public void getStudentInfo(int id)
		{
			System.out.println("Student id is " +id);
		}
		public void getStudentInfo(int id,String name)
		
		{
			
			System.out.println("Student id is " +id);
			System.out.println("Student name is " +name);
		}
		public void getStudentInfo(String email, String phoneNumber)
		
		{
			System.out.println("Student email id is "+email);
			System.out.println("Student phone number is "+ phoneNumber);
		}
		
		
	public static void main(String[] args)
	
	{
			AssignmentStudent obj =new AssignmentStudent ();
			obj.getStudentInfo(111);
			obj.getStudentInfo(112, "Prem");
	        obj.getStudentInfo("prem@gmail.com", "7305854100"); 
		}
	}