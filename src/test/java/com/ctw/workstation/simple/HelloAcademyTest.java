package com.ctw.workstation.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@ExtendWith(MockitoExtension.class)
class HelloAcademyTest {

    @Spy
    ExternalMessageService externalMessageService;

    @InjectMocks
    HelloAcademy helloAcademy;

    public static Stream<Arguments> test_hello_academy_with_valid_name() {
        return Stream.of(
                Arguments.of("Hello Academy", "Academy"),
                Arguments.of("Hello test", "test"),
                Arguments.of("Hello Laurindo", "Laurindo"),
                Arguments.of("Hello Academy", "Academy"),
                Arguments.of("Hello ", ""),
                Arguments.of("Hello", null)
        );
    }

    //@Test
    @ParameterizedTest
    //@NullSource
    //@EmptySource
    //@ValueSource(strings = {"Academy", "Laurindo", "test"})
    @MethodSource("test_hello_academy_with_valid_name")
    void test_Hello_Academy_with_valid_name(String name) {
        // given
        //String name = "Academy";
        HelloAcademy helloAcademy = new HelloAcademy();

        // when
        String result = helloAcademy.sayHello(name);

        List<String> nossaLista = List.of("Hello Academy", "Hello test");
        //assertThat(nossaLista);

        //then
        Assertions.assertEquals(result, result, "Matching result saying hello academy");


    }

    void lista(){
        List<String> minhaLista = new ArrayList<>();

        List<String> minhaListaSpy = Mockito.spy(minhaLista);

        Mockito.doReturn("renan").when(minhaListaSpy).get(0);
        assertThat(minhaListaSpy.get(0)).isEqualTo("renan");


    }

    @Test
    @DisplayName("hello from otter space with mock")
    void test_Hello_Academy_from_otter_space_mock() {
        //given
        String name = "academy";
        HelloAcademy helloAcademy = new HelloAcademy();

        // mock config
        ExternalMessageService externalMessageService = Mockito.mock(ExternalMessageService.class);
        helloAcademy.externalMessageService = externalMessageService;

        ExternalMessageService ExternalMessageService;


        Mockito.doReturn("hello World").when(externalMessageService).sayHellowFromOuterSpace();





        ExternalMessageService externalMessageServiceMock = Mockito.mock(ExternalMessageService.class);

        Mockito.when(externalMessageServiceMock.sayHellowFromOuterSpace())
                .thenReturn("Hello from outer space");


        Mockito.when(externalMessageServiceMock.sayHellowFromOuterSpace())
                .thenReturn("Hello from outer space");

        Mockito.when(externalMessageServiceMock.sayHellowFromOuterSpace(Mockito.anyString()))
                .thenReturn("Hello %s from outer space".formatted(name));

        // when
        //String result = hellowAcademy.sayHello(name);


        // then
        //assertThat(result)
                //.isEqualTo("Hello from outer space");
    }



}