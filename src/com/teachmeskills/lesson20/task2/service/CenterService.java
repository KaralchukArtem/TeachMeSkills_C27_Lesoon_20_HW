package com.teachmeskills.lesson20.task2.service;

import com.teachmeskills.lesson20.task2.consts.Constants;

public class CenterService {

    int countOfCars = 0;

    public synchronized void putCar(){
        while (countOfCars >= Constants.MAX_CAR){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        countOfCars++;
        System.out.println("putCar - " + countOfCars);
        notify();
    }

    public synchronized void takeCar(){
        while (countOfCars < 1){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        countOfCars--;
        System.out.println("takeCar - " + countOfCars);
        notify();
    }

}
