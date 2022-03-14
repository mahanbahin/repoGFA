package InventoryCount;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tests.BaseTest;

public class InventoryCount   extends BaseTest{
	
	@AndroidFindBy(id = "iv_arrow")
	protected List<MobileElement> firstInvnetoryCountArrow;
}
