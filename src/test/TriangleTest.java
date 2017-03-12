package test;

import triangletest.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;


public class TriangleTest {
	
	public Triangle t;

	@Before
	public void setUp() throws Exception {
		System.out.println("start!");
		t=new Triangle();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("end!");
	}

	@Ignore
	public void testTriangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculate() {
		t = new Triangle(1,1,1);
		t.calculate();
        assertEquals("equilateral",t.getresult());
        t = new Triangle(1,2,2);
        t.calculate();
        assertEquals("isosceles",t.getresult());
        t = new Triangle(2,1,2);
        t.calculate();
        assertEquals("isosceles",t.getresult());
        t = new Triangle(1,2,3);
        t.calculate();
        assertEquals("not a triangle",t.getresult());
        t = new Triangle(3,4,5);
        t.calculate();
        assertEquals("scalene",t.getresult());
	}

	@Ignore
	public void testGetresult() {
		fail("Not yet implemented");
	}

}
