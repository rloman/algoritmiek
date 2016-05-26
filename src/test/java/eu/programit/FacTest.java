package eu.programit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacTest {

	private Fac fac;

	@Before // runs before EVERY test below
	public void setUp() {
		this.fac = new Fac();
	}

	@After // runs after EVERY test below
	public void tearDown() {
		this.fac = null;
	}

	@Test
	public void testFaculteit() {
		Assert.assertEquals(24, fac.fac(4));
	}

	@Test
	public void testFaculteitFail() {
		try {
			fac.fac(-4);
			Assert.fail();
		}
		catch (IllegalArgumentException iae) {
			// ok
		}
	}

	@Test
	public void testFaculteitShouldNotBeMinus1() {
		Assert.assertNotEquals(-1, fac.fac(10));
	}

	@Test
	public void testTooLargeShouldThrowException() {
		try {
			fac.fac(21);
			Assert.fail();
		}
		catch (IllegalArgumentException iae) {
			// ok
		}
	}
}
