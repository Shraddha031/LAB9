package JunitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		junitFunction junitstring =new junitFunction();
		String result=junitstring.addStrings("my","Project");
		assertEquals("myProject",result);
	}

}
