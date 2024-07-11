package day37_exceptions;

import java.util.ArrayList;

public class ErrorExample {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        while(true){
            pizzas.add(new Pizza('L',2,2)); // out of memory error
        }

    }
}
