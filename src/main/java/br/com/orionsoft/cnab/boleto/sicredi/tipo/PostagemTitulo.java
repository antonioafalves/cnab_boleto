package br.com.orionsoft.cnab.boleto.sicredi.tipo;

public enum PostagemTitulo {
    SIM("S"),
    NAO("N");

    private final String value;

    PostagemTitulo(String value) {
        this.value = value;
    }
}
