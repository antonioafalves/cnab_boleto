package br.com.orionsoft.cnab.boleto.sicoob.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AceiteTitulo {
    ACEITE("A"),
    NAO_ACEITE("N");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
