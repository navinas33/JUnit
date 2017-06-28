package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator obj=new Calculator();
		assertEquals(5, obj.add(2, 3));
		
	}

	@Test
	public void testSubtract() {
		Calculator obj=new Calculator();
		assertEquals(-1, obj.subtract(2, 3));
		
	}

}
