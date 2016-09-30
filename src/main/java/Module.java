import java.util.ArrayList;


public class Module {
	
	public String name;
	public String code;
	public ArrayList<Student> students = new ArrayList<Student>();
	
	public Module(String nm, String ident){
		name = nm;
		code = ident;
	}
	
	public void addStudent(Student s){
		students.add(s);
		s.addModule(this);
	}
}
