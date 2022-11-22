package Week3.Day1;

public class Automation extends MultipleLanguage implements TestTool

{
	public void Java() {
		System.out.println("Language-Java");
		
	}

	public void Selenium() {
		System.out.println("Language-Selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("Language-Ruby");
		
	}


	public static void main(String[] args)
	
	{
		Automation obj = new Automation();
		obj.Java();
		obj.python();
		obj.ruby();
		obj.Selenium();

	}

	
}