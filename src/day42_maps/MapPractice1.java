package day42_maps;
import java.util.Map;
import java.util.HashMap;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //-------------------------------------------------
        // How many female & male employees are in the map?

        int male = 0, female = 0;

       /* for (String eachKey : employeeMap.keySet()){
            if (employeeMap.get(eachKey).equals("F")){
                female++;
            }else {
                male++;
            }
        }
*/
        for (String eachValue : employeeMap.values()){
            if (eachValue.equals("F")){
                female++;
            }else{
                male++;
            }
        }

        System.out.println("female = " + female);
        System.out.println("male = " + male);

        System.out.println("-------------------------------------------------");
        // display the names of all the female employees

        for (String eachKey : employeeMap.keySet()){
            
            String gender = employeeMap.get(eachKey);

            if (gender.equals("F")){
                System.out.println(eachKey);
            }
        }
        System.out.println("-------------------------------------------------");

        for (Map.Entry<String, String> each : employeeMap.entrySet()) {
            if (each.getValue().equals("F")){
                System.out.println(each.getKey());
            }
        }

        System.out.println("-------------------------------------------------");
        // update all the "M" values with "Male", same as "F"

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else{
                eachEntry.setValue("Female");
            }
        }

        System.out.println(employeeMap);



    }
}
