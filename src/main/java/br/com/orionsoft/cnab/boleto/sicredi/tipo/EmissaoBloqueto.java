package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public enum EmissaoBloqueto {
    SICREDI("A"),
    CEDENTE("B");

    final String value;

    EmissaoBloqueto(String value) {
        this.value = value;
    }
}
