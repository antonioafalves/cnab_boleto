package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Identificador;
import br.com.orionsoft.cnab.core.annotation.Registro;
import br.com.orionsoft.cnab.core.annotation.SubRegistro;

import java.math.BigDecimal;
import java.util.Calendar;

@Registro
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
    private Calendar dataInstrucao;
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
    private Calendar dataVencimento;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorTitulo;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 9)
    private final String filler7 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private EspecieDocumento especieDocumento;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private AceiteTitulo aceiteTitulo;
    @Campo(formato = FormatoCampo.DATA_DDMMAA, tamanho = 6)
    private Calendar dataEmissao;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private InstrucaoProtesto instrucaoProtestoAutomatico;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private Integer numeroDiasProtestoAutomatico;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorJurosDiaAtraso;
    @Campo(formato = FormatoCampo.DATA_DDMMAA, tamanho = 6)
    private Calendar dataLimiteConcessaoDesconto;
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
    
    public enum TipoImpressao {
        NORMAL("A"),
        CARNE("B");
        
        private final String value;

        private TipoImpressao(String value) {
            this.value = value;
        }
    }
    
    public enum TipoDescontoJuros {
        VALOR("A"),
        PERCENTUAL("B");
        
        private final String value;
        
        private TipoDescontoJuros(String value) {
            this.value = value;
        }
    }
    
    public enum PostagemTitulo {
        SIM("S"),
        NAO("N");
        
        private final String value;

        private PostagemTitulo(String value) {
            this.value = value;
        }
    }
    
    public enum EmissaoBloqueto {
        SICREDI("A"),
        CEDENTE("B");
        
        private final String value;

        private EmissaoBloqueto(String value) {
            this.value = value;
        }
    }
    
    public enum Instrucao {
        CADASTRO_TITULO(1, 2, 3),
        PEDIDO_BAIXA(2, 9, 27),
        CONCESSAO_ABATIMENTO(4, 12, 32),
        CANCELAMENTO_ABATIMENTO_CONCEDIDO(5, 13, 32),
        ALTERACAO_VENCIMENTO(6, 14, 32),
        PEDIDO_PROTESTO(9, 19, 32),
        SUSTAR_PROTESTO_BAIXAR_TITULO(18, 20, 32),
        SUSTAR_PROTESTO_MANTER_CARTEIRA(19, 20, 32),
        ALTERACAO_OUTROS_DADOS(31, 33, 30);
        
        private final Integer instrucao;
        private final Integer confirmacao;
        private final Integer rejeicao;

        private Instrucao(Integer instrucao, Integer confirmacao, Integer rejeicao) {
            this.instrucao = instrucao;
            this.confirmacao = confirmacao;
            this.rejeicao = rejeicao;
        }
    }
    
    public enum TipoPessoa {
        PESSOA_FISICA(1),
        PESSOA_JURIDICA(2);
        
        private final Integer value;

        private TipoPessoa(Integer value) {
            this.value = value;
        }
    }
    
    public enum CampoAlterado {
        NENHUM(" "),
        DESCONTO("A"),
        JUROS_DIA("B"),
        DESCONTO_DIA_ANTECIPACAO("C"),
        DATA_LIMITE_CONCESSAO_DESCONTO("D"),
        CANCELAMENTO_PROTESTO_AUTOMATICO("E"),
        CARTEIRA_COBRANCA("F");
        
        private final String value;

        private CampoAlterado(String value) {
            this.value = value;
        }
    }
    
    public enum AceiteTitulo {
        SIM("S"),
        NAO("N");
        
        private final String value;

        private AceiteTitulo(String value) {
            this.value = value;
        }
    }
    
    public enum InstrucaoProtesto {
        NAO_PROTESTAR("00"),
        PROTESTAR_AUTO("06");
        
        private final String value;

        private InstrucaoProtesto(String value) {
            this.value = value;
        }
    }
    
    public enum EspecieDocumento {
        DUPLICATA_MERCANTIL_INDICACAO("A"),
        DUPLICATA_RURAL("B"),
        NOTA_PROMISSORIA("C"),
        NOTA_PROMISSORIA_RURAL("D"),
        NOTA_SEGUROS("E"),
        RECIBO("G"),
        LETRA_CAMBIO("H"),
        NOTA_DEBITO("I"),
        DUPLICATA_SERVICO_INDICACAO("J"),
        OUTROS("K");
        
        private final String value;

        private EspecieDocumento(String value) {
            this.value = value;
        }
    }

    public void setTipoImpressao(TipoImpressao tipoImpressao) {
        this.tipoImpressao = tipoImpressao;
    }

    public void setTipoDesconto(TipoDescontoJuros tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public void setTipoJuros(TipoDescontoJuros tipoJuros) {
        this.tipoJuros = tipoJuros;
    }

    public void setNossoNumeroSicredi(String nossoNumeroSicredi) {
        this.nossoNumeroSicredi = nossoNumeroSicredi;
    }

    public void setDataInstrucao(Calendar dataInstrucao) {
        this.dataInstrucao = dataInstrucao;
    }

    public void setPostagemTitulo(PostagemTitulo postagemTitulo) {
        this.postagemTitulo = postagemTitulo;
    }

    public void setEmissaoBloqueto(EmissaoBloqueto emissaoBloqueto) {
        this.emissaoBloqueto = emissaoBloqueto;
    }

    public void setNumeroParcelaCarne(Integer numeroParcelaCarne) {
        this.numeroParcelaCarne = numeroParcelaCarne;
    }

    public void setNumeroTotalParcelasCarne(Integer numeroTotalParcelasCarne) {
        this.numeroTotalParcelasCarne = numeroTotalParcelasCarne;
    }

    public void setValorDescontoDia(BigDecimal valorDescontoDia) {
        this.valorDescontoDia = valorDescontoDia;
    }

    public void setMultaPagamentoAtraso(Double multaPagamentoAtraso) {
        this.multaPagamentoAtraso = multaPagamentoAtraso;
    }

    public void setInstrucao(Instrucao instrucao) {
        this.instrucao = instrucao;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setValorTitulo(BigDecimal valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    public void setEspecieDocumento(EspecieDocumento especieDocumento) {
        this.especieDocumento = especieDocumento;
    }

    public void setAceiteTitulo(AceiteTitulo aceiteTitulo) {
        this.aceiteTitulo = aceiteTitulo;
    }

    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void setInstrucaoProtestoAutomatico(InstrucaoProtesto instrucaoProtestoAutomatico) {
        this.instrucaoProtestoAutomatico = instrucaoProtestoAutomatico;
    }

    public void setNumeroDiasProtestoAutomatico(Integer numeroDiasProtestoAutomatico) {
        this.numeroDiasProtestoAutomatico = numeroDiasProtestoAutomatico;
    }

    public void setValorJurosDiaAtraso(BigDecimal valorJurosDiaAtraso) {
        this.valorJurosDiaAtraso = valorJurosDiaAtraso;
    }

    public void setDataLimiteConcessaoDesconto(Calendar dataLimiteConcessaoDesconto) {
        this.dataLimiteConcessaoDesconto = dataLimiteConcessaoDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setValorAbatimento(BigDecimal valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public void setCpfCnpjSacado(String cpfCnpjSacado) {
        this.cpfCnpjSacado = cpfCnpjSacado;
    }

    public void setNomeSacado(String nomeSacado) {
        this.nomeSacado = nomeSacado;
    }

    public void setEnderecoSacado(String enderecoSacado) {
        this.enderecoSacado = enderecoSacado;
    }

    public void setCepSacado(String cepSacado) {
        this.cepSacado = cepSacado;
    }

    public void setCpfCnpjSacadorAvalista(Integer cpfCnpjSacadorAvalista) {
        this.cpfCnpjSacadorAvalista = cpfCnpjSacadorAvalista;
    }

    public void setNomeSacadorAvalista(String nomeSacadorAvalista) {
        this.nomeSacadorAvalista = nomeSacadorAvalista;
    }

    public void setNumeroSequencialRegistro(Integer numeroSequencialRegistro) {
        this.numeroSequencialRegistro = numeroSequencialRegistro;
    }

    public void setCampoAlterado(CampoAlterado campoAlterado) {
        this.campoAlterado = campoAlterado;
    }

    public Integer getIdentificacaoRegistroDetalhe() {
        return identificacaoRegistroDetalhe;
    }

    public String getTipoCobranca() {
        return tipoCobranca;
    }

    public String getTipoCarteira() {
        return tipoCarteira;
    }

    public String getTipoImpressao() {
        return tipoImpressao.value;
    }

    public String getFiller1() {
        return filler1;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public String getTipoDesconto() {
        return tipoDesconto.value;
    }

    public String getTipoJuros() {
        return tipoJuros.value;
    }

    public String getFiller2() {
        return filler2;
    }

    public String getNossoNumeroSicredi() {
        return nossoNumeroSicredi;
    }

    public String getFiller3() {
        return filler3;
    }

    public Calendar getDataInstrucao() {
        return dataInstrucao;
    }

    public String getPostagemTitulo() {
        return postagemTitulo.value;
    }

    public String getFiller4() {
        return filler4;
    }

    public String getEmissaoBloqueto() {
        return emissaoBloqueto.value;
    }

    public Integer getNumeroParcelaCarne() {
        return numeroParcelaCarne;
    }

    public Integer getNumeroTotalParcelasCarne() {
        return numeroTotalParcelasCarne;
    }

    public String getFiller5() {
        return filler5;
    }

    public BigDecimal getValorDescontoDia() {
        return valorDescontoDia;
    }

    public Double getMultaPagamentoAtraso() {
        return multaPagamentoAtraso;
    }

    public String getFiller6() {
        return filler6;
    }

    public Integer getInstrucao() {
        return instrucao.instrucao;
    }

    public String getSeuNumero() {
        return seuNumero;
    }

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public BigDecimal getValorTitulo() {
        return valorTitulo;
    }

    public String getFiller7() {
        return filler7;
    }

    public String getEspecieDocumento() {
        return especieDocumento.value;
    }

    public String getAceiteTitulo() {
        return aceiteTitulo.value;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public String getInstrucaoProtestoAutomatico() {
        return instrucaoProtestoAutomatico.value;
    }

    public Integer getNumeroDiasProtestoAutomatico() {
        return numeroDiasProtestoAutomatico;
    }

    public BigDecimal getValorJurosDiaAtraso() {
        return valorJurosDiaAtraso;
    }

    public Calendar getDataLimiteConcessaoDesconto() {
        return dataLimiteConcessaoDesconto;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public Integer getFiller8() {
        return filler8;
    }

    public BigDecimal getValorAbatimento() {
        return valorAbatimento;
    }

    public Integer getTipoPessoa() {
        return tipoPessoa.value;
    }

    public Integer getFiller9() {
        return filler9;
    }

    public String getCpfCnpjSacado() {
        return cpfCnpjSacado;
    }

    public String getNomeSacado() {
        return nomeSacado;
    }

    public String getEnderecoSacado() {
        return enderecoSacado;
    }

    public Integer getCodigoSacadoCooperativaCedente() {
        return codigoSacadoCooperativaCedente;
    }

    public Integer getFiller10() {
        return filler10;
    }

    public String getFiller11() {
        return filler11;
    }

    public String getCepSacado() {
        return cepSacado;
    }

    public Integer getCodigoSacadoJuntoCliente() {
        return codigoSacadoJuntoCliente;
    }

    public Integer getCpfCnpjSacadorAvalista() {
        return cpfCnpjSacadorAvalista;
    }

    public String getNomeSacadorAvalista() {
        return nomeSacadorAvalista;
    }

    public Integer getNumeroSequencialRegistro() {
        return numeroSequencialRegistro;
    }

    public String getCampoAlterado() {
        return campoAlterado.value;
    }

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
    
}
