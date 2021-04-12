package JunitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddNumbers {

	@Test
	public void test() {
		junitFunction junit =new junitFunction();
		int result=junit.addNumbers(12,20);
		assertEquals (32,result);
		
	}

}
