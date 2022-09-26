package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.CodigoDesconto;
import br.com.orionsoft.cnab.boleto.sicoob.tipo.CodigoMovimentoRemessa;
import br.com.orionsoft.cnab.boleto.sicoob.tipo.CodigoMulta;
import br.com.orionsoft.cnab.core.FormatoCampo;
import br.com.orionsoft.cnab.core.annotation.Campo;
import br.com.orionsoft.cnab.core.annotation.Registro;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Registro
@Getter
@Setter
public class SegmentoR {
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final String banco = "756";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 4)
    private Integer lote;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer registro = 3;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private Integer numeroRegistro;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String segmento = "R";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String cnab1 = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 2)
    private CodigoMovimentoRemessa codigoMovimentoRemessa;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private CodigoDesconto codigoDesconto2;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate dataDesconto2;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorDesconto2;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private CodigoDesconto codigoDesconto3;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate dataDesconto3;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorDesconto3;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private CodigoMulta codigoMulta;
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate dataMulta;
    @Campo(formato = FormatoCampo.DECIMAL, tamanho = 13)
    private BigDecimal valorMulta;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 10)
    private final String informacaoAoPagador = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private final String informacao3 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 40)
    private final String informacao4 = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 20)
    private final String cnab2 = "";
    @Campo(formato = FormatoCampo.DATA_DDMMAAAA, tamanho = 8)
    private LocalDate dataLimitePagamento;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 3)
    private final Integer bancoDebito = 0;
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 5)
    private final Integer agenciaDebito = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String dvAgenciaDebito = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 12)
    private final Integer contaCorrenteDebito = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String dvContaCorrenteDebito = "";
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 1)
    private final String dv = "";
    @Campo(formato = FormatoCampo.NUMERICO, tamanho = 1)
    private final Integer avisoDebitoAutomatico = 0;
    @Campo(formato = FormatoCampo.ALFANUMERICO, tamanho = 9)
    private final String cnab3 = "";
}
