package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Identificador;
import br.com.orionsoft.cnab.core.annotation.Registro;

@Registro
public class Mensagem {
    @Identificador
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer identificacaoRegistro = 2;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 11)
    private final String filler1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 9)
    private String nossoNumero;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 80)
    private String instrucao1;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 80)
    private String instrucao2;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 80)
    private String instrucao3;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 80)
    private String instrucao4;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 10)
    private String seuNumero;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 43)
    private final String filler2 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private Integer numeroSequencialRegistro;

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public void setInstrucao1(String instrucao1) {
        this.instrucao1 = instrucao1;
    }

    public void setInstrucao2(String instrucao2) {
        this.instrucao2 = instrucao2;
    }

    public void setInstrucao3(String instrucao3) {
        this.instrucao3 = instrucao3;
    }

    public void setInstrucao4(String instrucao4) {
        this.instrucao4 = instrucao4;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

    public void setNumeroSequencialRegistro(Integer numeroSequencialRegistro) {
        this.numeroSequencialRegistro = numeroSequencialRegistro;
    }

    public Integer getIdentificacaoRegistro() {
        return identificacaoRegistro;
    }

    public String getFiller1() {
        return filler1;
    }

    public String getNossoNumero() {
        return nossoNumero;
    }

    public String getInstrucao1() {
        return instrucao1;
    }

    public String getInstrucao2() {
        return instrucao2;
    }

    public String getInstrucao3() {
        return instrucao3;
    }

    public String getInstrucao4() {
        return instrucao4;
    }

    public String getSeuNumero() {
        return seuNumero;
    }

    public String getFiller2() {
        return filler2;
    }

    public Integer getNumeroSequencialRegistro() {
        return numeroSequencialRegistro;
    }
    
}
