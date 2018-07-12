package institution.interlink;

import java.util.ArrayList;
import java.util.List;

import person.Student;

public class Internship {
	
	private String name;
	
	private List<Student> studentsInter = new  ArrayList<Student>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return studentsInter;
	}

	public void setStudents(List<Student> students) {
		List<Student> studentForInter = new ArrayList<Student>();
		for (Student student : students) {
			if(student.getKnowledge().getLevel()>=student.getUniversity().getAverageKnowledge()) {
				studentForInter.add(student);
			}
		}
		this.studentsInter = studentForInter;
	}

	public Internship(String name) {

		this.name = name;
	}
	
	
	
//    public Internship(String name) {
//        //TODO: Implementation is needed
//    }
//
//    public void setStudent(Student student) {
//        //TODO: Implementation is needed
//    }
//
//    public String getStudents() {
//        //TODO: Implementation is needed
//        return "Andrew Maslenko\nJulia Veselkina\n";
//    }
}
