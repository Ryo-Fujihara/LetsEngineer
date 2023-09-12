package check;

import constants.Constants;

public class Main {
	
	private String firstName = "藤原";
	private String lastName = "涼";
	
	
	private void printName () {
		
		System.out.println("printNameメソッド→ "  + firstName + lastName);
	}

	public static void main(String [] args) {
		
		Main pn = new Main();
		pn.printName();
		
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE) ;
		pt.introduce();
			
		
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		rp.introduce();
		
		
		
	}
	
}
