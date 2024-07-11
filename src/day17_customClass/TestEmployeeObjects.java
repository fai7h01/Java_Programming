package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Luka",23,'M',"Java developer",101350,"A1010");
        employee1.work();

        Employee employee2 = new Employee();
        employee2.setInfo("Beatrix",30,'F',"Cyber security analyst", 81790,"12C32F");

        Employee employee3 = new Employee();
        employee3.setInfo("Nick",21,'F',"Front-end developer",65000,"43DRE11");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee2.work();
        employee3.work();


    }

}
