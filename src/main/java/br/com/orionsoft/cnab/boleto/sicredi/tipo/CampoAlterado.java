package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public enum CampoAlterado {
    NENHUM(" "),
    DESCONTO("A"),
    JUROS_DIA("B"),
    DESCONTO_DIA_ANTECIPACAO("C"),
    DATA_LIMITE_CONCESSAO_DESCONTO("D"),
    CANCELAMENTO_PROTESTO_AUTOMATICO("E"),
    CARTEIRA_COBRANCA("F");

    final String value;

    CampoAlterado(String value) {
        this.value = value;
    }
}
