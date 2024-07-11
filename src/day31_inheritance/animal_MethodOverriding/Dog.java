package day31_inheritance.animal_MethodOverriding;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("Dog " + getName() + " is eating dog food");
    }

    public void sleep(){
        System.out.println("Dog " + getName() + " sleeps 10 hours in a day");
    }
    
    public void bark(){
        System.out.println("Dog " + getName() + " is barking");
    }
}

