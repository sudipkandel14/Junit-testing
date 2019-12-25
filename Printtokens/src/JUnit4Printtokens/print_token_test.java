package JUnit4Printtokens;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class print_token_test {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	} 

	@Test
	public void test() {
		String input = "and" ;
		Printtokens test = new Printtokens();
		test.print_token(input);
		assertEquals("keyword,\"and\".\n", outContent.toString());		
	}
	
	
	@Test
	public void test2() {
		String input = "tt" ;
		Printtokens test = new Printtokens();
		test.print_token(input);
		assertEquals("identifier,\"tt\".\n", outContent.toString());	
	}
	
	@Test
	public void test3() {
		String input = "123" ;
		Printtokens test = new Printtokens();
		test.print_token(input);
		assertEquals("numeric,123.\n", outContent.toString());	
	}
	
	@Test
	public void test4() {
		String input = "#abc" ;
		Printtokens test = new Printtokens();
		test.print_token(input);
		assertEquals("character,\"a\".\n", outContent.toString());	
	}
	@Test
	public void test5() {
		String input = "abc@" ;
		Printtokens test = new Printtokens();
		test.print_token(input);
		assertEquals("error,\"abc@\".\n", outContent.toString());
	}
	@Test
	public void test6() {
		String input = "[" ;
		Printtokens test = new Printtokens();
		test.print_token(input);
		assertEquals("lsquare.\n", outContent.toString());	
	}
}
