package com.teachmeskills.lesson20.task1.thread;

public class Runner {
    public static void main(String[] args) {
        Breakfast breakfast = new Breakfast("Thread 1");
        breakfast.setPriority(1);
        breakfast.start();
        Coffee coffee = new Coffee("Thread 2");
        coffee.setPriority(2);
        coffee.start();
        ReadingNews readingNews = new ReadingNews("Thread 3");
        readingNews.setPriority(3);
        readingNews.start();
    }
}
