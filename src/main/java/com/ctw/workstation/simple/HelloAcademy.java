package com.ctw.workstation.simple;

import com.ctw.workstation.external.ExternalApi;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class HelloAcademy {
    @Inject
    @RestClient
    ExternalApi externalAPi;


    ExternalMessageService externalMessageService;

    public String sayHello(String name) {
        if(name != null) {
            name = name.toUpperCase();
            return externalMessageService.sayHellowFromOuterSpace();
        }else{
            return externalMessageService.sayHellowFromOuterSpace(name);
        }
    }
}
