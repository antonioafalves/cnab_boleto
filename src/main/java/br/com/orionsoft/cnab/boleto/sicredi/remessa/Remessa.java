package br.com.orionsoft.cnab.boleto.sicredi.remessa;

import br.com.orionsoft.cnab.core.Arquivo;

import java.util.ArrayList;
import java.util.List;

public class Remessa extends Arquivo {
    private Header header;
    private List<Detalhe> detalhes;
    private Trailer trailer;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<Detalhe> getDetalhes() {
        if (detalhes == null) {
            detalhes = new ArrayList<>();
        }
        return detalhes;
    }

    public void setDetalhes(List<Detalhe> detalhes) {
        this.detalhes = detalhes;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
    
}
