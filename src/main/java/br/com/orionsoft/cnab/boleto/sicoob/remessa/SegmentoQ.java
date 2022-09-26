package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.CodigoMovimentoRemessa;
import br.com.orionsoft.cnab.boleto.sicoob.tipo.TipoInscricao;
import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Getter;
import lombok.Setter;

@Registro
@Getter
@Setter
public class SegmentoQ {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final String banco = "756";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 4)
    private Integer lote;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer registro = 3;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private Integer numeroRegistro;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String segmento = "Q";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String cnab1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private CodigoMovimentoRemessa codigoMovimentoRemessa;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private TipoInscricao tipoInscricaoPagador;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 15)
    private String numeroInscricaoPagador;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String nomePagador;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String enderecoPagador;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 15)
    private String bairroPagador;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private String cepPagador;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private String sufixoCepPagador;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 15)
    private String cidadePagador;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 2)
    private String ufPagador;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private TipoInscricao tipoInscricaoSacadorAvalista;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 15)
    private String numeroInscricaoSacadorAvalista;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private String nomeSacadorAvalista;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final String codigoBancoCorrespondente = "000";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 20)
    private final String nossoNumeroBancoCorrespondente = "000";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 8)
    private final String cnab2 = "";
}
