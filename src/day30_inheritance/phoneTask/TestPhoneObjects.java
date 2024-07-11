package day30_inheritance.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("iPhone 15","Large","Black",1000.5);

        Samsung samsung = new Samsung("Galaxy S22", "Medium","White",899);

        Nokia nokia = new Nokia("Brick","Small","Pink", 50);

        iphone.call(599917499);
        samsung.call(599917499);
        nokia.call(911);

        iphone.text(123456569);
        samsung.text(123456789);
        nokia.text(123456778);

        System.out.println("---------------------------------------------------------");

        iphone.faceTime(123456567);
       // samsung.facetime(12345678);
       // nokia.facetime(12345678);

        samsung.freeze();
        //iphone.freeze();
        //nokia.freeze();


    }
}
