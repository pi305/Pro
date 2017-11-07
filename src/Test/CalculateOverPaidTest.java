package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Start;

public class CalculateOverPaidTest {
	

	@Test
	public void test() {
		assertEquals(true, Start.calculateOverPaid(15000, 10000)==5000);
	}

}
