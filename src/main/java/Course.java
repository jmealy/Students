import java.util.ArrayList;
import org.joda.time.DateTime;


public class Course {
	
	static String name;
	ArrayList<Module> modules = new ArrayList<Module>();
	ArrayList<Student> students = new ArrayList<Student>();
	DateTime startDate;
	DateTime endDate;
	
	public Course(String nm, DateTime s, DateTime e){
		name = nm;
		startDate = s;
		endDate = e;
	}
	
	public void addModule(Module m){
		modules.add(m);
	}
	
	public void addStudent(Student s){
		students.add(s);
	}
	
}
