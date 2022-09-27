package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

@Record
@Getter
@Setter
public class Trailer {
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer identificacaoRegistroTrailer = 9;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer identificacaoArquivoRemessa = 1;
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final Integer numeroSicredi = 748;
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private String codigoCedente;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 384)
    private final String filler = "";
    @Field(pattern = Pattern.NUMERIC, size = 6)
    private Integer numeroSequencialRegistro;
}
