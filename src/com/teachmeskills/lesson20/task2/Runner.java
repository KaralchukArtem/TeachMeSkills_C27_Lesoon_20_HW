package com.teachmeskills.lesson20.task2;

import com.teachmeskills.lesson20.task2.model.GetCar;
import com.teachmeskills.lesson20.task2.model.PullCar;
import com.teachmeskills.lesson20.task2.service.CenterService;

public class Runner {
    public static void main(String[] args) {
        CenterService service = new CenterService();
        GetCar getCar = new GetCar(service);
        PullCar pullCar = new PullCar(service);

        Thread t1 = new Thread(pullCar);
        t1.start();
        Thread t2 = new Thread(getCar);
        t2.start();

    }
}
