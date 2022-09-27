package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Record
@Getter
@Setter
public class Header {
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer identificacaoRegistro = 0;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer identificacaoArquivoRemessa = 1;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 7)
    private final String literalRemessa = "REMESSA";
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private final Integer codigoServicoCobranca = 1;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 15)
    private final String literalCobranca = "COBRANCA";
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private String codigoCedente;
    @Field(pattern = Pattern.NUMERIC, size = 14)
    private String cnpj;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 31)
    private final String filler1 = "";
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final Integer numeroSicredi = 748;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 15)
    private final String literalSicredi = "SICREDI";
    @Field(pattern = Pattern.DATE_AAAAMMDD, size = 8)
    private LocalDate dataGravacaoArquivo;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 8)
    private final String filler2 = "";
    @Field(pattern = Pattern.NUMERIC, size = 7)
    private Integer numeroRemessa;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 273)
    private final String filler3 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 4)
    private final String versaoSistema = "2.00";
    @Field(pattern = Pattern.NUMERIC, size = 6)
    private Integer numeroSequencialRegistro;
}
