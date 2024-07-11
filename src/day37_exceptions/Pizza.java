package day37_exceptions;

public class Pizza {
    private char size;
    private int numberOfCheeseToppings, numberOfPepperoniToppings;

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public double calcCost() {
        double totalPrice = 0;
        switch (size) {
            case 's':
            case 'S':
                totalPrice = 10 + 2 * (numberOfPepperoniToppings + numberOfCheeseToppings);
                break;
            case 'm':
            case 'M':
                totalPrice = 12 + 2 * (numberOfPepperoniToppings + numberOfCheeseToppings);
                break;
            case 'l':
            case 'L':
                totalPrice = 14 + 2 * (numberOfPepperoniToppings + numberOfCheeseToppings);
                break;
            default:
                System.err.println("Invalid size: " + size);
        }
        return totalPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)){
            System.err.println("Invalid Object " + obj);
            System.exit(1);
        }
        Pizza pizza = (Pizza) obj;
        if (size == pizza.getSize()){
            if (numberOfPepperoniToppings == pizza.numberOfPepperoniToppings){
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPeperoniToppings=" + numberOfPepperoniToppings +
                ", total price = " + calcCost() +
                '}';
    }


}
/*
1. Create a class named Pizza
			variables:
				size (char), numberOfCheeseTopping, numberOfPepperoniTopping

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				calcCost(): returns the total cost of the pizza

			Override toString method to print Pizza object info when the object is passed in the print statement

			Override equals method that returns true if the pizza object is equal to the specified pizza object

 */