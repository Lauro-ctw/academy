package com.ctw.workstation.config;

import io.quarkus.logging.Log;
import io.quarkus.runtime.Quarkus;
import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.Map;

public class CTWAcademyResoursce implements QuarkusTestResourceLifecycleManager {
    @Override
    public Map<String, String> start() {
        Log.info("Starting CTW Academy Resoursce");
        return Map.of("quarkus.log.console.json", "true");
    }

    @Override
    public void stop() {
        Log.info("Stopping CTW Academy Resoursce");
    }
}
