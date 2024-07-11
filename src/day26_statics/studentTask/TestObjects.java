package day26_statics.studentTask;

import java.util.Arrays;

public class TestObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Luka",23,'M',"A16");
        Student student2 = new Student("Nina",29,'F',"B19");
        Student student3 = new Student("Yu",24,'M',"C76");
        Student student4 = new Student("Lesley",32,'F',"D44");
        Student student5 = new Student("Zhong",21,'M',"E01");


        Student[] students = {student2,student3,student4,student5};

        StudentsGroup group1 = new StudentsGroup("InterCoders",1);
        group1.addStudent(student1);
        group1.addStudent(students);
        group1.addStudent("Chuck",24,'M',"F23");

        group1.removeStudent("D44");
        group1.removeStudent("B19");

        System.out.println("-------------------------------------");

        Student student6 = new Student("Beatrix",21,'F',"AC12");
        Student student7 = new Student("Steve",22,'M',"GC52");
        Student student8 = new Student("Matt",21,'F',"L77L");
        Student student9 = new Student("Layla",21,'F',"LI12");
        Student student10 = new Student("Lolita",21,'F',"JK90");
        Student student11 = new Student("Julian",21,'F',"CV43");
        Student student12= new Student("Nolan",21,'F',"YG14");
        Student student13= new Student("Yin",21,'F',"LL88");
        Student student14= new Student("Melissa",21,'F',"AS09");
        Student student15= new Student("Xavier",21,'F',"NB12");
        Student student16= new Student("Eudora",21,'F',"KJ56");
        Student student17= new Student("Lilia",21,'F',"IU76");
        Student student18= new Student("Tigreal",21,'F',"GH67");
        Student student19= new Student("Paquito",21,'F',"LK87");
        Student student20= new Student("Alpha",41,'M',"VF34");

        Student[] students2 = {student6,student7,student8,student9,student10};
        Student[] students3 = {student11,student12,student13,student14,student15};
        Student[] students4 = {student16,student17,student18,student19,student20};


        StudentsGroup group2 = new StudentsGroup("Java Turtles",2);
        StudentsGroup group3 = new StudentsGroup("Dreamers",3);
        StudentsGroup group4 = new StudentsGroup("CyberCode",4);

        group2.addStudent(students2);
        group3.addStudent(students3);
        group4.addStudent(students4);


        System.out.println("\t\tGroup 1: ");
        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.id);
        }
        System.out.println("------------------------------------------------------");

        System.out.println("\t\tGroup 2:");
        for (Student each : group2.students) {
            System.out.println(each.name + " : " + each.id);
        }
        System.out.println("------------------------------------------------------");

        System.out.println("\t\tGroup 3:");
        for (Student each : group3.students) {
            System.out.println(each.name + " : " + each.id);
        }
        System.out.println("------------------------------------------------------");

        System.out.println("\t\tGroup 4:");
        for (Student each : group4.students) {
            System.out.println(each.name + " : " + each.id);
        }






    }
}
/*

	3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */