package com.serverless;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ResponderModelTest {
    @Test
    public void CuandopreguntePorElNombrerespondeEquipo2(){
        ResponderModel responderModel = new ResponderModel();
        //Arrange
        String pregunta = "dae244e0: which of the following numbers is the largest: 522, 38";
        //Act
        String respuesta = responderModel.answer(pregunta);
        //Assert
        assertThat(respuesta).isEqualTo("522");
    }
}
