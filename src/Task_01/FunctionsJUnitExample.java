package Task_01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FunctionsJUnitExample {

	@Test
	void testAssertArrayEquals() {
		String[] a = {};
		String[] b = {};
		
		assertArrayEquals("failua don't same", a, b);
	}

}
