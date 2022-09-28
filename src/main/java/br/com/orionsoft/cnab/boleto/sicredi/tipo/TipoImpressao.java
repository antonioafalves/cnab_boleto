package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoImpressao {
    NORMAL("A"),
    CARNE("B");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
