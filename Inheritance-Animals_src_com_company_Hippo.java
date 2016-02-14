package com.company;

/**
 * Created by NathanStone on 11/8/15.
 */
public class Hippo extends Animal {

    public boolean eating(){
        if(true) {
            System.out.println("I do not eat meat give me a salad.");
        }else{
            System.out.println("I am not hungry");


        }
        return eating();
    }
}
