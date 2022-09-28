package br.com.orionsoft.cnab.boleto.sicoob.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CodigoMulta {
    ISENTO("0"),
    VALOR_FIXO("1"),
    PERCENTUAL("2");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
