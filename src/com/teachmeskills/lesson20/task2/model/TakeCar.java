package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.consts.Constants;
import com.teachmeskills.lesson20.task2.service.CenterService;

public class TakeCar implements Runnable{
    private CenterService service;

    public TakeCar(CenterService service) {
        this.service = service;
    }
    @Override
    public void run(){
        takeCarCustomer();
    }
    private void takeCarCustomer(){
        for (int i = 0; i < Constants.MAX_CAR; i++) {
            service.takeCar();
        }
    }
}
