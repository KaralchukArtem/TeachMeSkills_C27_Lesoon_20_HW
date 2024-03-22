package com.teachmeskills.lesson20.task1.runnable;

public class Breakfast  implements Runnable{
    Thread thread;

    public Breakfast() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run(){
        breakfast();
    }

    private void breakfast(){
        System.out.println("Breakfast");
    }
}
