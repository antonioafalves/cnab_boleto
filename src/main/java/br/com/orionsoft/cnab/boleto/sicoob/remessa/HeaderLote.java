package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.TipoInscricao;
import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Registro
@Getter
@Setter
public class HeaderLote {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final String banco = "756";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 4)
    private Integer lote;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final String registro = "1";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String operacao = "R";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private final String servico = "01";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 2)
    private final String cnab1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final String layoutLote = "040";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String cnab2 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private TipoInscricao tipoInscricaoEmpresa;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 15)
    private String numeroInscricaoEmpresa;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 20)
    private final String convenio = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private String codigoAgencia;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private String dvAgencia;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 12)
    private String numeroConta;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private String dvConta;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String dv = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 30)
    private String nomeEmpresa;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private final String informacao1 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private final String informacao2 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 8)
    private Integer numeroRemessaRetorno;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate dataGravacao;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 8)
    private final String dataCredito = "00000000";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 33)
    private final String cnab = "";
}
