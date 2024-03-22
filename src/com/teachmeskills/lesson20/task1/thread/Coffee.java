package com.teachmeskills.lesson20.task1.thread;

public class Coffee extends Thread{
    private String name;

    public Coffee(String name) {
        this.name = name;
    }
    @Override
    public void run(){
        coffee();
    }
    private void coffee(){
        System.out.println("Coffee - " + name);
    }
}
