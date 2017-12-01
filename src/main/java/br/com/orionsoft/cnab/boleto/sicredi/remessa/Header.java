/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import java.time.LocalDate;

/**
 *
 * @author antonio
 */
@Registro
public class Header {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer identificacaoRegistro = 0;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer identificacaoArquivoRemessa = 1;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 7)
    private final String literalRemessa = "REMESSA";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private final Integer codigoServicoCobranca = 1;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 15)
    private final String literalCobranca = "COBRANCA";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private String codigoCedente;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 14)
    private String cnpj;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 31)
    private final String filler1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final Integer numeroSicredi = 748;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 15)
    private final String literalSicredi = "SICREDI";
    @Campo(formato = FormatoCampo.DATA_AAAAMMDD, tamanho = 8)
    private LocalDate dataGravacaoArquivo;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 8)
    private final String filler2 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 7)
    private Integer numeroRemessa;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 273)
    private final String filler3 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 4)
    private final String versaoSistema = "2.00";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private Integer numeroSequencialRegistro;

    public Integer getIdentificacaoRegistro() {
        return identificacaoRegistro;
    }

    public Integer getIdentificacaoArquivoRemessa() {
        return identificacaoArquivoRemessa;
    }

    public String getLiteralRemessa() {
        return literalRemessa;
    }

    public Integer getCodigoServicoCobranca() {
        return codigoServicoCobranca;
    }

    public String getLiteralCobranca() {
        return literalCobranca;
    }

    public String getCodigoCedente() {
        return codigoCedente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getFiller1() {
        return filler1;
    }

    public Integer getNumeroSicredi() {
        return numeroSicredi;
    }

    public String getLiteralSicredi() {
        return literalSicredi;
    }

    public LocalDate getDataGravacaoArquivo() {
        return dataGravacaoArquivo;
    }

    public String getFiller2() {
        return filler2;
    }

    public Integer getNumeroRemessa() {
        return numeroRemessa;
    }

    public String getFiller3() {
        return filler3;
    }

    public String getVersaoSistema() {
        return versaoSistema;
    }

    public Integer getNumeroSequencialRegistro() {
        return numeroSequencialRegistro;
    }

    public void setCodigoCedente(String codigoCedente) {
        this.codigoCedente = codigoCedente;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setDataGravacaoArquivo(LocalDate dataGravacaoArquivo) {
        this.dataGravacaoArquivo = dataGravacaoArquivo;
    }

    public void setNumeroRemessa(Integer numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    public void setNumeroSequencialRegistro(Integer numeroSequencialRegistro) {
        this.numeroSequencialRegistro = numeroSequencialRegistro;
    }
    
}
