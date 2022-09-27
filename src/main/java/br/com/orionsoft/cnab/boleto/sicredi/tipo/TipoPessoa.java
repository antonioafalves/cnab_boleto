package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public enum TipoPessoa {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    final Integer value;

    TipoPessoa(Integer value) {
        this.value = value;
    }
}
