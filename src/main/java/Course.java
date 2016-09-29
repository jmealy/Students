import java.util.ArrayList;
import org.joda.time.DateTime;


public class Course {
	
	static String name;
	ArrayList<Module> modules;
	DateTime startDate;
	DateTime endDate;
	
	public Course(String nm, DateTime s, DateTime e){
		name = nm;
		startDate = s;
		endDate = e;
	}
	
	public static void main(String args[]){
		Course c1 = new Course("ECE", new DateTime(2016,1,1,0,0), new DateTime(2016,5,5,0,0) );
		Student s1 = new Student(name, 0, 0);
	}

	
	
}
