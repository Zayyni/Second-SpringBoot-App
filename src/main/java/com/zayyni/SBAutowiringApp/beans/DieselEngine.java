package com.zayyni.SBAutowiringApp.beans;

import org.springframework.stereotype.Component;

@Component("deEng")
public class DieselEngine implements IEngine{

    public DieselEngine() {
        System.out.println("***DieselEngine::Constructor");
    }

    @Override
    public int start() {
        System.out.println("***Start method executed***");
        //logic
        return 0;
    }
}
