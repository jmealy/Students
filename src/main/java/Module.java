import java.util.ArrayList;


public class Module {
	
	String name;
	String code;
	ArrayList<Student> students;
	
	public Module(String nm, String ident){
		name = nm;
		code = ident;
	}
	
	public void addStudent(Student s){
		students.add(s);
	}
}
