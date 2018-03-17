package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja v;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v=new VulkanizerskaRadnja();
	}

	@After
	public void tearDown() throws Exception {
		v=null;
	}

	@Test
	public void testDodajGumu() {
		AutoGuma g=new AutoGuma();
		g.setMarkaModel("tigar");
		g.setPrecnik(17);
		g.setSirina(215);
		g.setVisina(55);
		v.dodajGumu(g);
		assertTrue(v.pronadjiGumu("tigar").contains(g));
		
	}
	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuPostoji() {
		AutoGuma g=new AutoGuma();
		g.setMarkaModel("tigar");
		g.setPrecnik(17);
		g.setSirina(215);
		g.setVisina(55);
		v.dodajGumu(g);
		v.dodajGumu(g);
	}
	
	@Test
	public void testPronadjiGumu() {
		AutoGuma g=new AutoGuma();
		g.setMarkaModel("tigar");
		g.setPrecnik(17);
		g.setSirina(215);
		g.setVisina(55);
		v.dodajGumu(g);
		assertTrue(v.pronadjiGumu("tigar").contains(g));
	}
	@Test
	public void testPronadjiGumuNull() {
		assertTrue(v.pronadjiGumu(null)==null);
	}
	@Test
	public void testPronadjiGumuNema() {
		AutoGuma g=new AutoGuma();
		g.setMarkaModel("tigar");
		g.setPrecnik(17);
		g.setSirina(215);
		g.setVisina(55);
		v.dodajGumu(g);
		assertFalse(v.pronadjiGumu("miselin").contains(g));
	}
	@Test
	public void testPronadjiGumuRazliciteDimenzije() {
		AutoGuma g=new AutoGuma();
		g.setMarkaModel("tigar");
		g.setPrecnik(17);
		g.setSirina(205);
		g.setVisina(65);
		v.dodajGumu(g);
		assertTrue(v.pronadjiGumu("tigar").contains(g));
	}
}
