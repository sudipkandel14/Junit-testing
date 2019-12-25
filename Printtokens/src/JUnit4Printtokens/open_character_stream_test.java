package JUnit4Printtokens;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class open_character_stream_test {
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
		BufferedReader br;
		String fileName = null;
		Printtokens test = new Printtokens();
		br = test.open_character_stream(fileName);
		assertNotNull(br); 
	}

	@Test
	public void test1() {
		BufferedReader br;
		String fileName = "invalid.txt";
		Printtokens test = new Printtokens();
		br = test.open_character_stream(fileName);
		assertEquals("The file invalid.txt doesn't exists\n", outContent.toString());
		assertEquals(null, br);
	}
	@Test
	public void test3() {
		
		BufferedReader br;
		String fileName = "file.txt";
		Printtokens test = new Printtokens();
		br = test.open_character_stream(fileName);
		assertNotNull(br); 
	}
}
