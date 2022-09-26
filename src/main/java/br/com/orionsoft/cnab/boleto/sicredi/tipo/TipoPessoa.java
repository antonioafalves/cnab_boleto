package br.com.orionsoft.cnab.boleto.sicredi.tipo;

public enum TipoPessoa {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private final Integer value;

    TipoPessoa(Integer value) {
        this.value = value;
    }
}
