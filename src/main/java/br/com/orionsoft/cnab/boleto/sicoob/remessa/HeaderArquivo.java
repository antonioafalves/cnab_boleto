package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.TipoInscricao;
import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Record
@Getter
@Setter
public class HeaderArquivo {
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final String banco = "756";
    @Field(pattern = Pattern.NUMERIC, size = 4)
    private final String lote = "0000";
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final String registro = "0";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 9)
    private final String cnab1 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private TipoInscricao tipoInscricaoEmpresa;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 14)
    private String numeroInscricaoEmpresa;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 20)
    private final String convenio = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 5)
    private String codigoAgencia;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private String dvAgencia;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 12)
    private String numeroConta;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private String dvConta;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String dvAgenciaConta = "0";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 30)
    private String nomeEmpresa;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 30)
    private final String nomeBanco = "SICOOB";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 10)
    private final String cnab2 = "";
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final String codigoArquivo = "1";
    @Field(pattern = Pattern.DATE_DDMMAAAA, size = 8)
    private LocalDate dataGeracaoArquivo;
    @Field(pattern = Pattern.TIME)
    private LocalTime horaGeracaoArquivo;
    @Field(pattern = Pattern.NUMERIC, size = 6)
    private Integer sequencialArquivo;
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final String layoutArquivo = "081";
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private final String densidade = "00000";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 20)
    private final String reservadoBanco = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 20)
    private final String reservadoEmpresa = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 29)
    private final String cnab3 = "";
}
