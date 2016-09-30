import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;


public class StudentTest {

	@Test
	public void testGetUsername() {
		Student s1 = new Student("john", 1990, 12345, new Course("ECE", new DateTime(2016,1,1,0,0), new DateTime(2016,5,5,0,0) ));
		assertEquals(s1.getUsername(), "john1990");
	}

}
