package com.company;
import java.util.*;




public class Animal {
    boolean sleeping;

    public String makeNoise() {
        return "Meow!";
    }

    public boolean sleeping(boolean sleep) {
        if (true) {
            System.out.println("I am Sleeping!");
        } else {
            System.out.println("I am awake!");
        }
        return sleep;
    }

    public boolean eating(boolean k) {
        if (true) {
            System.out.println("I am eating a sheep leave me alone");
        }else if (false) {
            System.out.println("I am not hungry");

        }
            return k;

        } // It only prints the true value.



    public void Animal(String firstName, String lastName) {

        System.out.println("hello my name is " + firstName + " " + lastName);

    }


}
