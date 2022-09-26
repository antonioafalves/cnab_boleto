package br.com.orionsoft.cnab.boleto.sicredi.tipo;

public enum TipoDescontoJuros {
    VALOR("A"),
    PERCENTUAL("B");

    private final String value;

    TipoDescontoJuros(String value) {
        this.value = value;
    }
}
