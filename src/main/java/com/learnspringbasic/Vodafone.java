package com.learnspringbasic;

public class Vodafone implements Sim {
    @Override
    public void calling() {
        System.out.println("Calling using Vodafone sim");
    }
    @Override
    public void data() {
        System.out.println("Browsing internet using Vodafone sim");
    }
}
