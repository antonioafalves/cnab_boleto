package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import br.com.orionsoft.cnab.core.annotation.SubRegistro;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Registro
public class SegmentoP {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 7)
    private final Integer zeros1 = 0;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer registroDetalhe = 3;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private Integer numeroSequencialRegistroLote;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String codigoSegmentoRegistroDetalhe = "P";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String brancos1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private CodigoInstrucao codigoInstrucao;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 23)
    private final String brancos2 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 17)
    private String nossoNumero;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer codigoCarteira = 9;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private TipoDocumento tipoDocumento;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private IdentificacaoEmissaoBloqueto identificacaoEmissaoBloqueto;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String brancos3 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 15)
    private String numeroDocumentoCobranca;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private Calendar dataVencimentoTitulo;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 15)
    private BigDecimal valorDocumento;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private final Integer zeros2 = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private IdentificacaoTituloAceite identificacaoTituloAceite;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 2)
    private final String brancos4 = "";
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private Calendar dataEmissaoTitulo;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private TipoMora tipoMora;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 15)
    private BigDecimal valorJurosMora;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 9)
    private final Integer zeros3 = 0;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private Calendar dataLimiteDesconto;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 15)
    private BigDecimal valorDesconto;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 15)
    private final String filler = "";
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 15)
    private BigDecimal valorAbatimento;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 25)
    private String controleBeneficiario;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private ProtestoAutomatico protestoAutomatico;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private Integer numeroDiasProtesto;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 4)
    private final Integer zeros4 = 0;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private final Integer codigoMoeda = 9;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 10)
    private Integer numeroControleOperacaoCredito;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer zero5 = 0;
    
    @SubRegistro
    private List<SegmentoQ> segmentosQ;
    
    public enum ProtestoAutomatico {
        NAO(0),
        SIM(1);
        
        private final Integer value;

        private ProtestoAutomatico(Integer value) {
            this.value = value;
        }
    }
  
    public enum TipoMora {
        ISENTO(1),
        VALOR(2),
        PORCENTAGEM(3);
        
        private final Integer value;

        private TipoMora(Integer value) {
            this.value = value;
        }
    }
    
    public enum CodigoInstrucao {
        ENTRADA_TITULOS(1),
        PEDIDO_BAIXA(2),
        CONCESSAO_ABATIMENTO(4),
        CANCELAMENTO_ABATIMENTO(5),
        ALTERACAO_VENCIMENTO(6),
        CONCESSAO_DESCONTO(7),
        CANCELAMENTO_DESCONTO(8),
        PROTESTAR(9),
        CANCELA_SUSTACAO_INSTRUCAO_PROTESTO(10),
        ALTERACAO_OUTROS_DADOS(31);
        
        public final Integer value;

        private CodigoInstrucao(Integer value) {
            this.value = value;
        }
    }
    
    /**
     * @author Antonio Alves
     * @version 1.0
     * DM Duplicata Mercantil
     */
    public enum TipoDocumento {
        DM(2),
        DS(4),
        LC(7),
        NP(12),
        RC(17),
        ND(19),
        NS(20),
        OUTROS(99);
        
        private final Integer value;

        private TipoDocumento(Integer value) {
            this.value = value;
        }
        
    }
    
    public enum IdentificacaoEmissaoBloqueto {
        BANCO_EMITE(1),
        BENEFICIARIO_EMITE(2);
        
        private final Integer value;
        
        private IdentificacaoEmissaoBloqueto(Integer value) {
            this.value = value;
        }
    }
    
    public enum IdentificacaoTituloAceite {
        ACEITE("A"),
        NAO_ACEITE("N");
        
        private final String value;

        private IdentificacaoTituloAceite(String value) {
            this.value = value;
        }
    }

    public List<SegmentoQ> getSegmentosQ() {
        if (segmentosQ == null) {
            segmentosQ = new ArrayList<>();
        }
        return segmentosQ;
    }

    public void setNumeroSequencialRegistroLote(Integer numeroSequencialRegistroLote) {
        this.numeroSequencialRegistroLote = numeroSequencialRegistroLote;
    }

    public void setCodigoInstrucao(CodigoInstrucao codigoInstrucao) {
        this.codigoInstrucao = codigoInstrucao;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setIdentificacaoEmissaoBloqueto(IdentificacaoEmissaoBloqueto identificacaoEmissaoBloqueto) {
        this.identificacaoEmissaoBloqueto = identificacaoEmissaoBloqueto;
    }

    public void setNumeroDocumentoCobranca(String numeroDocumentoCobranca) {
        this.numeroDocumentoCobranca = numeroDocumentoCobranca;
    }

    public void setDataVencimentoTitulo(Calendar dataVencimentoTitulo) {
        this.dataVencimentoTitulo = dataVencimentoTitulo;
    }

    public void setValorDocumento(BigDecimal valorDocumento) {
        this.valorDocumento = valorDocumento;
    }

    public void setIdentificacaoTituloAceite(IdentificacaoTituloAceite identificacaoTituloAceite) {
        this.identificacaoTituloAceite = identificacaoTituloAceite;
    }

    public void setDataEmissaoTitulo(Calendar dataEmissaoTitulo) {
        this.dataEmissaoTitulo = dataEmissaoTitulo;
    }

    public void setTipoMora(TipoMora tipoMora) {
        this.tipoMora = tipoMora;
    }

    public void setValorJurosMora(BigDecimal valorJurosMora) {
        this.valorJurosMora = valorJurosMora;
    }

    public void setDataLimiteDesconto(Calendar dataLimiteDesconto) {
        this.dataLimiteDesconto = dataLimiteDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setValorAbatimento(BigDecimal valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    public void setControleBeneficiario(String controleBeneficiario) {
        this.controleBeneficiario = controleBeneficiario;
    }

    public void setProtestoAutomatico(ProtestoAutomatico protestoAutomatico) {
        this.protestoAutomatico = protestoAutomatico;
    }

    public void setNumeroDiasProtesto(Integer numeroDiasProtesto) {
        this.numeroDiasProtesto = numeroDiasProtesto;
    }

    public void setNumeroControleOperacaoCredito(Integer numeroControleOperacaoCredito) {
        this.numeroControleOperacaoCredito = numeroControleOperacaoCredito;
    }

    public Integer getZeros1() {
        return zeros1;
    }

    public Integer getRegistroDetalhe() {
        return registroDetalhe;
    }

    public Integer getNumeroSequencialRegistroLote() {
        return numeroSequencialRegistroLote;
    }

    public String getCodigoSegmentoRegistroDetalhe() {
        return codigoSegmentoRegistroDetalhe;
    }

    public String getBrancos1() {
        return brancos1;
    }

    public Integer getCodigoInstrucao() {
        return codigoInstrucao.value;
    }

    public String getBrancos2() {
        return brancos2;
    }

    public String getNossoNumero() {
        return nossoNumero;
    }

    public Integer getCodigoCarteira() {
        return codigoCarteira;
    }

    public Integer getTipoDocumento() {
        return tipoDocumento.value;
    }

    public Integer getIdentificacaoEmissaoBloqueto() {
        return identificacaoEmissaoBloqueto.value;
    }

    public String getBrancos3() {
        return brancos3;
    }

    public String getNumeroDocumentoCobranca() {
        return numeroDocumentoCobranca;
    }

    public Calendar getDataVencimentoTitulo() {
        return dataVencimentoTitulo;
    }

    public BigDecimal getValorDocumento() {
        return valorDocumento;
    }

    public Integer getZeros2() {
        return zeros2;
    }

    public String getIdentificacaoTituloAceite() {
        return identificacaoTituloAceite.value;
    }

    public String getBrancos4() {
        return brancos4;
    }

    public Calendar getDataEmissaoTitulo() {
        return dataEmissaoTitulo;
    }

    public Integer getTipoMora() {
        return tipoMora.value;
    }

    public BigDecimal getValorJurosMora() {
        return valorJurosMora;
    }

    public Integer getZeros3() {
        return zeros3;
    }

    public Calendar getDataLimiteDesconto() {
        return dataLimiteDesconto;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public String getFiller() {
        return filler;
    }

    public BigDecimal getValorAbatimento() {
        return valorAbatimento;
    }

    public String getControleBeneficiario() {
        return controleBeneficiario;
    }

    public Integer getProtestoAutomatico() {
        return protestoAutomatico.value;
    }

    public Integer getNumeroDiasProtesto() {
        return numeroDiasProtesto;
    }

    public Integer getZeros4() {
        return zeros4;
    }

    public Integer getCodigoMoeda() {
        return codigoMoeda;
    }

    public Integer getNumeroControleOperacaoCredito() {
        return numeroControleOperacaoCredito;
    }

    public Integer getZero5() {
        return zero5;
    }
    
}
