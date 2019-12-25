package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;


public class is_character_constant_test {

	@Test
	public void test() {
		boolean result = Printtokens.is_char_constant("#b");
		assertEquals(true, result);
	}

	@Test
	public void test2() {
		boolean result = Printtokens.is_char_constant("#ab");
		assertEquals(true, result);
	}
	

	@Test
	public void test3() {
		boolean result = Printtokens.is_char_constant("b");
		assertEquals(false, result);
	}

	@Test
	public void test4() {
		boolean result = Printtokens.is_char_constant("#2");
		assertEquals(false, result);
	}

	@Test
	public void test5() {
		boolean result = Printtokens.is_char_constant(" ");
		assertEquals(false, result);
	}

}
