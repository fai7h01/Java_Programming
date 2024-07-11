package utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysUtility {

    // Methods to merge two arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    // Methods to reverse array
    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = array.length - 1, k = 0; i >= 0; i--) {
            reverse[k++] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];
        for (int i = array.length - 1, k = 0; i >= 0; i--) {
            reverse[k++] = array[i];
        }
        return reverse;
    }

    public static char[] reverse(char[] array) {
        char[] reverse = new char[array.length];
        for (int i = array.length - 1, k = 0; i >= 0; i--) {
            reverse[k++] = array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        for (int i = array.length - 1, k = 0; i >= 0; i--) {
            reverse[k++] = array[i];
        }
        return reverse;
    }


    public static int[] addElement(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static double[] addElement(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static String[] addElement(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static char[] addElement(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static boolean contains(int[] array, int element) {
        for (int each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] array, double element) {
        for (double each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element) {
        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char element) {
        for (char each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }


    public static int[] removeElement(int[] array, int index) {
        int[] new_array = new int[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                new_array[k++] = array[i];
            }
        }
        return new_array;
    }

    public static double[] removeElement(double[] array, int index) {
        double[] new_array = new double[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                new_array[k++] = array[i];
            }
        }
        return new_array;
    }

    public static String[] removeElement(String[] array, int index) {
        String[] new_array = new String[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                new_array[k++] = array[i];
            }
        }
        return new_array;
    }

    public static char[] removeElement(char[] array, int index) {
        char[] new_array = new char[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                new_array[k++] = array[i];
            }
        }
        return new_array;
    }

    public static int[] removeDup(int[] array) {
        int countUnique = 0;
        for (int each : array) {
            int count = 0;
            for (int each1 : array) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1) {
                countUnique++; // counts unique elements to set size for new array
            }
        }
        int[] new_array = new int[countUnique];
        int k = 0;
        for (int each : array) {
            int count = 0;
            for (int each1 : array) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1){
                new_array[k++] = each;
            }
        }
        return new_array;

    }


    public static int[] removeDuplicates(int[] array){
        Set<Integer> unique = new HashSet<>();
        Arrays.stream(array).forEach(unique::add);
        int[] result = new int[unique.size()];
        int i = 0;
        for (Integer num : unique) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{3,1,6,3,4,1,7,2,1,5})));
    }

}
