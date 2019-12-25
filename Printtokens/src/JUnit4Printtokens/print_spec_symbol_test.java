package JUnit4Printtokens;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class print_spec_symbol_test {
	
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
		Printtokens.print_spec_symbol(")");
		assertEquals("rparen.\n", outContent.toString());
	}
	
	@Test 
	public void test1() {
		Printtokens.print_spec_symbol("(");
		assertEquals("lparen.\n", outContent.toString());
	}
	
	@Test 
	public void test2() {
		Printtokens.print_spec_symbol("[");
		assertEquals("lsquare.\n", outContent.toString());
	}
	@Test 
	public void test3() {
		Printtokens.print_spec_symbol("]");
		assertEquals("rsquare.\n", outContent.toString());
	}
	
	
	@Test 
	public void test4() {
		Printtokens.print_spec_symbol("'");
		assertEquals("quote.\n", outContent.toString());
	}
	
	@Test 
	public void test5() {
		Printtokens.print_spec_symbol("`");
		assertEquals("bquote.\n", outContent.toString());
	}
		
	
}

