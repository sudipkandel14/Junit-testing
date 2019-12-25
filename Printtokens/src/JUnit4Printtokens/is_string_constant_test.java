package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class is_string_constant_test {

	@Test
	public void test() {
		boolean result = Printtokens.is_str_constant("\"xyz\"");
		assertEquals(true, result);
	}
	@Test
	public void test1() {
		boolean result = Printtokens.is_str_constant("\0 234");
		assertEquals(false, result);
	}
	@Test
	public void test2() {
		boolean result = Printtokens.is_str_constant("\"xyz");
		assertEquals(false, result);
	}
	

}
