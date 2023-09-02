package check;

import constants.Constants;

public class Main {
	
	private String firstName ;
	private String lastName ;
	
	
	private static void printName (String firstName,String lastName) {
		
		System.out.println("printNameメソッド→ "  + firstName + lastName);
	}
		
	public static void main(String [] args) {
		
		Main .printName("藤原","涼");
		
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE) ;
		pt.introduce();
			
		
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		rp.introduce();
		
		
		
	}
	
}
