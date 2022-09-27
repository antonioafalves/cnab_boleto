package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public enum TipoDescontoJuros {
    VALOR("A"),
    PERCENTUAL("B");

    final String value;

    TipoDescontoJuros(String value) {
        this.value = value;
    }
}
