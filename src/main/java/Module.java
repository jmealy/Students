import java.util.ArrayList;


public class Module {
	
	String name;
	int id;
	ArrayList<Student> students;
	
	public Module(String nm, int ident){
		name = nm;
		id = ident;
	}
	
	public void addStudent(Student s){
		students.add(s);
	}
}
