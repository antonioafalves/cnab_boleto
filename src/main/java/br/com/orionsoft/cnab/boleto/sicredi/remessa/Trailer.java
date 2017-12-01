/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;

/**
 *
 * @author antonio
 */
@Registro
public class Trailer {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer identificacaoRegistroTrailer = 9;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer identificacaoArquivoRemessa = 1;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final Integer numeroSicredi = 748;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private String codigoCedente;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 384)
    private final String filler = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private Integer numeroSequencialRegistro;

    public Integer getIdentificacaoRegistroTrailer() {
        return identificacaoRegistroTrailer;
    }

    public Integer getIdentificacaoArquivoRemessa() {
        return identificacaoArquivoRemessa;
    }

    public Integer getNumeroSicredi() {
        return numeroSicredi;
    }

    public String getCodigoCedente() {
        return codigoCedente;
    }

    public String getFiller() {
        return filler;
    }

    public Integer getNumeroSequencialRegistro() {
        return numeroSequencialRegistro;
    }

    public void setCodigoCedente(String codigoCedente) {
        this.codigoCedente = codigoCedente;
    }

    public void setNumeroSequencialRegistro(Integer numeroSequencialRegistro) {
        this.numeroSequencialRegistro = numeroSequencialRegistro;
    }
    
}
