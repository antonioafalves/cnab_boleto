package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public enum Instrucao {
    CADASTRO_TITULO(1, 2, 3),
    PEDIDO_BAIXA(2, 9, 27),
    CONCESSAO_ABATIMENTO(4, 12, 32),
    CANCELAMENTO_ABATIMENTO_CONCEDIDO(5, 13, 32),
    ALTERACAO_VENCIMENTO(6, 14, 32),
    PEDIDO_PROTESTO(9, 19, 32),
    SUSTAR_PROTESTO_BAIXAR_TITULO(18, 20, 32),
    SUSTAR_PROTESTO_MANTER_CARTEIRA(19, 20, 32),
    ALTERACAO_OUTROS_DADOS(31, 33, 30);

    final Integer instrucao;
    final Integer confirmacao;
    final Integer rejeicao;

    Instrucao(Integer instrucao, Integer confirmacao, Integer rejeicao) {
        this.instrucao = instrucao;
        this.confirmacao = confirmacao;
        this.rejeicao = rejeicao;
    }
}
