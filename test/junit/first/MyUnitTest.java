package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void testStringConcat() {
		MyUnit obj=new MyUnit();
		assertEquals("navinkumar",obj.stringConcat("navin","kumar"));
	}

}
