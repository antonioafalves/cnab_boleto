package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.TipoInscricao;
import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Record
@Getter
@Setter
public class HeaderLote {
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final String banco = "756";
    @Field(pattern = Pattern.NUMERIC, size = 4)
    private Integer lote;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final String registro = "1";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String operacao = "R";
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private final String servico = "01";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 2)
    private final String cnab1 = "";
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final String layoutLote = "040";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String cnab2 = "";
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private TipoInscricao tipoInscricaoEmpresa;
    @Field(pattern = Pattern.NUMERIC, size = 15)
    private String numeroInscricaoEmpresa;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 20)
    private final String convenio = "";
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private String codigoAgencia;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private String dvAgencia;
    @Field(pattern = Pattern.NUMERIC, size = 12)
    private String numeroConta;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private String dvConta;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String dv = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 30)
    private String nomeEmpresa;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private final String informacao1 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private final String informacao2 = "";
    @Field(pattern = Pattern.NUMERIC, size = 8)
    private Integer numeroRemessaRetorno;
    @Field(pattern = Pattern.DATE_DDMMAAAA, size = 8)
    private LocalDate dataGravacao;
    @Field(pattern = Pattern.NUMERIC, size = 8)
    private final String dataCredito = "00000000";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 33)
    private final String cnab = "";
}
