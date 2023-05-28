package com.zayyni.SBAutowiringApp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car{
    @Autowired
    @Qualifier("deEng")
    private IEngine eng;
//    @Autowired
//    public void setEng(IEngine eng) {
//        System.out.println("***Car::Constructor***");
//        this.eng = eng;
//    }

    public void drive(){

        int status = eng.start();
        if (status==0){
            System.out.println("****Journey Started****");
        }

    }
}
