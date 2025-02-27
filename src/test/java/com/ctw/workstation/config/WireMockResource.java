package com.ctw.workstation.config;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.Map;

public class WireMockResource implements QuarkusTestResourceLifecycleManager {

    WireMockServer wireMock;
    WireMockServer wireMockServer;

    @Override
    public Map<String, String> start() {
        //wireMock = new WireMockServer(3000);
        WireMockServer wireMockServer = new WireMockServer(WireMockConfiguration.options().dynamicPort());
        //WireMock.configureFor(wireMockServer);
        wireMock.start();
        WireMock.configureFor( wireMockServer.port());
        WireMock wiremock = new WireMock(wireMockServer.port());


        return Map.of("external-api.url", wireMock.baseUrl());
    }

    @Override
    public void stop() {
        wireMock.stop();

    }
}
