package br.com.orionsoft.cnab.boleto.sicoob.tipo;

public enum CodigoMulta {
    ISENTO(0),
    VALOR_FIXO(1),
    PERCENTUAL(2);

    private Integer value;

    CodigoMulta(Integer value) {
        this.value = value;
    }
}
