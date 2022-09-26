package br.com.orionsoft.cnab.boleto.sicredi.tipo;

public enum InstrucaoProtesto {
    NAO_PROTESTAR("00"),
    PROTESTAR_AUTO("06");

    private final String value;

    InstrucaoProtesto(String value) {
        this.value = value;
    }
}
