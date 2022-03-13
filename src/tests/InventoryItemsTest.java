package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import InventoryItems.InventoryItemsActions;

public class InventoryItemsTest {

	InventoryItemsActions inventoryItemsActions;
	
	@BeforeClass
	public void beforeClass() {
		inventoryItemsActions = new InventoryItemsActions();
	}

	@Test
	public void navigateToInvoentoryCounts() throws Throwable {
		inventoryItemsActions
		.clickinventoryArrowLink();
		
		System.out.println("clicked inventory");
		
	}
}
