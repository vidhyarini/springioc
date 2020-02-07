package com.learnspringbasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {
        /*Airtel airtel = new Airtel();
        airtel.calling();
        airtel.data();
        Vodafone vodafone = new Vodafone();
        vodafone.calling();
        vodafone.data();*/ //This repeating the same calling and data for two providers
       /* //So here we use polymorphisum
        //Sim sim = new Airtel(); //Or use the other provider calling and data once
        Sim sim = new Vodafone();
        sim.calling();
        sim.data();*/
       //Spring creates objects for us so use ApplicationContext

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("Config loaded");
    }
}
