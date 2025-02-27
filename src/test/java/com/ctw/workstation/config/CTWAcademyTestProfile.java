package com.ctw.workstation.config;

import io.quarkus.test.junit.QuarkusTestProfile;

import java.util.List;

public class CTWAcademyTestProfile implements QuarkusTestProfile {

    @Override
    public List<TestResourceEntry> testResources() {


        return List.of(
                new TestResourceEntry(CTWAcademyResoursce.class),
                new TestResourceEntry(WireMockResource.class)
        );
    }
}
