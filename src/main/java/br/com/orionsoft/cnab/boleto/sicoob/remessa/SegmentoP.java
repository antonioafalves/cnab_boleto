package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.*;
import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Record
@Getter
@Setter
public class SegmentoP {
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final String banco = "756";
    @Field(pattern = Pattern.NUMERIC, size = 4)
    private Integer lote;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final String registro = "3";
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private Integer numeroRegistro;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String segmento = "P";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String cnab1 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 2)
    private CodigoMovimentoRemessa codigoMovimentoRemessa;
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
    @Field(pattern = Pattern.ALPHANUMERIC, size = 20)
    private String nossoNumero;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private String carteira;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final String cadastramento = "0";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String documento = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private EmissaoBoleto emissaoBoleto;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private DistribuicaoBoleto distribuicaoBoleto;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 15)
    private String numeroDocumento;
    @Field(pattern = Pattern.DATE_DDMMAAAA, size = 8)
    private LocalDate vencimento;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorTitulo;
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private final String agenciaCobradora = "00000";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String dvAgenciaCobradora = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 2)
    private EspecieTitulo especieTitulo;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private AceiteTitulo aceiteTitulo;
    @Field(pattern = Pattern.DATE_DDMMAAAA, size = 8)
    private LocalDate dataEmissaoTitulo;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private CodigoJurosMora codigoJurosMora;
    @Field(pattern = Pattern.DATE_DDMMAAAA, size = 8)
    private LocalDate dataJurosMora;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal jurosMora;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private CodigoDesconto codigoDesconto1;
    @Field(pattern = Pattern.DATE_DDMMAAAA, size = 8)
    private LocalDate dataDesconto1;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorDesconto1;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorIOF;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorAbatimento;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 25)
    private String usoEmpresaBeneficiario;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private CodigoProtesto codigoProtesto;
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private Integer prazoParaProtesto;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final String codigoBaixaDevolucao = "0";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 3)
    private final String prazoBaixaDevolucao = "";
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private final String codigoMoeda = "09";
    @Field(pattern = Pattern.NUMERIC, size = 10)
    private final String numeroContrato = "0000000000";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String cnab2 = "";
}
