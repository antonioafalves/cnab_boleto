package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;

import java.time.LocalDate;

@Registro
public class Header {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final Integer codigoBanco = 756;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 4)
    private final Integer zeros1 = 0;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer registroHeader = 1;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String tipoOperacao = "R";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 7)
    private final Integer zeros2 = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 2)
    private final String brancos1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 4)
    private Integer numeroAgencia;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 7)
    private Integer codigoCobranca;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 11)
    private Integer numeroContaCorrente;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 30)
    private final String brancos2 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 30)
    private String nomeEmpresa;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 80)
    private final String brancos3 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 8)
    private Integer numeroRemessa;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate dataGravacao;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 11)
    private final Integer zeros3 = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 33)
    private final String filler = "";

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public Integer getCodigoCobranca() {
        return codigoCobranca;
    }

    public void setCodigoCobranca(Integer codigoCobranca) {
        this.codigoCobranca = codigoCobranca;
    }

    public Integer getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(Integer numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Integer getNumeroRemessa() {
        return numeroRemessa;
    }

    public void setNumeroRemessa(Integer numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    public LocalDate getDataGravacao() {
        return dataGravacao;
    }

    public void setDataGravacao(LocalDate dataGravacao) {
        this.dataGravacao = dataGravacao;
    }

    public Integer getCodigoBanco() {
        return codigoBanco;
    }

    public Integer getZeros1() {
        return zeros1;
    }

    public Integer getRegistroHeader() {
        return registroHeader;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public Integer getZeros2() {
        return zeros2;
    }

    public String getBrancos1() {
        return brancos1;
    }

    public String getBrancos2() {
        return brancos2;
    }

    public String getBrancos3() {
        return brancos3;
    }

    public Integer getZeros3() {
        return zeros3;
    }

    public String getFiller() {
        return filler;
    }
    
}
