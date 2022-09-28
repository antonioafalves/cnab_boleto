package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EmissaoBloqueto {
    SICREDI("A"),
    CEDENTE("B");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
