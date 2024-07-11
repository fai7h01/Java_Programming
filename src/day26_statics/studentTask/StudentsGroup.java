package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { // StudentsGroup HAS a Student

    public String groupName;
    public int groupID;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupID) { // creates the studentsGroup object by setting th groupName and groupId
        this.groupName = groupName;
        this.groupID = groupID;
        // students = new ArrayList<>(); // size: 0
    }

    public void addStudent(Student student){ // Takes one student object, and adds it to the arraylist of students
        students.add(student);
    }

    public void addStudent(String name, int age, char gender, String id){
        students.add(new Student(name, age, gender, id));
    }// takes name, age, gender, id, of student info, creates student object by using given info, then adds student object it arraylist of students

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    } // takes one array of student and adds array of students to arraylist of students
    public void removeStudent(String id){
        students.removeIf(p -> p.id.equals(id));
    } // takes the id and then removes the student object with the specified id from arraylist of students


    public String toString() {
        return "StudentsGroup{" +
                "\ngroupName='" + groupName + '\'' +
                "\n, groupID='" + groupID + '\'' +
                "\n, number of students= " + students.size() +
                "}";
    }
}
/*

	2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */