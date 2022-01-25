package one.digitalinnovation.ecossistemaEDocumentacaoJava.entendendo_metodos.criacao;

import java.time.LocalDateTime;

public class Horario {

    public static String saudar(LocalDateTime localDateTime) {
        int hora = localDateTime.getHour();
        String msg = "";
        if (hora < 12) {
            msg = "Bom Dia";
        } else if (hora < 18) {
            msg = "Boa Tarde";
        } else if (hora < 24 ) {
            msg = "Boa Noite";
        } else if ( hora < 4 || hora == 24){
            msg = "Boa madrugada";
        }
        return msg;
    }
}
