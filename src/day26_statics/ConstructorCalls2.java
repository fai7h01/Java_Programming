package day26_statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
       // this(10); // Recursion is not allowed
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a){
        this(); // Calling the default constructor
        //this("A");
        System.out.println("int arg");
    }

    public ConstructorCalls2(String str){
        this(10);
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("-----------------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("-----------------------------------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2("A");


    }

}
