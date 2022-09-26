package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Registro
@Getter
@Setter
public class TraillerLote {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho =  3)
    private final String banco = "756";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho =  4)
    private Integer lote;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho =  1)
    private final String registro = "5";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho =  9)
    private final String cnab1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho =  6)
    private Integer quantidadeRegistro;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho =  6)
    private Integer qtdTituloCobrancaSimples;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho =  15)
    private BigDecimal valorTituloCobrancaSimples;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho =  6)
    private Integer qtdTituloCobrancaVinculada;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho =  15)
    private BigDecimal valorTituloCobrancaVinculada;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho =  6)
    private Integer qtdTituloCobrancaCaucionada;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho =  15)
    private BigDecimal valorTituloCobrancaCaucionada;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho =  6)
    private Integer qtdTituloCobrancaDescontada;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho =  15)
    private BigDecimal valorTituloCobrancaDescontada;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho =  8)
    private final String numeroAviso = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho =  117)
    private final String cnab2 = "";
}
