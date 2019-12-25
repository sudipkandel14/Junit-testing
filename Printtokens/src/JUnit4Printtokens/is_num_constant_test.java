package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class is_num_constant_test {

	@Test
	public void test() {
		boolean result = Printtokens.is_num_constant("12");
		assertEquals(true, result);
	}
	
	@Test
	public void test1() {
		boolean result = Printtokens.is_num_constant("123");
		assertEquals(true, result);
	}
	
	@Test
	public void test2() {
		boolean result = Printtokens.is_num_constant("a1");
		assertEquals(false, result);
	}
	
	@Test
	public void test3() {
		boolean result = Printtokens.is_num_constant("11a");
		assertEquals(false, result);
	} 
	@Test
	public void test4() {
		boolean result = Printtokens.is_num_constant("csc");
		assertEquals(false, result);
	} 
	
}
