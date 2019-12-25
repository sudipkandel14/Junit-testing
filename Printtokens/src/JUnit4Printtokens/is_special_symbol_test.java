package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class is_special_symbol_test {

	@Test
	public void test() {
		boolean result = Printtokens.is_spec_symbol('(');
		assertEquals(true, result);
	}
	
	@Test
	public void test2() {
		boolean result = Printtokens.is_spec_symbol('-');
		assertEquals(false, result);
	}
	
	@Test
	public void test3() {
		boolean result = Printtokens.is_spec_symbol(')');
		assertEquals(true, result);
	}
	
	@Test
	public void test4() {
		boolean result = Printtokens.is_spec_symbol('[');
		assertEquals(true, result);
	}
	
	@Test
	public void test5() {
		boolean result = Printtokens.is_spec_symbol(']');
		assertEquals(true, result);
	}
	
	@Test
	public void test6() {
		boolean result = Printtokens.is_spec_symbol('/');
		assertEquals(true, result);
	}
	
	@Test
	public void test7() {
		boolean result = Printtokens.is_spec_symbol('`');
		assertEquals(true, result);
	}
	
	@Test
	public void test8() {
		boolean result = Printtokens.is_spec_symbol(',');
		assertEquals(true, result);
	}
	
	
	
	

}
