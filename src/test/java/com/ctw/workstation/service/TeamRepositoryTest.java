package com.ctw.workstation.service;

import com.ctw.workstation.config.CTWAcademyTestProfile;
import com.ctw.workstation.dto.TeamRequestDTO;
import com.ctw.workstation.entity.Team;
import io.quarkus.test.junit.QuarkusMock;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
//import static sun.nio.cs.Surrogate.is;

@QuarkusTest
//@QuarkusTestResource(CTWAcademyResoursce.class)
@TestProfile(CTWAcademyTestProfile.class)
class TeamRepositoryTest {

    //@Inject
    //TeamRepository repository;


    TeamRepository teamRepository = new TeamRepository();
    Team team = new Team();




/*
    @Test
    //@Order(1)
    @DisplayName("test to create team_na")
    void test_Create_Team_na() {
        TeamRepository teamRepository = Mockito.mock(TeamRepository.class);
        QuarkusMock.installMockForType(teamRepository, TeamRepository.class);

        Mockito
                .doThrow(new IllegalArgumentException("pode ir nao"))
                .when(teamRepository)
                        .persist(Mockito.any(Team.class));


        TeamDTO dto = new TeamDTO();
        dto.name = "test team";
        Team dummyTeam = new Team();
        dummyTeam.name = dto.name;
        Team createdTeam =teamRepository.createTeam(dummyTeam);

        // when then
        assertThatThrownBy()-> teamRepository.createTeam(createdTeam);


    }

 */

/*
    @Test
    //@Order(1)
    @DisplayName("test to create team")
    void test_Create_Team() {
        TeamRepository teamRepository = Mockito.mock(TeamRepository.class);
        QuarkusMock.installMockForType(teamRepository, TeamRepository.class);
        Mockito.doThrow(new IllegalArgumentException("pode ir nao"))
                .when(teamRepository)
                .persist(Mockito.any(Team.class));


        TeamRequestDTO dto = new TeamRequestDTO();
        dto.name = "test team";
        Team dummyTeam = new Team();
        dummyTeam.name = dto.name;
        Team createdTeam =teamRepository.createTeam(dummyTeam);
        assertThat(createdTeam)
                .as("created team has no nulled fileds")
                .hasNoNullFieldsOrProperties()
                .usingRecursiveComparison()
                .ignoringFields("id")
                .isEqualTo(dto);
        assertThat(createdTeam)
                .isNotNull();

 */
        /*
        TeamDTO dto = new TeamDTO();
        dto.defaultLocation = "test";
        dto.name = "test";
        dto.id = UUID.randomUUID();
        dto.product = "test product";

        Team dummyTeam = new Team();
        dummyTeam.defaultLocation = dto.defaultLocation;
        dummyTeam.name = dto.name;
        dummyTeam.id = dto.id;
        dummyTeam.product = dto.product;
        teamRepository.createTeam2(dummyTeam);

        given().contentType(ContentType.JSON)
                .body(dummyTeam)
                .header("Content-Type", "application/json")
                .when()
                .post("/teams")
                .then();
                //.assertThat( )
                //.body("id", is(notNullValue(UUID.class)));

         */

    }


    /*@Test
    //@Order(2)
    @DisplayName("Fetching all teams")
    void test_to_get_All_Teams() {
        given().when()
                .header("Content-Type", "application/yml")
                .get("/teams")
                .then()
                .statusCode(200);
    }

     */

