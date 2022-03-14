package R356Util;

import java.util.Random;

public class R356Util {
	public int getRandomInteger() {
		Random random = new Random();
		int num = random.nextInt(10);
		System.out.println(num);
		return num;
	}
	
}
