package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import InventoryCount.InventoryCountActions;

public class InventoryCountTest  {

	InventoryCountActions inventoryCountActions;
	
	@BeforeClass
	public void beforeClass() {
		inventoryCountActions = new InventoryCountActions();
	}
	
	@Test
	public void goToFirstCount() throws Throwable {
		Thread.sleep(5000);
		inventoryCountActions
		.clickFirstCount();
	
		System.out.println("accessed Inventory Successfully");
	
	}
}
