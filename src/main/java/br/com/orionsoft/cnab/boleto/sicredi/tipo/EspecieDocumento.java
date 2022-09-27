package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public enum EspecieDocumento {
    DUPLICATA_MERCANTIL_INDICACAO("A"),
    DUPLICATA_RURAL("B"),
    NOTA_PROMISSORIA("C"),
    NOTA_PROMISSORIA_RURAL("D"),
    NOTA_SEGUROS("E"),
    RECIBO("G"),
    LETRA_CAMBIO("H"),
    NOTA_DEBITO("I"),
    DUPLICATA_SERVICO_INDICACAO("J"),
    OUTROS("K");

    final String value;

    EspecieDocumento(String value) {
        this.value = value;
    }
}
