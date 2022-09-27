package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Record
@Getter
@Setter
public class TraillerLote {
    @Field(pattern = Pattern.NUMERIC, size =  3)
    private final String banco = "756";
    @Field(pattern = Pattern.NUMERIC, size =  4)
    private Integer lote;
    @Field(pattern = Pattern.NUMERIC, size =  1)
    private final String registro = "5";
    @Field(pattern = Pattern.ALPHANUMERIC, size =  9)
    private final String cnab1 = "";
    @Field(pattern = Pattern.NUMERIC, size =  6)
    private Integer quantidadeRegistro;
    @Field(pattern = Pattern.NUMERIC, size =  6)
    private Integer qtdTituloCobrancaSimples;
    @Field(pattern = Pattern.DECIMAL, size =  15)
    private BigDecimal valorTituloCobrancaSimples;
    @Field(pattern = Pattern.NUMERIC, size =  6)
    private Integer qtdTituloCobrancaVinculada;
    @Field(pattern = Pattern.DECIMAL, size =  15)
    private BigDecimal valorTituloCobrancaVinculada;
    @Field(pattern = Pattern.NUMERIC, size =  6)
    private Integer qtdTituloCobrancaCaucionada;
    @Field(pattern = Pattern.DECIMAL, size =  15)
    private BigDecimal valorTituloCobrancaCaucionada;
    @Field(pattern = Pattern.NUMERIC, size =  6)
    private Integer qtdTituloCobrancaDescontada;
    @Field(pattern = Pattern.DECIMAL, size =  15)
    private BigDecimal valorTituloCobrancaDescontada;
    @Field(pattern = Pattern.ALPHANUMERIC, size =  8)
    private final String numeroAviso = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size =  117)
    private final String cnab2 = "";
}
