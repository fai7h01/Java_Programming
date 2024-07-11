package day26_statics;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee obj1 = new Employee("Luka");
        System.out.println(obj1);

        Employee obj2 = new Employee("Tatuli",'F');
        System.out.println(obj2);

        Employee obj3 = new Employee("Sesili",'F',"Doctor");
        System.out.println(obj3);

        Employee obj4 = new Employee("Luka",'M',"Java Developer",75000);
        System.out.println(obj4);

        Employee obj5 = new Employee("Steve","Driver");
        System.out.println(obj5);

        Employee obj6 = new Employee("Lolita","Chef",85000);
        System.out.println(obj6);

    }
}
