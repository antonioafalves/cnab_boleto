package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Registro
@Getter
@Setter
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
}
