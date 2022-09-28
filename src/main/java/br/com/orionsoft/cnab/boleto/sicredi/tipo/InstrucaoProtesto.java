package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InstrucaoProtesto {
    NAO_PROTESTAR("00"),
    PROTESTAR_AUTO("06");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
