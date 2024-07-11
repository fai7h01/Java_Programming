package day08_ternaries_switch;


public class FieldTrip {
    public static void main(String[] args) {

        int gradeNumber = 7;
        int numberOfGroups = 0;
        String location = "Unknown";
        String teacher = "Unknown";

        if (gradeNumber > 0 && gradeNumber < 7){

            if (gradeNumber == 1){
                location = "Apple orchard";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            } else if (gradeNumber == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacher = "Mr. Lee";
            } else if (gradeNumber == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacher = "Ms. Wilson";
            } else if (gradeNumber == 4) {
                location = "Movie Theatre";
                numberOfGroups = 2;
                teacher = "Ms. Reyes";
            } else if (gradeNumber == 5) {
                location = "Museum";
                numberOfGroups = 5;
                teacher = "Mr. Watt";
            } else if (gradeNumber == 6) {
                location = "Six Flags";
                numberOfGroups = 8;
                teacher = "Ms. Lela";
            }

        }
        System.out.println("location - " + location);
        System.out.println("numberOfGroups - " + numberOfGroups);
        System.out.println("teacher - " + teacher);

    }
}
/*
	 2. Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	number of groups - 0
			        	teacher in charge - Unknown
 */
