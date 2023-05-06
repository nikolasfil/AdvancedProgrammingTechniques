package gr.upatras.junit.first;
import static org.junit.jupiter.api.Assertions.assertAll;import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class myClassTest {
	@Test
	void testExceptionIsThrown() {
		myClass tester = new myClass();
				assertThrows(IllegalArgumentException.class, () ->
		tester.multiply(1000, 5));
	}
	
	@Test
	void testMultiply() {
		myClass tester = new myClass();
		assertEquals(50, tester.multiply(10, 5), "10 x 5 must be 50");
	}
}