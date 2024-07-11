package day26_statics;

public class TestIPhoneObjects {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("IPhone 15", "Black", 899);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        System.out.println(iPhone.brand);
        System.out.println(iPhone.OS); // should be called from Class because its static
        iPhone.printOperatingSystem();

        System.out.println(IPhone.brand);
        System.out.println(IPhone.OS);
        IPhone.printOperatingSystem();



    }
}
