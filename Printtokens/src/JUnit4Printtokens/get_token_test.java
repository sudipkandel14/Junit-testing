package JUnit4Printtokens;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.junit.Test;

public class get_token_test {
	
	@Test
	public void test() {
		BufferedReader br = null;
		try{
			FileReader reader = new FileReader("file.txt");
				br = new BufferedReader(reader);
		}
		catch (IOException e) {
	    System.err.format("IOException: %s%n", e);
		}
		
		Printtokens test = new Printtokens();
		String result = test.get_token(br);
		assertEquals("and", result);
	}
	
	@Test
	public void test2() {
		String input = "(";
		Reader inputString = new StringReader(input);
		BufferedReader br = new BufferedReader(inputString);
		Printtokens test = new Printtokens();
		String result = test.get_token(br);
		System.out.println(result);
		assertEquals("(", result);
	}
	
	@Test
	public void test3() {
		String input = "";
		Reader inputString = new StringReader(input);
		BufferedReader br = new BufferedReader(inputString);
		Printtokens test = new Printtokens();
		String result = test.get_token(br);
		System.out.println(result);
		assertEquals(null, result);
	}
	@Test
	public void test5() {
		String input = "a	\r b";
		Reader inputString = new StringReader(input);
		BufferedReader br = new BufferedReader(inputString);
		Printtokens test = new Printtokens();
		String result = test.get_token(br);
		System.out.println(result);
		assertEquals("a	", result);
	}
	
	@Test
	public void test6() {
		String input = "; abx";
		Reader inputString = new StringReader(input);
		BufferedReader br = new BufferedReader(inputString);
		Printtokens test = new Printtokens();
		String result = test.get_token(br);
		System.out.println(result);
		assertEquals("; abx", result);
	}
	@Test
	public void test7() {
		String input = "\"and";
		Reader inputString = new StringReader(input);
		BufferedReader br = new BufferedReader(inputString);
		Printtokens test = new Printtokens();
		String result = test.get_token(br);
		System.out.println(result);
		assertEquals("\"and", result);
	}
	@Test
	public void test8() {
		String input = "and(";
		Reader inputString = new StringReader(input);
		BufferedReader br = new BufferedReader(inputString);
		Printtokens test = new Printtokens();
		String result = test.get_token(br);
		System.out.println(result);
		assertEquals("and", result);
	}

}