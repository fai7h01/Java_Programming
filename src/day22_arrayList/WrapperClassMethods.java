package day22_arrayList;


public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";
        System.out.println(str + 1);

       // Integer n1 = Integer.parseInt(str); // unboxing
        int num = Integer.parseInt(str);
        System.out.println(num + 1);

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("-------------------------------------");

        String s = "20.5";
        double num3 = Double.parseDouble(s);
        Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("-------------------------------------");

        String x = "true";
        boolean x1 = Boolean.parseBoolean(x);
        Boolean x2 = Boolean.valueOf(x);

        System.out.println(x1);
        System.out.println(x2);

        System.out.println("-------------------------------------");

        char ch = '$';
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isLower = Character.isLowerCase(ch);
        boolean isUpper = Character.isUpperCase(ch);
        boolean isSpecial = !Character.isLetterOrDigit(ch); // special character

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLower = " +  isLower);
        System.out.println("isUpper = " + isUpper);
        System.out.println("isSpecial = " + isSpecial);

        System.out.println("-------------------------------------");

        String string = "a1b2c3d4e5";
        int sum = 0;

        for (char each : string.toCharArray()){
            if (Character.isDigit(each)){
                sum+= Integer.parseInt(each+"");
            }
        }
        System.out.println(sum);

    }
}
