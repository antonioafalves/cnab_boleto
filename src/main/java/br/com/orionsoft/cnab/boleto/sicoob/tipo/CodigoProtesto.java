package br.com.orionsoft.cnab.boleto.sicoob.tipo;

public enum CodigoProtesto {
    PROTESTAR_DIAS_CORRIDOS(1),
    NAO_PROTESTAR_NAO_NEGATIVAR(3),
    NEGATIVACAO_SEM_PROTESTO(8),
    CANCELAMENTO_PROTESTO_NEGATIVACAO_AUTOMATICA(9);

    private Integer value;

    CodigoProtesto(Integer value) {
        this.value = value;
    }
}
