package BMICalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class replaceFwithVTest {

	@Test
	public void testScenario1() {
		
		StringHelper stringHelper = new StringHelper();
		String actual = stringHelper.replaceFwithV("f");
		String expected = "v";
		System.out.println("Test ingevoerde geslacht met invoer f: " + expected + " = " + actual);
		assertEquals(actual, expected);
	}
	
	@Test
	public void testScenario2() {
		
		StringHelper stringHelper = new StringHelper();
		String actual = stringHelper.replaceFwithV("F");
		String expected = "F";
		System.out.println("Test ingevoerde geslacht met invoer F: " + expected + " = " + actual);
		assertEquals(actual, expected);
	}

	@Test
	public void testScenario3() {
		
		StringHelper stringHelper = new StringHelper();
		String actual = stringHelper.replaceFwithV("v");
		String expected = "v";
		System.out.println("Test ingevoerde geslacht met invoer v: " + expected + " = " + actual);
		assertEquals(actual, expected);
	}

	@Test
	public void testScenario4() {
		
		StringHelper stringHelper = new StringHelper();
		String actual = stringHelper.replaceFwithV("m");
		String expected = "m";
		System.out.println("Test ingevoerde geslacht met invoer m: " + expected + " = " + actual);
		assertEquals(actual, expected);
	}
	
}
