	/**
		 * 1. Create a void method called stateName() that prints out your name. 
		 * Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), 
		 * and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().
		 * 
		 * 2. Create a void method printCircleStats() that is passed a double 
		 * (meant to represent a circle's radius) and calculates then prints out the radius, 
		 * diameter, circumference, and area of the circle. Call the method to make sure it works. 
		 * 
		 * 3. Create a void method printMathStuffs() that is passed two ints and prints their 
		 * sum, difference, product, quotient, and the remainder (using modulus) of the first number 
		 * modulus the second number. Call it to make sure it works.
		 */

public class Methods {

	public static void main(String[] args) {
		
		//Task 1 (Calls my methods to see if they work [with prettieness :)]
		System.out.println("Profile:");
		System.out.println(" ");
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		System.out.println(" ");
		
		//Task 2 
		printCircleStats(2.0);
		System.out.println(" ");
		
		//Task 3
		printMathsStuffs(1,2);
		
	}

	
	/**
	 * This method prints out my First and Last name.
	 */
	public static void stateName() {
		
		System.out.println("Name: Jacob Inocencio");
		
	}
	
	
	/**
	 * This method prints out my Eye color.
	 */
	public static void stateEyeColor() {
		
		System.out.println("Eye Color: Brown");
		
	}
	
	
	/**
	 * This method prints out my Hair style.
	 */
	public static void stateHairStyle() {
		
		System.out.println("Hair Style: Middle Part");
		
	}
	
	
	/**
	 * This method prints out who my best friend is.
	 */
	public static void stateBestFriend() {
		
		System.out.println("Best Friend: Jesus");
		
	}
	
	
	/**
	 * This method prints out my favorite food.
	 */
	public static void stateFavoriteFood() {
		
		System.out.println("Favorite Food: Water :)");
		
	}
	
	
	/**
	 * This method uses math to print out the circles
	 * radius, diameter, circumference, and area.
	 */
	public static void printCircleStats(double r) {
       
		//These 4 lines use math to determine the values.
		double diameter = 2 * r;
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        //These print out the results of the last 4 lines.
        System.out.println("Radius: " + r);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area); 

	}
	
	
	/**
	 * This method takes 2 variables that are given 
	 * in the main class and uses SOPs to do math
	 * and then prints out the outcomes.
	 */
	public static void printMathsStuffs(int a, int b) {
		
		//These lines print out the result of the math eqns.
		System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));
		
	}
	
}
