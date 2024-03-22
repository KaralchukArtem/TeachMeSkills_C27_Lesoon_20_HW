package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.consts.Constants;
import com.teachmeskills.lesson20.task2.service.CenterService;

public class GetCar implements Runnable{
    private CenterService service;

    public GetCar(CenterService service) {
        this.service = service;
    }
    @Override
    public void run(){
        getCarToCenter();
    }
    private void getCarToCenter(){
        for (int i = 0; i < Constants.MAX_CAR; i++) {
            service.getCar();
        }
    }
}
