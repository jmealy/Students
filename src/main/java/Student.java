import java.util.ArrayList;
import java.util.Calendar;

import org.joda.time.DateTime;


public class Student {
	
	String name;
	int dob;
	int age;
	int id;
	ArrayList<Module> modules = new ArrayList<Module>();
	Course course;
	
	public Student(String nm,int db , int ident, Course crs){
		name = nm;
		dob = db;
		age = Calendar.getInstance().get(Calendar.YEAR) - dob;
		id = ident;
		course = crs;
		course.addStudent(this);
	}
	
	public static void main(String[] args){
	
		DateTime test = new DateTime();
	}

	
	public String getUsername(){
		String username = name + dob;
		return username;
	}
	
	public void addModule(Module m){
		modules.add(m);
	}

}
