import static org.junit.Assert.*;

import org.junit.Test;


public class StudentTest {

	@Test
	public void testGetUsername() {
		Student s1 = new Student("john", 1990, 12345);
		assertEquals(s1.getUsername(), "john1990");
	}

}
