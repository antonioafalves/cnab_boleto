package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public enum InstrucaoProtesto {
    NAO_PROTESTAR("00"),
    PROTESTAR_AUTO("06");

    final String value;

    InstrucaoProtesto(String value) {
        this.value = value;
    }
}
