package br.com.orionsoft.cnab.boleto.sicredi.tipo;

public enum AceiteTitulo {
    SIM("S"),
    NAO("N");

    private final String value;

    AceiteTitulo(String value) {
        this.value = value;
    }
}
