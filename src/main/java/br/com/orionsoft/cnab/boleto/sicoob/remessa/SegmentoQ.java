/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;

/**
 *
 * @author antonio
 */
@Registro
public class SegmentoQ {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 7)
    private final Integer zeros1 = 0;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer registroDetalhe = 3;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private Integer numeroSequencialRegistroLote;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String codigoSegmentoRegistroDetalhe = "Q";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String brancos1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private SegmentoP.CodigoInstrucao codigoInstrucao;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private TipoInscricao tipoInscricaoPagador;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 14)
    private String numeroInscricaoPagador;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String nomePagador;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String endereco;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 15)
    private String bairro;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 5)
    private String cep;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 3)
    private String sufixoCep;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 15)
    private String cidade;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 2)
    private String unidadeFederacao;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private TipoInscricao tipoInscricaoSacador;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 14)
    private String numeroInscricaoSacador;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String nomeSacador;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 31)
    private final String filler = "";
    
    public enum TipoInscricao {
        CPF(1),
        CNPJ(2);
        
        private final Integer value;

        private TipoInscricao(Integer value) {
            this.value = value;
        }
    }

    public void setNumeroSequencialRegistroLote(Integer numeroSequencialRegistroLote) {
        this.numeroSequencialRegistroLote = numeroSequencialRegistroLote;
    }

    public void setCodigoInstrucao(SegmentoP.CodigoInstrucao codigoInstrucao) {
        this.codigoInstrucao = codigoInstrucao;
    }

    public void setTipoInscricaoPagador(TipoInscricao tipoInscricaoPagador) {
        this.tipoInscricaoPagador = tipoInscricaoPagador;
    }

    public void setNumeroInscricaoPagador(String numeroInscricaoPagador) {
        this.numeroInscricaoPagador = numeroInscricaoPagador;
    }

    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setSufixoCep(String sufixoCep) {
        this.sufixoCep = sufixoCep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUnidadeFederacao(String unidadeFederacao) {
        this.unidadeFederacao = unidadeFederacao;
    }

    public void setTipoInscricaoSacador(TipoInscricao tipoInscricaoSacador) {
        this.tipoInscricaoSacador = tipoInscricaoSacador;
    }

    public void setNumeroInscricaoSacador(String numeroInscricaoSacador) {
        this.numeroInscricaoSacador = numeroInscricaoSacador;
    }

    public void setNomeSacador(String nomeSacador) {
        this.nomeSacador = nomeSacador;
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

    public Integer getTipoInscricaoPagador() {
        return tipoInscricaoPagador.value;
    }

    public String getNumeroInscricaoPagador() {
        return numeroInscricaoPagador;
    }

    public String getNomePagador() {
        return nomePagador;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getSufixoCep() {
        return sufixoCep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUnidadeFederacao() {
        return unidadeFederacao;
    }

    public Integer getTipoInscricaoSacador() {
        return tipoInscricaoSacador.value;
    }

    public String getNumeroInscricaoSacador() {
        return numeroInscricaoSacador;
    }

    public String getNomeSacador() {
        return nomeSacador;
    }

    public String getFiller() {
        return filler;
    }
    
}
