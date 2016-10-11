package Triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class Triangle_Test {

	@Test
	public void test() {
		Triangle t1 = new Triangle(1,1,1);
		Triangle t2 = new Triangle(2,2,2.82);
		assertEquals(t1.getArea(),.433,.1);
		assertEquals(t1.getPerimeter(),3,.1);
		assertEquals(t1.toString(),"side 1: 1.0 side 2: 1.0 side 3: 1.0");
		assertEquals(t2.getArea(),1.99,.1);
		assertEquals(t2.getPerimeter(),6.82,.1);
		
	}

}
