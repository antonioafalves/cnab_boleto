package br.com.orionsoft.cnab.boleto.sicoob.tipo;

public enum DistribuicaoBoleto {
    SICOOB_DISTRIBUI("1"),
    BENEFICIARIO_DISTRIBUI("2");

    private String value;

    DistribuicaoBoleto(String value) {
        this.value = value;
    }
}
