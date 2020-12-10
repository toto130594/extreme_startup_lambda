package com.serverless;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ResponderModelTest {
    @Test
    public void CuandopreguntePorElNombrerespondeEquipo2(){
        ResponderModel responderModel = new ResponderModel();
        //Arrange
        String pregunta = "07a05250: what is your name";
        //Act
        String respuesta = responderModel.answer(pregunta);
        //Assert
        assertThat(respuesta).isEqualTo("Equipo 2");
    }
}
