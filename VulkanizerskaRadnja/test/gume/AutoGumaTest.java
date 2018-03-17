package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {
	AutoGuma a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a=new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a=null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("tigar");
		assertEquals("tigar",a.getMarkaModel());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelManje3() {
		a.setMarkaModel("ti");	
	}
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(15);
		assertEquals(15,a.getPrecnik());
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManje() {
		a.setPrecnik(5);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVise() {
		a.setPrecnik(25);
	}
	@Test
	public void testSetSirina() {
		a.setSirina(215);
		assertEquals(215,a.getSirina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManje() {
		a.setSirina(115);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVise() {
		a.setSirina(415);
	}
	@Test
	public void testSetVisina() {
		a.setVisina(65);
		assertEquals(65,a.getVisina());
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManje() {
		a.setVisina(15);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVise() {
		a.setVisina(165);
	}
	@Test
	public void testToString() {
		a.setMarkaModel("tigar");
		a.setPrecnik(17);
		a.setSirina(215);
		a.setVisina(55);
		assertEquals("AutoGuma [markaModel=tigar, precnik=17, sirina=215, visina=55]",a.toString());
	}

	@Test
	public void testEqualsObject() {
		AutoGuma g=new AutoGuma();
		g.setMarkaModel("tigar");
		g.setPrecnik(17);
		g.setSirina(215);
		g.setVisina(55);
		a.setMarkaModel("tigar");
		a.setPrecnik(17);
		a.setSirina(215);
		a.setVisina(55);
		assertTrue(g.equals(a));
	}
	@Test
	public void testEqualsObjectFalse() {
		AutoGuma g=new AutoGuma();
		g.setMarkaModel("miselin");
		g.setPrecnik(15);
		g.setSirina(205);
		g.setVisina(55);
		a.setMarkaModel("tigar");
		a.setPrecnik(17);
		a.setSirina(215);
		a.setVisina(55);
		assertFalse(g.equals(a));
	}

}
