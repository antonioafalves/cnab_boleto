package br.com.orionsoft.cnab.boleto.sicoob.tipo;

public enum AceiteTitulo {
    ACEITE("A"),
    NAO_ACEITE("N");

    private String value;

    AceiteTitulo(String value) {
        this.value = value;
    }
}
