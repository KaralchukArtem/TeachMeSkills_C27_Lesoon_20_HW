package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.consts.Constants;
import com.teachmeskills.lesson20.task2.service.CenterService;

public class PullCar implements Runnable{
    private CenterService service;

    public PullCar(CenterService service) {
        this.service = service;
    }
    @Override
    public void run(){
        pullCarCustomer();
    }
    private void pullCarCustomer(){
        for (int i = 0; i < Constants.MAX_CAR; i++) {
            service.pullCar();
        }
    }
}
