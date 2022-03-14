package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import InventoryItems.InventoryItemsActions;
import Item.ItemActions;
import Item.ItemAssertions;
import R356Util.R356Util;

public class MultiplyTest {

	ItemActions itemActions;
	ItemAssertions itemAssertions;
	R356Util utils;
	InventoryItemsActions inventoryItemsActions;

	@BeforeClass
	public void beforeClass() {
		utils = new R356Util();
		itemActions = new ItemActions();
		itemAssertions = new ItemAssertions();
		inventoryItemsActions = new InventoryItemsActions();

	}

	@Test
	public void multiplyTwoIntNo() throws Throwable {
		int num1 = utils.getRandomInteger();
		int num2 = utils.getRandomInteger();
		inventoryItemsActions.clickItemArrowLink();
		itemActions.clearInput().clickNum(num1).clickMultiply().clickNum(num2);

		itemAssertions.verifyCalculatorInputValueReflected(num1, num2, "x");

		itemActions.clickClose();

		itemAssertions.verifyCalculatorOutput(num1, num2, "*");

	}
}
