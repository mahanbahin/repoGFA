package InventoryCount;


public class InventoryCountActions {
	
	InventoryCount page = new InventoryCount();
	
	public InventoryCountActions clickFirstCount() {
		page.firstInvnetoryCountArrow.click();
		return this;
	}
}
