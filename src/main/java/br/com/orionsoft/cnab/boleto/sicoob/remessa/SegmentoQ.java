package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.CodigoMovimentoRemessa;
import br.com.orionsoft.cnab.boleto.sicoob.tipo.TipoInscricao;
import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

@Record
@Getter
@Setter
public class SegmentoQ {
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final String banco = "756";
    @Field(pattern = Pattern.NUMERIC, size = 4)
    private Integer lote;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer registro = 3;
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private Integer numeroRegistro;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String segmento = "Q";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String cnab1 = "";
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private CodigoMovimentoRemessa codigoMovimentoRemessa;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private TipoInscricao tipoInscricaoPagador;
    @Field(pattern = Pattern.NUMERIC, size = 15)
    private String numeroInscricaoPagador;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private String nomePagador;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private String enderecoPagador;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 15)
    private String bairroPagador;
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private String cepPagador;
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private String sufixoCepPagador;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 15)
    private String cidadePagador;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 2)
    private String ufPagador;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private TipoInscricao tipoInscricaoSacadorAvalista;
    @Field(pattern = Pattern.NUMERIC, size = 15)
    private String numeroInscricaoSacadorAvalista;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private String nomeSacadorAvalista;
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final String codigoBancoCorrespondente = "000";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 20)
    private final String nossoNumeroBancoCorrespondente = "000";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 8)
    private final String cnab2 = "";
}
