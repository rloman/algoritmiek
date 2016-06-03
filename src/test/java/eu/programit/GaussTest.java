package eu.programit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GaussTest {
	
	private Gauss gauss;
	
	@Before
	public void setUp() {
		this.gauss = new Gauss();
	}
	
	@Test
	public void testGauss() {
		
		Assert.assertEquals(21, gauss.gauss(6));
	}
	
	@Test
	public void testCompleteGraph() {
		Assert.assertEquals(15, gauss.graph(6));
	}
}
