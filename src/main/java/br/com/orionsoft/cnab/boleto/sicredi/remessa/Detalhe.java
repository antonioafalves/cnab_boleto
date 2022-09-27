package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.boleto.sicredi.tipo.*;
import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Identifier;
import br.com.orionsoft.cnab.core.annotation.Record;
import br.com.orionsoft.cnab.core.annotation.SubRecord;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Record
@Getter
@Setter
public class Detalhe {
    @Identifier
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer identificacaoRegistroDetalhe = 1;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String tipoCobranca = "A";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String tipoCarteira = "A";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private TipoImpressao tipoImpressao;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 12)
    private final String filler1 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String tipoMoeda = "A";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private TipoDescontoJuros tipoDesconto;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private TipoDescontoJuros tipoJuros;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 28)
    private final String filler2 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 9)
    private String nossoNumeroSicredi;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 6)
    private final String filler3 = "";
    @Field(pattern = Pattern.DATE_AAAAMMDD, size = 8)
    private LocalDate dataInstrucao;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private CampoAlterado campoAlterado;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private PostagemTitulo postagemTitulo;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String filler4 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private EmissaoBloqueto emissaoBloqueto;
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private Integer numeroParcelaCarne;
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private Integer numeroTotalParcelasCarne;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 4)
    private final String filler5 = "";
    @Field(pattern = Pattern.DECIMAL, size = 10)
    private BigDecimal valorDescontoDia;
    @Field(pattern = Pattern.DECIMAL, size = 4)
    private Double multaPagamentoAtraso;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 12)
    private final String filler6 = "";
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private Instrucao instrucao;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 10)
    private String seuNumero;
    @Field(pattern = Pattern.DATE_DDMMAA, size = 6)
    private LocalDate dataVencimento;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorTitulo;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 9)
    private final String filler7 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private EspecieDocumento especieDocumento;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private AceiteTitulo aceiteTitulo;
    @Field(pattern = Pattern.DATE_DDMMAA, size = 6)
    private LocalDate dataEmissao;
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private InstrucaoProtesto instrucaoProtestoAutomatico;
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private Integer numeroDiasProtestoAutomatico;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorJurosDiaAtraso;
    @Field(pattern = Pattern.DATE_DDMMAA, size = 6)
    private LocalDate dataLimiteConcessaoDesconto;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorDesconto;
    @Field(pattern = Pattern.NUMERIC, size = 13)
    private final Integer filler8 = 0;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorAbatimento;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private TipoPessoa tipoPessoa;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer filler9 = 0;
    @Field(pattern = Pattern.NUMERIC, size = 14)
    private String cpfCnpjSacado;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private String nomeSacado;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private String enderecoSacado;
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private final Integer codigoSacadoCooperativaCedente = 0; // não cadastrar o sacado
    @Field(pattern = Pattern.NUMERIC, size = 6)
    private final Integer filler10 = 0;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String filler11 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 8)
    private String cepSacado;
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private final Integer codigoSacadoJuntoCliente = 0;
    @Field(pattern = Pattern.NUMERIC, size = 14)
    private Integer cpfCnpjSacadorAvalista;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 41)
    private String nomeSacadorAvalista;
    @Field(pattern = Pattern.NUMERIC, size = 6)
    private Integer numeroSequencialRegistro;

    @SubRecord
    private Mensagem mensagem;
}
