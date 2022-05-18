package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;

import java.math.BigDecimal;

@Registro
public class Trailer {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 7)
    private final Integer zeros1 = 0;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer registroTrailer = 5;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 9)
    private final String brancos = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private Integer quantidadeRegistros;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 17)
    private BigDecimal valorTotal;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private final Integer zeros2 = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 194)
    private final String filler = "";

    public Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    public void setQuantidadeRegistros(Integer quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getZeros1() {
        return zeros1;
    }

    public Integer getRegistroTrailer() {
        return registroTrailer;
    }

    public String getBrancos() {
        return brancos;
    }

    public Integer getZeros2() {
        return zeros2;
    }

    public String getFiller() {
        return filler;
    }
    
}
