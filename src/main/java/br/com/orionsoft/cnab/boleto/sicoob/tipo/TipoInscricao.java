package br.com.orionsoft.cnab.boleto.sicoob.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoInscricao {
    CPF("1"),
    CNPJ("2");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
