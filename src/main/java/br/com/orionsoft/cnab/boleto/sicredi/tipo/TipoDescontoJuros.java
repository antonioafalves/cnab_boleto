package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoDescontoJuros {
    VALOR("A"),
    PERCENTUAL("B");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
