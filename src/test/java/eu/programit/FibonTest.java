package eu.programit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FibonTest {
	
	private Fibon fibon;
	
	@Before
	public void setUp() {
		this.fibon = new Fibon();
	}
	
	@Test
	public void testFibon() {
		
		int test = fibon.fibon(5);
		
		Assert.assertEquals(5,  test);
		
	}

}
