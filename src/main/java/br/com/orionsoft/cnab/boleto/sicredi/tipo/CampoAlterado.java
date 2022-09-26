package br.com.orionsoft.cnab.boleto.sicredi.tipo;

public enum CampoAlterado {
    NENHUM(" "),
    DESCONTO("A"),
    JUROS_DIA("B"),
    DESCONTO_DIA_ANTECIPACAO("C"),
    DATA_LIMITE_CONCESSAO_DESCONTO("D"),
    CANCELAMENTO_PROTESTO_AUTOMATICO("E"),
    CARTEIRA_COBRANCA("F");

    private final String value;

    CampoAlterado(String value) {
        this.value = value;
    }
}
