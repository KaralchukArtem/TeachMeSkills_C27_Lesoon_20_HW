package com.teachmeskills.lesson20.task1.thread;

public class ReadingNews extends Thread{
    private String name;

    public ReadingNews(String name) {
        this.name = name;
    }
    @Override
    public void run(){
        readingNews();
    }
    private void readingNews(){
        System.out.println("ReadingNews - " + name);
    }

}
