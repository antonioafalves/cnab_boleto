package br.com.orionsoft.cnab.boleto.sicoob.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DistribuicaoBoleto {
    SICOOB_DISTRIBUI("1"),
    BENEFICIARIO_DISTRIBUI("2");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
