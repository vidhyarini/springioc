package com.learnspringbasic;

public class Airtel implements Sim {
    //not needed for now
    /*public Airtel() {
        System.out.println("Airtel constructor called");
    }*/

    @Override
    public void calling() {
        System.out.println("Calling using Airtel sim");
    }
    @Override
    public void data() {
        System.out.println("Browsing internet using Airtel sim");
    }
}
