package br.com.orionsoft.cnab.boleto.sicoob.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CodigoMovimentoRemessa {
    ENTRADA_TITULO("01"),
    SOLICITACAO_BAIXA("02"),
    CONCESSAO_ABATIMENTO("04"),
    CANCELAMENTO_ABATIMENTO("05"),
    PRORROGACAO_VENCIMENTO("06"),
    PROTESTAR("09"),
    DESISTENCIA_PROTESTO_BAIXA_TITULO("10"),
    DESISTENCIA_PROTESTO_MANTER_CARTEIRA("11"),
    ALTERACAO_JUROS_MORA("12"),
    DISPENSAR_COBRANCA_JUROS_MORA("13"),
    ALTERACAO_VALOR_PERCENTUAL_MULTA("14"),
    DISPENSA_COBRANCA_MULTA("15"),
    PRAZO_LIMITE_RECEBIMENTO_ALTERAR("19"),
    PRAZO_LIMITE_RECEBIMENTO_DISPENSAR("20"),
    ALTERAR_DADOS_PAGADOR("23"),
    ALTERACOES_OUTROS_DADOS("31"),
    NEGATIVACAO_SEM_PROTESTO("45"),
    CANCELAR_EXCLUIR_NEGATIVACAO("46");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
