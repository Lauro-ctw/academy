package com.ctw.workstation.simple;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MathOperationsTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        //.info("setting up testes");
        MathOperations mathOperations = new MathOperations();
    }



    @Test
    @Order(1)
    @DisplayName("test if sum funcionality works properly")
    void add() {
        MathOperations mathOperations = new MathOperations();
        Assertions.assertAll(
                () -> assertEquals(5, mathOperations.add(2, 3)),
                () -> assertEquals(5, mathOperations.add(2, 3)),
                () -> assertEquals(5, mathOperations.add(2, 3))
        );
    }

    @Test
    @Order(2)
    void divide_per_zero() {
        // given
        MathOperations mathOperations = new MathOperations();
        int divided = 1;
        int divisor = 0;

        Assertions.assertThrows(ArithmeticException.class, () -> mathOperations.divide(divided, divisor));
    }

    //@AfterAll
}