package Metier;

import java.util.ArrayList;

public class Promotion {

private ArrayList<Student> studentList;


public Promotion() {
	
	studentList= new ArrayList<Student>(); 
}

public int newId() {
	
	
	int  studentcount= studentList.size();
	
	if(studentcount==0) {
		
		return 0;
	}
	
	int largerId = studentList.get(0).getId();
	
	for(int i=1 ; i < studentcount;i++) {
		
		int id = studentList.get(i).getId();
		if(id>largerId) {
			largerId=id;
		}
	}
	return largerId + 1;
}

public int add(String firstName,String LastName ) {
	
	int id= newId();
	studentList.add(new Student(id,firstName,LastName));
	return id;
	
}
}
