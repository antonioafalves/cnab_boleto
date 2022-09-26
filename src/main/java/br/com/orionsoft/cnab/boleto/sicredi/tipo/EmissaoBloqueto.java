package br.com.orionsoft.cnab.boleto.sicredi.tipo;

public enum EmissaoBloqueto {
    SICREDI("A"),
    CEDENTE("B");

    private final String value;

    EmissaoBloqueto(String value) {
        this.value = value;
    }
}
