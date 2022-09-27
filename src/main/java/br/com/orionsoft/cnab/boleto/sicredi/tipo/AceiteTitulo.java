package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public enum AceiteTitulo {
    SIM("S"),
    NAO("N");

    final String value;

    AceiteTitulo(String value) {
        this.value = value;
    }
}
