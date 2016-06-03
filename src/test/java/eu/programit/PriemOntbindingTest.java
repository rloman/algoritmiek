package eu.programit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PriemOntbindingTest {
	
	private PriemOntbinding po;
	
	@Before
	public void setUp(){
		this.po = new PriemOntbinding();
	}
	
	@Test
	public void testFoo() {
		Assert.assertEquals("2, 3", this.po.po(6));
	}

}
