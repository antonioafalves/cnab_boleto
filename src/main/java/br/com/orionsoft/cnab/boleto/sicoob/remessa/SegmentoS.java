package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.CodigoMovimentoRemessa;
import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Getter;
import lombok.Setter;

@Registro
@Getter
@Setter
public class SegmentoS {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final String banco = "756";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 4)
    private Integer lote;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer registro = 3;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private Integer numeroRegistro;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String segmento = "S";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String cnab1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private CodigoMovimentoRemessa codigoMovimentoRemessa;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer tipoImpressao = 3;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String informacao5;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String informacao6;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String informacao7;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String informacao8;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String informacao9;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 22)
    private final String cnab2 = "";
}
