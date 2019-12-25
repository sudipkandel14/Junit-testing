package JUnit4Printtokens;

import static org.junit.Assert.*;

import org.junit.Test;

public class token_type_test {

	@Test
	public void test() {
		int result=Printtokens.token_type("or");
		assertEquals(1,result);
	}
	@Test
	public void test1() {
		int result=Printtokens.token_type("(");
		assertEquals(2,result);
	}
	@Test
	public void test2() {
		int result=Printtokens.token_type("aa");
		System.out.println(result);
		assertEquals(3,result);
	}
	@Test
	public void test3() {
		int result=Printtokens.token_type("12");
		System.out.println(result);
		assertEquals(41,result);
	}
	@Test
	public void test4() {
		int result=Printtokens.token_type("\"123\"");
		System.out.println(result);
		assertEquals(42,result);
	}
	@Test
	public void test5() {
		int result=Printtokens.token_type("#a");
		System.out.println(result);
		assertEquals(43,result);
	}
	@Test
	public void test6() {
		int result=Printtokens.token_type(";abc");
		System.out.println(result);
		assertEquals(5,result);
	}
	@Test
	public void test7() {
		int result=Printtokens.token_type("@112A");
		assertEquals(0,result);
	}

}
