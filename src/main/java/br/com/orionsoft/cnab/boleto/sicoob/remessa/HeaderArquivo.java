package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.TipoInscricao;
import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Registro
@Getter
@Setter
public class HeaderArquivo {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final Integer banco = 756;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 4)
    private final Integer lote = 0;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer registro = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 9)
    private final String cnab1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private TipoInscricao tipoInscricaoEmpresa;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 14)
    private String numeroInscricaoEmpresa;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 20)
    private final String convenio = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 5)
    private String codigoAgencia;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private String dvAgencia;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 12)
    private String numeroConta;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private String dvConta;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 30)
    private String nomeEmpresa;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 30)
    private final String nomeBanco = "SICOOB";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 10)
    private final String cnab2 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer codigoArquivo = 1;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate dataGeracaoArquivo;
    @Campo(formato = FormatoCampo.HORA)
    private LocalTime horaGeracaoArquivo;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 6)
    private Integer sequencialArquivo;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final Integer layoutArquivo = 81;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private final Integer densidade = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 20)
    private final String reservadoBanco = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 20)
    private final String reservadoEmpresa = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 29)
    private final String cnab3 = "";
}
