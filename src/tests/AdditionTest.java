package tests;

import java.util.Random;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Item.ItemActions;

public class AdditionTest {

	ItemActions itemActions;
	
	@BeforeClass
	public void beforeClass() {
		itemActions = new ItemActions();
	}

	public int getRandomInteger() {
		Random random = new Random();
		int num = random.nextInt(10);
		System.out.println(num);
		return num;
	}
	
	@Test
	public void addingTwoIntNo() throws Throwable {
		itemActions
		.clickNum(getRandomInteger())
		.clicAdd()
		.clickNum(getRandomInteger());
		
	}
}
