package JunitTestingPackage;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({testaddNumbers.class,testAddStrings.class})
public class TestSuite {

}