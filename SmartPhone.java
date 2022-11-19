package Week3.Day1;

public class SmartPhone extends Android {
	
	public void connectWhatsapp()
	
	{
		
		System.out.println("connecting whatsapp");
	}


	public static void main(String[] args) {
		
		SmartPhone obj=new SmartPhone();
		obj.sending();
		obj.makecall();
		obj.savecontact();
		obj.connectWhatsapp();
		obj.takevideo();
		
		
		

	}

}
