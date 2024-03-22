package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.consts.Constants;
import com.teachmeskills.lesson20.task2.service.CenterService;

public class PutCar implements Runnable{
    private CenterService service;

    public PutCar(CenterService service) {
        this.service = service;
    }
    @Override
    public void run(){
        putCarToCenter();
    }
    private void putCarToCenter(){
        for (int i = 0; i < Constants.MAX_CAR; i++) {
            service.putCar();
        }
    }
}
