package tests;

import java.util.Random;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Item.ItemActions;
import Item.ItemAssertions;

public class MultiplyTest {

	ItemActions itemActions;
	ItemAssertions itemAssertions;
	
	@BeforeClass
	public void beforeClass() {
		itemActions = new ItemActions();
		itemAssertions = new ItemAssertions();
	}

	public int getRandomInteger() {
		Random random = new Random();
		int num = random.nextInt(10);
		System.out.println(num);
		return num;
	}
	
	@Test
	public void multiplyTwoIntNo() throws Throwable {
		int num1 = getRandomInteger();
		int num2 = getRandomInteger();
		
		itemActions
		.clearInput()
		.clickNum(num1)
		.clickMultiply()
		.clickNum(num2);
		
		itemAssertions
		.verifyCalculatorInputValueReflected(num1, num2, "*");
		
		itemActions
		.clickClose();
		
		itemAssertions.verifyCalculatorOutput(num1, num2, "*");
		
	}
}
