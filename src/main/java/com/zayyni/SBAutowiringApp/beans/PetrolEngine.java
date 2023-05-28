package com.zayyni.SBAutowiringApp.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("peEng")
public class PetrolEngine implements IEngine{

    public PetrolEngine() {
        System.out.println("*****PetrolEngine::Constructor******");
    }

    @Override
    public int start() {
        System.out.println("*****PE :: Start() Method executed");
        return 0;
    }

}
