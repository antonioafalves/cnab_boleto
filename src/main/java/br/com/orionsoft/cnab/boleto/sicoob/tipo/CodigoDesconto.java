package br.com.orionsoft.cnab.boleto.sicoob.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CodigoDesconto {
    NAO_CONCEDER_DESCONTO("0"),
    VALOR_FIXO_ATE_DATA_INFORMADA("1"),
    PERCENTUAL_ATE_DATA_INFORMADA("2");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
