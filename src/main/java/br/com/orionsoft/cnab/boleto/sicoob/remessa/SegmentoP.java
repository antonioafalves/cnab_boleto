package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.*;
import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Registro
@Getter
@Setter
public class SegmentoP {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final String banco = "756";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 4)
    private Integer lote;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer registro = 3;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private Integer numeroRegistro;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String segmento = "P";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String cnab1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private CodigoMovimentoRemessa codigoMovimentoRemessa;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private String codigoAgencia;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private String dvAgencia;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 12)
    private String numeroConta;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private String dvConta;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String dv = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 20)
    private String nossoNumero;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private String carteira;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer cadastramento = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String documento = "";
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 1)
    private EmissaoBoleto emissaoBoleto;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private DistribuicaoBoleto distribuicaoBoleto;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 15)
    private String numeroDocumento;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate vencimento;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorTitulo;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private final Integer agenciaCobradora = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String dvAgenciaCobradora = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private EspecieTitulo especieTitulo;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private AceiteTitulo aceiteTitulo;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate dataEmissaoTitulo;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private CodigoJurosMora codigoJurosMora;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate dataJurosMora;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal jurosMora;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private CodigoDesconto codigoDesconto1;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate dataDesconto1;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorDesconto1;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorIOF;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorAbatimento;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 25)
    private String usoEmpresaBeneficiario;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private CodigoProtesto codigoProtesto;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private Integer prazoParaProtesto;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer codigoBaixaDevolucao = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 3)
    private final String prazoBaixaDevolucao = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private final Integer codigoMoeda = 9;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 10)
    private final Integer numeroContrato = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String cnab2 = "";
}
