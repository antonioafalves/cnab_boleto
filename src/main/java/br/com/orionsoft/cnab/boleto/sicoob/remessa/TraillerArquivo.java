package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Getter;
import lombok.Setter;

@Registro
@Getter
@Setter
public class TraillerArquivo {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final String banco = "756";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 4)
    private final String lote = "9999";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final String registro = "9";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 9)
    private final String cnab1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private Integer quantidadeLotes;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private Integer quantidadeRegistros;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private Integer quantidadeContas;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 205)
    private final String cnab2 = "";
}
