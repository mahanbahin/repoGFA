package Item;


public class ItemActions{

	Item page =new  Item();

	public ItemActions clickNum(int num) {
		
		switch (num) {
		case 0:
			page.zeroNo.click();
			break;
		case 1:
			page.oneNo.click();
			break;
		case 2:
			page.twoNo.click();
			break;
		case 3:
			page.threeNo.click();
			break;
		case 4:
			page.fourNo.click();
			break;
		case 5:
			page.fiveNo.click();
			break;
		case 6:
			page.sixNo.click();
			break;
		case 7:
			page.sevenNo.click();
			break;
		case 8:
			page.eightNo.click();
			break;
		case 9:
			page.nineNo.click();
			break;
			
		}
			
		return this;
	}
	

	public ItemActions clickClose() {
		page.closeBtn.click();
		return this;
	}
	
	public ItemActions clickMultiply() {
		page.multiplyBtn.click();
		return this;
	}
	
	public ItemActions clicAdd() {
		page.addBtn.click();
		return this;
	}
	
	public ItemActions clicBackspace() {
		page.backspaceBtn.click();
		return this;
	}
	 
	public ItemActions clearInput() {
	//	page.calculatorInput.clear();
		int num = page.calculatorInput.getText().length();
		for(int i=0; i<num;i++)
			clicBackspace();
		return this;
	}
	
	
}

