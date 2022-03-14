package InventoryCount;

public class InventoryCountActions {
	
	InventoryCount page = new InventoryCount();
	
	public InventoryCountActions clickFirstCount() {
		page.firstInvnetoryCountArrow.get(0).click();
		return this;
	}
	
}
