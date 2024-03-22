package com.teachmeskills.lesson20.task2;

import com.teachmeskills.lesson20.task2.model.PutCar;
import com.teachmeskills.lesson20.task2.model.TakeCar;
import com.teachmeskills.lesson20.task2.service.CenterService;

public class Runner {
    public static void main(String[] args) {
        CenterService service = new CenterService();
        PutCar getCar = new PutCar(service);
        TakeCar pullCar = new TakeCar(service);

        Thread t1 = new Thread(pullCar);
        t1.start();
        Thread t2 = new Thread(getCar);
        t2.start();

    }
}
