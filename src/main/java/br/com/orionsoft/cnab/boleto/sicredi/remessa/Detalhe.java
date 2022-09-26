package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.boleto.sicredi.tipo.*;
import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Identificador;
import br.com.orionsoft.cnab.core.annotation.Registro;
import br.com.orionsoft.cnab.core.annotation.SubRegistro;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Registro
@Getter
@Setter
public class Detalhe {
    @Identificador
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer identificacaoRegistroDetalhe = 1;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String tipoCobranca = "A";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String tipoCarteira = "A";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private TipoImpressao tipoImpressao;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 12)
    private final String filler1 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String tipoMoeda = "A";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private TipoDescontoJuros tipoDesconto;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private TipoDescontoJuros tipoJuros;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 28)
    private final String filler2 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 9)
    private String nossoNumeroSicredi;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 6)
    private final String filler3 = "";
    @Campo(formato = FormatoCampo.DATA_AAAAMMDD, tamanho = 8)
    private LocalDate dataInstrucao;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private CampoAlterado campoAlterado;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private PostagemTitulo postagemTitulo;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String filler4 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private EmissaoBloqueto emissaoBloqueto;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private Integer numeroParcelaCarne;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private Integer numeroTotalParcelasCarne;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 4)
    private final String filler5 = "";
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 10)
    private BigDecimal valorDescontoDia;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 4)
    private Double multaPagamentoAtraso;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 12)
    private final String filler6 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private Instrucao instrucao;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 10)
    private String seuNumero;
    @Campo(formato = FormatoCampo.DATA_DDMMAA, tamanho = 6)
    private LocalDate dataVencimento;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorTitulo;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 9)
    private final String filler7 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private EspecieDocumento especieDocumento;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private AceiteTitulo aceiteTitulo;
    @Campo(formato = FormatoCampo.DATA_DDMMAA, tamanho = 6)
    private LocalDate dataEmissao;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private InstrucaoProtesto instrucaoProtestoAutomatico;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private Integer numeroDiasProtestoAutomatico;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorJurosDiaAtraso;
    @Campo(formato = FormatoCampo.DATA_DDMMAA, tamanho = 6)
    private LocalDate dataLimiteConcessaoDesconto;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorDesconto;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 13)
    private final Integer filler8 = 0;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorAbatimento;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private TipoPessoa tipoPessoa;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer filler9 = 0;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 14)
    private String cpfCnpjSacado;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String nomeSacado;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String enderecoSacado;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private final Integer codigoSacadoCooperativaCedente = 0; // não cadastrar o sacado
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private final Integer filler10 = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String filler11 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 8)
    private String cepSacado;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private final Integer codigoSacadoJuntoCliente = 0;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 14)
    private Integer cpfCnpjSacadorAvalista;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 41)
    private String nomeSacadorAvalista;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private Integer numeroSequencialRegistro;

    @SubRegistro
    private Mensagem mensagem;
}
