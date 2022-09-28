package br.com.orionsoft.cnab.boleto.sicoob.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EspecieTitulo {
    NF_NOTA_FISCAL("23");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
