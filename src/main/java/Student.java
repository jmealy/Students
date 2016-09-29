import java.util.Calendar;

import org.joda.time.DateTime;


public class Student {
	
	String name;
	int dob;
	int age;
	int id;
	
	public Student(String nm,int db , int ident){
		name = nm;
		dob = db;
		age = Calendar.getInstance().get(Calendar.YEAR) - dob;
		id = ident;
	}
	
	public static void main(String[] args){
	
		DateTime test = new DateTime();
	}

	
	public String getUsername(){
		String username = name + dob;
		return username;
	}

}
