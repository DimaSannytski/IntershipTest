package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 88));
        university.addStudent(new Student("Julia Veselkina", 74));
        university.addStudent(new Student("Maria Perechrest",51));
        university.setAverageKnowledge();

        
        Internship internship = new Internship("Interlink");
        internship.setStudents(university.getStudents());
        System.out.println("List of internship's students:");
        System.out.println(internship.getStringStudents());

    }
}
