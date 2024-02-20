package org.example;

import javax.sound.midi.SoundbankResource;

public class MethodsDemo {
    public static void main (String [] args){
        MethodsDemo d = new MethodsDemo();
        String name = d.getData();
        System.out.println(name);

        MethodsDemo2 d1 = new MethodsDemo2();
        d1.getUserData();

    }
    public String getData(){
        System.out.println("Hello World");
        return "Vanita Patil";
    }

}
