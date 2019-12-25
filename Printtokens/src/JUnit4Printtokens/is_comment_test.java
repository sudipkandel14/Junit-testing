package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class is_comment_test {

	@Test
	public void test() {
		boolean result = Printtokens.is_comment(";hello");
		assertEquals(true,result);
	}
	
	@Test 
	public void test2() {
		boolean result = Printtokens.is_comment("/hello");
		assertEquals(false, result);
	}

}
