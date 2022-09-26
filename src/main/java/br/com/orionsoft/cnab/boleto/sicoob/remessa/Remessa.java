package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.core.Arquivo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Remessa extends Arquivo {
    private HeaderArquivo headerArquivo;
    private HeaderLote headerLote;
    private List<SegmentoP> segmentosP;
    private List<SegmentoQ> segmentosQ;
    private List<SegmentoR> segmentosR;
    private List<SegmentoS> segmentosS;
    private TraillerLote traillerLote;
    private TraillerArquivo traillerArquivo;
}
