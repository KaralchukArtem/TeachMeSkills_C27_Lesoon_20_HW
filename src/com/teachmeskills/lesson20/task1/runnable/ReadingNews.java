package com.teachmeskills.lesson20.task1.runnable;

public class ReadingNews implements Runnable{
    Thread thread;
    public ReadingNews() {
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run(){
        readingNews();
    }
    private void readingNews(){
        System.out.println("ReadingNews");
    }
}
