package com.ctw.workstation.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class RackRepositoryTest {

    RackRepository rackRepository = new RackRepository();

    @Test
    @DisplayName("fetching all Racks")
    public void test_get_all_Racks() {

        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/racks")
                .then().statusCode(200);
    }
}