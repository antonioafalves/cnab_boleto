package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

@Record
@Getter
@Setter
public class TraillerArquivo {
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final String banco = "756";
    @Field(pattern = Pattern.NUMERIC, size = 4)
    private final String lote = "9999";
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final String registro = "9";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 9)
    private final String cnab1 = "";
    @Field(pattern = Pattern.NUMERIC, size = 6)
    private Integer quantidadeLotes;
    @Field(pattern = Pattern.NUMERIC, size = 6)
    private Integer quantidadeRegistros;
    @Field(pattern = Pattern.NUMERIC, size = 6)
    private Integer quantidadeContas;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 205)
    private final String cnab2 = "";
}
