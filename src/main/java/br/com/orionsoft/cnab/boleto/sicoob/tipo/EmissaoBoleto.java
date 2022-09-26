package br.com.orionsoft.cnab.boleto.sicoob.tipo;

public enum EmissaoBoleto {
    SICOOB_EMITE("1"),
    BENEFICIARIO_EMITE("2");

    private String value;

    EmissaoBoleto(String value) {
        this.value = value;
    }
}
