package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Identificador;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Getter;
import lombok.Setter;

@Registro
@Getter
@Setter
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
}
