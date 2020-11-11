package com.serverless;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class ResponderModelTest {
    ResponderModel responder = new ResponderModel();

    @Test
    public void cuandoNoExistePreguntaRetornaElNombreDelEquipo() {
        String question = "";
        String response = responder.answer(question);
        
        assertThat(response).isEqualTo("devco");
    }

    @Test
    public void cuandoPreguntanPorSumar10y5Retorna15() {
        String question = "1234: what is the sum of 10 and 5";
        String response = responder.answer(question);
        
        assertThat(response).isEqualTo("15");
    }
}