package br.com.orionsoft.cnab.boleto.sicoob.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CodigoProtesto {
    PROTESTAR_DIAS_CORRIDOS("1"),
    NAO_PROTESTAR("3"),
    CANCELAMENTO_INSTRUCAO_PROTESTO("9");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
