package Dashboard;

public class DashboardActions {
	Dashboard page =new  Dashboard();
	
	public DashboardActions clickHamburgerMenu() {
		page.hampubgerMenu.click();
		return this;
	}
	
	public DashboardActions clickInventoryCounts() {
		page.invenortyCountsMenuItem.click();
		return this;
	}
	
	public DashboardActions logout() {
		page.logoutBtn.click();
		return this;
	}
	
	
}
