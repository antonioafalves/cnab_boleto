package br.com.orionsoft.cnab.boleto.sicoob.tipo;

public enum TipoInscricao {
    CPF(1),
    CNPJ(2);

    private Integer value;

    TipoInscricao(Integer value) {
        this.value = value;
    }
}
