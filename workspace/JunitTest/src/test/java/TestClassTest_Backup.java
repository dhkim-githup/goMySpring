package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.TestClass;
import main.java.TestClassMulti;

class TestClassTest_Backup {

	@Test
	void test() {
		TestClass tt = new TestClass();
		int result = tt.sum(10, 20);
		
		System.out.println(result);
	}
	
	@Test
	void multi() {
		TestClassMulti tt = new TestClassMulti();
		int result = tt.multi(10, 20);
		
		System.out.println(result);
	}

}
