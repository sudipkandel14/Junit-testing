package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class is_identifier_test {

	@Test
	public void test() {
		boolean result = Printtokens.is_identifier("aaa");
		assertEquals(true, result);
	}
	@Test
	public void test1() {
		boolean result = Printtokens.is_identifier("1aa");
		assertEquals(false, result);
	}
	@Test
	public void test2() {
		boolean result = Printtokens.is_identifier("ab123");
		assertEquals(true, result);
	}
	@Test
	public void test3() {
		boolean result = Printtokens.is_identifier("aa1@\"");
		assertEquals(false, result);
	}

}
