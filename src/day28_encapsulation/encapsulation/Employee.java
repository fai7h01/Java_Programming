package day28_encapsulation.encapsulation;

public class Employee {

    private String name;
    private int age;
    private String jobTitle;
    private double salary;


    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Job title of the employee can not be blank or empty.");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public String getName() {
        if (name == null){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()){
            System.err.println("Employee name can not be empty or blank.");
            System.exit(1);
        }
        for(char each : name.toCharArray()){
            if (!Character.isLetter(each)){
                System.err.println("Employee name can not contain digits or special characters.");
                System.exit(1);
            }
        }
        this.name = name;
    }

    public double getSalary() { // to return instance variable
        return salary;
    }

    public void setSalary(double salary) { // to update instance variable
        if (salary < 0){
            System.err.println("Invalid Salary: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
