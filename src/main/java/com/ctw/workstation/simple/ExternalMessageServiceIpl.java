package com.ctw.workstation.simple;

import io.quarkus.logging.Log;

public class ExternalMessageServiceIpl implements ExternalMessageService {


    @Override
    public String sayHellowFromOuterSpace(String name) {
        return "Hello from outter space " + name;
    }

    @Override
    public String sayHellowFromOuterSpace(){
        Log.info("Hello from outter space");
        return "Hello from outter space";
    }
}
