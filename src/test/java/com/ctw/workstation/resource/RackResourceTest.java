package com.ctw.workstation.resource;

import com.ctw.workstation.Status;
//import com.ctw.workstation.dto.RackDTO;
import com.ctw.workstation.entity.Rack;
import com.ctw.workstation.service.RackRepository;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;

import java.time.LocalDate;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class RackResourceTest {

    //static RackResource rackResource;

    //@BeforeAll
    //static void setUp() {
        //rackResource = new RackResource();
    //}


    @Test
    @DisplayName("Testing the method to get all racks")
    void testGetAllRacks() {
        /*given()
                .when().header("Content-Type", "application/json")
                .get("/racks")
                .then()
                .assertThat()
                .statusCode(200);*/
        given()
                .when().get("/racks")
                .then()
                .statusCode(200);
    }

    @Test
    @DisplayName("Test method to create rack")
    public void testCreateRack() {
        String  serialNumber = "r_" + UUID.randomUUID().toString();
        String rackJson = "{"
                + "\"serialNumber\":\"" + serialNumber + "\","
                + "\"createdAt\":\"" + LocalDate.now().toString() + "\","
                + "\"modifiedAt\":\"" + LocalDate.now().toString() + "\","
                + "\"status\":\"" + Status.ACTIVE.toString() + "\","
                + "\"defaultLocation\":\"Test Location\""
                //+ "\"teamId\":\"" + UUID.randomUUID().toString() + "\","
                + "}";
        String id = given()
                .contentType(ContentType.JSON)
                .body(rackJson)
                .when()
                .post("/racks")
                .then()
                .statusCode(201)
                .extract().path("id");

        given()
        .when().get("/racks/" + id)
                .then()
                .statusCode(200)
                .body("serialNumber", is(serialNumber));
    }
/*
    @Test
    void createRack() {
        // given
        RackResource rackResource = new RackResource();
        RackDTO rackDTO = new RackDTO();
        rackDTO.id = UUID.randomUUID();
        rackDTO.defaultLocation = "<UNK>";
        rackDTO.status = Status.ACTIVE;
        rackDTO.serialNumber = "123";

        Rack dummyRack = new Rack();
        dummyRack.id = UUID.randomUUID();
        dummyRack.defaultLocation = rackDTO.defaultLocation;
        dummyRack.status = rackDTO.status;
        dummyRack.serialNumber = rackDTO.serialNumber;
        // when

        Response response = rackResource.createRack(rackDTO);
        //Rack rack = rackResource.createRack(new RackDTO());

        // then
        assertEquals(201, response.getStatus());
    }

 */
}