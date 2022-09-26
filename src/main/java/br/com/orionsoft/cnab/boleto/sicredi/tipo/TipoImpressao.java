package br.com.orionsoft.cnab.boleto.sicredi.tipo;

public enum TipoImpressao {
    NORMAL("A"),
    CARNE("B");

    private final String value;

    TipoImpressao(String value) {
        this.value = value;
    }
}
