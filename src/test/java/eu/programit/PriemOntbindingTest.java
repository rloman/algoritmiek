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
	public void testSix() {
		Assert.assertEquals("2*3", this.po.po(6));
	}
	
	@Test
	public void testNine() {
		Assert.assertEquals("3^2", this.po.po(9));
	}
	
	@Test
	public void test19() {
		Assert.assertEquals("19", this.po.po(19));
	}
	
	@Test
	public void test21() {
		Assert.assertEquals("3*7", this.po.po(21));
	}
	
	@Test
	public void test4(){
		Assert.assertEquals("2^2", this.po.po(4));
	}
	
	@Test
	public void test1024() {
		Assert.assertEquals("2^10", this.po.po(1024));
	}
	
	@Test
	public void test44() {
		Assert.assertEquals("2^2*11", this.po.po(44));
	}

}
