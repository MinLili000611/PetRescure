/***************************************************************************
 * 
 * Min Li
 * CST8110_310
 * Assignment 2
 * Purpose: To create a main class that prints animals
 ****************************************************************************/
public class PetRescue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create the objects
		Pet p1 = new Pet();
		Pet p2 = new Pet("dog"," beagle", "brown", 10.0, 25);
		Pet p3 = new Pet("fluffy", "cat", "persian", "white", 4.1, 4);
		Pet p4 = new Pet("Rover", "dog", "poodle", "white", 6.62, 6);
		
		//test that they were created successfully using toString()
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
		//use the setter and test
		p1.setAgeMonths(0);
		p2.setAgeMonths(25);
		p3.setAgeMonths(4);
		p4.setAgeMonths(6);

		
		
	}

}
