package br.com.orionsoft.cnab.boleto.sicoob.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EmissaoBoleto {
    SICOOB_EMITE("1"),
    BENEFICIARIO_EMITE("2");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
