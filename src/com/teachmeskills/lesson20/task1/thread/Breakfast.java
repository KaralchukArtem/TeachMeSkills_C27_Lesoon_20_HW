package com.teachmeskills.lesson20.task1.thread;

public class Breakfast extends Thread{
    private String name;

    public Breakfast(String name) {
        this.name = name;
    }
    @Override
    public void run(){
        breakfast();
    }
    private void breakfast(){
        System.out.println("Breakfast - " + name);
    }
}
