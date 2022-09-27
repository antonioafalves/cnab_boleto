package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public enum PostagemTitulo {
    SIM("S"),
    NAO("N");

    final String value;

    PostagemTitulo(String value) {
        this.value = value;
    }
}
