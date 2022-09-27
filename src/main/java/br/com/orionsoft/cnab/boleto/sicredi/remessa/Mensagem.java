package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Identifier;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

@Record
@Getter
@Setter
public class Mensagem {
    @Identifier
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer identificacaoRegistro = 2;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 11)
    private final String filler1 = "";
    @Field(pattern = Pattern.NUMERIC, size = 9)
    private String nossoNumero;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 80)
    private String instrucao1;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 80)
    private String instrucao2;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 80)
    private String instrucao3;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 80)
    private String instrucao4;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 10)
    private String seuNumero;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 43)
    private final String filler2 = "";
    @Field(pattern = Pattern.NUMERIC, size = 6)
    private Integer numeroSequencialRegistro;
}
