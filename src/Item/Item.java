package Item;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tests.BaseTest;

public class Item extends BaseTest{
 
	
	@AndroidFindBy(id = "btn_add")
	 protected MobileElement addBtn;
	
	@AndroidFindBy(id = "btn_multiply")
	 protected MobileElement multiplyBtn;
	
	@AndroidFindBy(id = "iv_close")
	 protected MobileElement closeBtn;
	
	@AndroidFindBy(id = "btn_num_0")
	 protected MobileElement zeroNo;
	
	@AndroidFindBy(id = "btn_num_1")
	 protected MobileElement oneNo;
	
	@AndroidFindBy(id = "btn_num_2")
	 protected MobileElement twoNo;
	
	@AndroidFindBy(id = "btn_num_3")
	 protected MobileElement threeNo;
	
	@AndroidFindBy(id = "btn_num_4")
	 protected MobileElement fourNo;
	
	@AndroidFindBy(id = "btn_num_5")
	 protected MobileElement fiveNo;
	
	@AndroidFindBy(id = "btn_num_6")
	 protected MobileElement sixNo;
	
	@AndroidFindBy(id = "btn_num_7")
	 protected MobileElement sevenNo;
	
	@AndroidFindBy(id = "btn_num_8")
	 protected MobileElement eightNo;
	
	@AndroidFindBy(id = "btn_num_9")
	 protected MobileElement nineNo;
	
	@AndroidFindBy(id = "et_unit_amount_1")
	 protected MobileElement calculatorInput;

	@AndroidFindBy(id = "btn_backspace")
	 protected MobileElement backspaceBtn;

	@AndroidFindBy(id = "tv_unit")
	 protected MobileElement quantity;
	
	@AndroidFindBy(id = "tv_total_cost")
	 protected MobileElement totalPrice;
	
	@AndroidFindBy(id = "tv_count_total")
	 protected MobileElement totalCount;
	
	@AndroidFindBy(id = "tv_cost")
	 protected MobileElement price;
	
}

