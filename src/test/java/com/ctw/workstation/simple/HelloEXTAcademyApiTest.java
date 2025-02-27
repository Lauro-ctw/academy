package com.ctw.workstation.simple;


import com.ctw.workstation.config.CTWAcademyTestProfile;
import com.ctw.workstation.config.WireMockResource;
import com.github.tomakehurst.wiremock.client.WireMock;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import jakarta.inject.Inject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static io.quarkus.devui.runtime.build.BuildMetricsDevUIController.get;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@QuarkusTest
@TestProfile(CTWAcademyTestProfile.class)
//@QuarkusTestResource(WireMockResource.class)
public class HelloEXTAcademyApiTest {
    @Inject
    HelloAcademy helloAcademy;

    /*@Test
    @DisplayName("Saying hello to external api")
    void saying_hello_to_External_Api(){
        // given
        stubFor(WireMock.post(urlEqualTo("/hello/external"))
                .willReturn(aResponse()
                .withStatus(200).withHeader("Content-Type", "application/json")
                .withBody(
                        "message: Hello World")));
        //WireMock.get(WireMock.urlEqualTo("/hello")).willReturn(aResponse().withBody("Hello World"));

        String name = "Rennan";
        // When
        String result = helloAcademy.sayHello(name);
        // Then
        assertThat(result)
                .isEqualTo("Hello RENNAN!");
    }*/

}
