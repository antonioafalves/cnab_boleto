package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoInscricao {
    PESSOA_FISICA("1"),
    PESSOA_JURIDICA("2");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
