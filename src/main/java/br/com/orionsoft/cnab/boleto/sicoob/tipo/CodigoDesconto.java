package br.com.orionsoft.cnab.boleto.sicoob.tipo;

public enum CodigoDesconto {
    NAO_CONCEDER_DESCONTO(0),
    VALOR_FIXO_ATE_DATA_INFORMADA(1),
    PERCENTUAL_ATE_DATA_INFORMADA(2);

    private Integer value;

    CodigoDesconto(Integer value) {
        this.value = value;
    }
}
