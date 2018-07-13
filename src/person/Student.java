package person;

import institution.University;
import person.consciousness.Knowledge;

public class Student {
	
	private String name;
	
	private Knowledge knowledge;
	
	private University university;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Knowledge getKnowledge() {
		return knowledge;
	}
	public void setKnowledge(Knowledge knowledge) {
		this.knowledge = knowledge;
	}
	public University getUniversity() {
		return university;
	}
	
	public Student(String name, Knowledge knowledge) {
		
		this.name = name;
		this.knowledge = knowledge;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public Student(String name, int knowledge) {
		
		this.name = name;
		this.knowledge = new Knowledge(knowledge);
	}
	public Student() {}
	

	
    
}
