package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 50,
                weeklyHours = 45;
        double stateTaxRate = 6;
        stateTaxRate /= 100;
        double federalTaxRate = 26;
        federalTaxRate /= 100;

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate;
        double federalTax = salaryBeforeTax * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax + "\nFederal tax is: $" + federalTax +
                "\nState tax is: $" + stateTax + "\nTotal tax is: $" + totalTax + "\nNet income is: $" + salaryAfterTax);


    }

}

/*
1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in the above variables to calculate the following:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use the print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as a percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as a percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560


 */