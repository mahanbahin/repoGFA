package tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Item.ItemActions;
import Item.ItemAssertions;
import R356Util.R356Util;

public class AdditionTest {

	ItemActions itemActions;
	ItemAssertions itemAssertions;
	R356Util utils;

	
	@BeforeClass
	public void beforeClass() {
		utils = new R356Util();
		itemActions = new ItemActions();
		itemAssertions = new ItemAssertions();
	}

	
	@Test
	public void addingTwoIntNo() throws Throwable {
		int num1 = utils.getRandomInteger();
		int num2 = utils.getRandomInteger();
		
		itemActions
		.clearInput()
		.clickNum(num1)
		.clicAdd()
		.clickNum(num2);
		
		itemAssertions
		.verifyCalculatorInputValueReflected(num1, num2, "+");
		
		itemActions
		.clickClose();
		
		itemAssertions.verifyCalculatorOutput(num1, num2, "+");
		
	}
	
	
}
