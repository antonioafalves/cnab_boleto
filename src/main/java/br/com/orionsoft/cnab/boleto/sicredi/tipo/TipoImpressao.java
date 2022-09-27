package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public enum TipoImpressao {
    NORMAL("A"),
    CARNE("B");

    final String value;

    TipoImpressao(String value) {
        this.value = value;
    }
}
