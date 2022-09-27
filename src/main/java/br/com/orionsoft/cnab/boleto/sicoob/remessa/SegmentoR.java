package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.boleto.sicoob.tipo.CodigoDesconto;
import br.com.orionsoft.cnab.boleto.sicoob.tipo.CodigoMovimentoRemessa;
import br.com.orionsoft.cnab.boleto.sicoob.tipo.CodigoMulta;
import br.com.orionsoft.cnab.core.Pattern;
import br.com.orionsoft.cnab.core.annotation.Field;
import br.com.orionsoft.cnab.core.annotation.Record;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Record
@Getter
@Setter
public class SegmentoR {
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final String banco = "756";
    @Field(pattern = Pattern.NUMERIC, size = 4)
    private Integer lote;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer registro = 3;
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private Integer numeroRegistro;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String segmento = "R";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String cnab1 = "";
    @Field(pattern = Pattern.NUMERIC, size = 2)
    private CodigoMovimentoRemessa codigoMovimentoRemessa;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private CodigoDesconto codigoDesconto2;
    @Field(pattern = Pattern.DATE_DDMMAAAA, size = 8)
    private LocalDate dataDesconto2;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorDesconto2;
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private CodigoDesconto codigoDesconto3;
    @Field(pattern = Pattern.DATE_DDMMAAAA, size = 8)
    private LocalDate dataDesconto3;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorDesconto3;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private CodigoMulta codigoMulta;
    @Field(pattern = Pattern.DATE_DDMMAAAA, size = 8)
    private LocalDate dataMulta;
    @Field(pattern = Pattern.DECIMAL, size = 13)
    private BigDecimal valorMulta;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 10)
    private final String informacaoAoPagador = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private final String informacao3 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 40)
    private final String informacao4 = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 20)
    private final String cnab2 = "";
    @Field(pattern = Pattern.DATE_DDMMAAAA, size = 8)
    private LocalDate dataLimitePagamento;
    @Field(pattern = Pattern.NUMERIC, size = 3)
    private final Integer bancoDebito = 0;
    @Field(pattern = Pattern.NUMERIC, size = 5)
    private final Integer agenciaDebito = 0;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String dvAgenciaDebito = "";
    @Field(pattern = Pattern.NUMERIC, size = 12)
    private final Integer contaCorrenteDebito = 0;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String dvContaCorrenteDebito = "";
    @Field(pattern = Pattern.ALPHANUMERIC, size = 1)
    private final String dv = "";
    @Field(pattern = Pattern.NUMERIC, size = 1)
    private final Integer avisoDebitoAutomatico = 0;
    @Field(pattern = Pattern.ALPHANUMERIC, size = 9)
    private final String cnab3 = "";
}
