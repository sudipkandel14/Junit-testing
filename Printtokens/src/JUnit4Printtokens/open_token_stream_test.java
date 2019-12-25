package JUnit4Printtokens;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class open_token_stream_test {
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
		Printtokens test = new Printtokens();
		BufferedReader output = test.open_token_stream("file.txt");
		assertNotEquals(null, output);
	}
	
	@Test
	public void test2() {
		BufferedReader output;
		String fileName = null;
		Printtokens test = new Printtokens(); 
		output = test.open_token_stream(fileName);
		assertNotEquals(null, output);
	}
	@Test
	public void test3() {
		String fileName = "invalidfile";
		Printtokens test = new Printtokens(); 
		test.open_token_stream(fileName);
		assertEquals("The file invalidfile doesn't exists\n",outContent.toString());
	}
}
