package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AceiteTitulo {
    SIM("S"),
    NAO("N");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
