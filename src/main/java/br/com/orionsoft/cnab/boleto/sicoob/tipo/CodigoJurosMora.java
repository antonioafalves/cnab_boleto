package br.com.orionsoft.cnab.boleto.sicoob.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CodigoJurosMora {
    ISENTO("0"),
    VALOR_POR_DIA("1"),
    TAXA_MENSAL("2");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
