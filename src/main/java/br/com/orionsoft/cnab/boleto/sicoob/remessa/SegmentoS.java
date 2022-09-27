package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.CodigoMovimentoRemessa;
import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

@Record
@Getter
@Setter
public class SegmentoS {
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final String banco = "756";
    @Field(pattern = Pattern.NUMERIC, size = 4)
    private Integer lote;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer registro = 3;
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private Integer numeroRegistro;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String segmento = "S";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String cnab1 = "";
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private CodigoMovimentoRemessa codigoMovimentoRemessa;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer tipoImpressao = 3;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private String informacao5;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private String informacao6;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private String informacao7;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private String informacao8;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private String informacao9;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 22)
    private final String cnab2 = "";
}
