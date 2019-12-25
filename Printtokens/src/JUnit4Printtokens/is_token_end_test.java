package JUnit4Printtokens;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class is_token_end_test {

	 @Before
	    public void setUp () {
	    }
	
	@Test
	public void test() {		
		 
		boolean result = Printtokens.is_token_end(1, 34);
		assertEquals(true, result);				
	}
	
	@Test
	public void test1()
	{
		 
		boolean result = Printtokens.is_token_end(1,10);
		assertEquals(true, result);	
	}
	@Test
	public void test2()
	{
		 
		boolean result = Printtokens.is_token_end(1,13);
		assertEquals(true, result);	
	}
	
	@Test
	public void test3()
	{		 
		boolean result = Printtokens.is_token_end(2,10);
		assertEquals(true, result);	
	}
	
	@Test
	public void test4()
	{		 
		boolean result = Printtokens.is_token_end(2,13);
		assertEquals(true, result);	
	}
	
	@Test
	public void test5()
	{		 
		boolean result = Printtokens.is_token_end(2,9);
		assertEquals(true, result);	
	}
	
	@Test 
	public void test6()
	{		 
		boolean result = Printtokens.is_token_end(2,2);
		assertEquals(false, result);	
	}
	@Test
	public void test7() {		
		 
		boolean result = Printtokens.is_token_end(1, -1);
		assertEquals(true, result);				
	}
	@Test
	public void test8() {		
		 
		boolean result = Printtokens.is_token_end(1, 38);
		assertEquals(false, result);				
	}
	@Test
	public void test9() {		
		 
		boolean result = Printtokens.is_token_end(3, 13);
		assertEquals(true, result);				
	}
	@Test
	public void test10() {		
		 
		boolean result = Printtokens.is_token_end(3,44 );
		assertEquals(true, result);				
	}
	@Test
	public void test11() {		
		 
		boolean result = Printtokens.is_token_end(3,9 );
		assertEquals(false, result);				
	}
	 @After
	    public void tearDown () {
	    }

	
}
