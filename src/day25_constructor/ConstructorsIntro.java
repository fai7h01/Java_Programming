package day25_constructor;

public class ConstructorsIntro {

    public ConstructorsIntro(){
        System.out.println("Object is created by using no argument(default) constructor");
    }
    public ConstructorsIntro(int a) {
        System.out.println("Object is created by using int constructor");
    }

    public void add(){

    }

    public static void main(String[] args) {

        ConstructorsIntro obj1 = new ConstructorsIntro(10);

        ConstructorsIntro obj2 = new ConstructorsIntro();

      //  ConstructorsIntro obj3 = new ConstructorsIntro("Java");


    }


}
