package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.Arquivo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Remessa extends Arquivo {
    private Header header;
    private List<Detalhe> detalhes;
    private Trailer trailer;


    public List<Detalhe> getDetalhes() {
        if (detalhes == null) {
            detalhes = new ArrayList<>();
        }
        return detalhes;
    }
}
