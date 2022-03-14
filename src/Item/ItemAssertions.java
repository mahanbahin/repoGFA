package Item;

import org.testng.Assert;

import tests.BaseTest;

public class ItemAssertions {

	Item page = new Item();

	public ItemAssertions verifyCalculatorInputValueReflected(int num1, int num2, String operator)
			throws InterruptedException {
		Assert.assertEquals(page.calculatorInput.getText(), num1 + " " + operator + " " + num2);
		return this;

	}

	public ItemAssertions verifyCalculatorOutput(int num1, int num2, String operator) {

		BaseTest.waitVisibilityOf(page.price);

		int price = Integer.parseInt(page.price.getText().substring(page.price.getText().indexOf("$") + 1,
				page.price.getText().indexOf("/")));
		int quantity = Integer.parseInt(page.quantity.getText().split(" ")[0]);
		int totalprice = Integer
				.parseInt(page.totalPrice.getText().substring(page.totalPrice.getText().indexOf("$") + 1));
		int totalcount = Integer
				.parseInt(page.totalCount.getText().substring(page.totalCount.getText().indexOf("$") + 1));

		int expectedRes = 0;
		switch (operator) {
		case "+":
			expectedRes = num1 + num2;
			break;
		case "*":
			expectedRes = num1 * num2;
			break;
		}

		Assert.assertEquals(quantity, expectedRes);
		Assert.assertEquals(totalprice, expectedRes * price);
		Assert.assertEquals(totalcount, expectedRes * price); // we should have original count sum
		return this;
	}

}
