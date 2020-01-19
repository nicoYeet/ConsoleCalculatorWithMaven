package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(25, 10) == 15);
	}
	
	@Test
	public void testSummeEinPositiverEinNegativerIsOk() {
		assertTrue(testee.summe(10, -5) == 5);
	}
	
	@Test
	public void testSubtractionEinPositiverEinNegativerIsOk() {
		assertTrue(testee.subtraktion(10, -5) == 15);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivisionDivisionDurch0WirftException() {
		testee.division(20, 0);
	}
	
	@Test
	public void testDivisionFailsWennExceptionWirft()
		throws ArithmeticException{
			testee.division(30, 10);
	}
	
	@Test
	public void testMultiplikationZweiPositiveIsOk() {
		assertTrue(testee.multiplikation(10, 5) == 50);
	}
	
	@Test
	public void testMultiplikationEinPositiveEinNegativeIsOk() {
		assertTrue(testee.multiplikation(10, -5) == -50);
	}
	
	@Test
	public void testMultiplikationZweiNegativeIsOk() {
		assertTrue(testee.multiplikation(-10, -5) == 50);
	}
}
