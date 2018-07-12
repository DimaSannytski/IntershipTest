package institution;


import java.util.ArrayList;
import java.util.List;

import person.Student;

public class University {
	
	private String name;
	
	private List<Student> students = new ArrayList<Student>();

	private int  averageKnowledge;
	
			
			
	public int getAverageKnowledge() {
		return averageKnowledge;
	}

	public void setAverageKnowledge() {
		if(!students.isEmpty()) 
		{int sum=0;
		for(Student student:students) {
			sum+=student.getKnowledge().getLevel();
		}
		this.averageKnowledge = sum/students.size();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public University(String name) {
		
		this.name = name;
	}

	


	public University() {}
	
	public void addStudent(Student student) {
		students.add(student);
		student.setUniversity(this);
	}
	
	
//    public University(String name) {
//        //TODO: Implementation is needed
//    }
//
//    public void setStudent(Student student) {
//        //TODO: Implementation is needed
//    }
//
//    public void addStudent(Student student) {
//        //TODO: Implementation is needed
//    }
}
