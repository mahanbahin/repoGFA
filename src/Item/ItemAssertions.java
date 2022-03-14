package Item;

import org.testng.Assert;

public class ItemAssertions {
	Item page =new  Item();

	public ItemAssertions verifyCalculatorInputValueReflected(int num1 , int num2, String operator) throws InterruptedException {
	/*	String res=0;
		switch (operator) {
		case "+":
			res = num1+num2;
			break;
		case "*":
			res = num1*num2;
			break;
		}*/
	//	Assert.assertTrue(page.calculatorInput.getAttribute("value"),);
		Assert.assertEquals(page.calculatorInput.getText(),num1 + " "+operator +" "+num2);
		return this;
		
	}
	
	
	public ItemAssertions verifyCalculatorOutput(int num1 , int num2, String operator)  {
		
		int start = page.price.getText().indexOf("$");
		int stop = page.price.getText().indexOf("/");
		String res = page.price.getText().substring(start, stop);
		
		int price = Integer.parseInt(res);
		System.out.println(price);
		int quantity = Integer.parseInt(page.quantity.getText().split(" ")[0]);
		int totalprice = Integer.parseInt(page.totalPrice.getText().split("$")[0]);
		System.out.println(totalprice);
		int totalcount = Integer.parseInt(page.totalCount.getText().split("$")[0]);
		System.out.println(totalcount);
		
		int expectedRes=0;
		switch (operator) {
		case "+":
			expectedRes = num1+num2;
			break;
		case "*":
			expectedRes = num1*num2;
			break;
		}
		
		Assert.assertEquals(quantity, expectedRes);
		Assert.assertEquals(totalprice, expectedRes*price);
		Assert.assertEquals(totalcount, expectedRes*price);  //we should have original count sum
		return this;
	}

	
}
