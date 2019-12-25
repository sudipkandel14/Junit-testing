package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class is_keyword_test {

	@Test
	public void test() {
		boolean result = Printtokens.is_keyword("nokey");
		assertEquals(false, result);
	}
	@Test
	public void test1() {
		boolean result = Printtokens.is_keyword("or");
		assertEquals(true, result);
	}
	
	@Test 
	public void test2()
	{
		boolean result = Printtokens.is_keyword("and");
		assertEquals(true, result);
	}

	@Test 
	public void test3()
	{
		boolean result = Printtokens.is_keyword("=>");
		assertEquals(true, result);
	}
	
	@Test 
	public void test4()
	{
		boolean result = Printtokens.is_keyword("xor");
		assertEquals(true, result);
	}
	@Test
	public void test5()
	{
		boolean result = Printtokens.is_keyword("lambda");
		assertEquals(true, result);
	}
	@Test
	public void test6()
	{
		boolean result = Printtokens.is_keyword("if");
		assertEquals(true, result);
	}


}
