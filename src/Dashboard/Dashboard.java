package Dashboard;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tests.BaseTest;

public class Dashboard  extends BaseTest {

	@AndroidFindBy(xpath = "//*[@content-desc='Open navigation drawer']")
	 protected MobileElement hampubgerMenu;
	
	@AndroidFindBy(id = "take_inventory")
	 protected MobileElement invenortyCountsMenuItem;
	
	@AndroidFindBy(id = "logout")
	 protected MobileElement logoutBtn;
	
}
