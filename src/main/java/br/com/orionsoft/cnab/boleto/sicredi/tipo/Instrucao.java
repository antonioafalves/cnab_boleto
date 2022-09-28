package br.com.orionsoft.cnab.boleto.sicredi.tipo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Instrucao {
    CADASTRO_TITULOS("01"),
    PEDIDO_BAIXA("02"),
    CONCESSAO_ABATIMENTO("04"),
    CANCELAMENTO_ABATIMENTO("05"),
    ALTERACAO_VENCIMENTO("06"),
    PEDIDO_PROTESTO("09"),
    SUSTAR_PROTESTO_BAIXAR_TITULO("18"),
    SUSTAR_PROTESTO_MANTER_CARTEIRA("19"),
    ALTERACAO_OUTROS_DADOS("31"),
    INCLUIR_NEGATIVACAO("45"),
    EXCLUIR_NEGATIVACAO_MANTER_CARTEIRA("75"),
    EXCLUIR_NEGATIVACAO_BAIXAR_TITULOS("76");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
    }
