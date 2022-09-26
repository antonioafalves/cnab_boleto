package br.com.orionsoft.cnab.boleto.sicoob.tipo;

public enum CodigoJurosMora {
    ISENTO("0"),
    VALOR_POR_DIA("1"),
    TAXA_MENSAL("2");

    private String value;

    CodigoJurosMora(String value) {
        this.value = value;
    }
}
