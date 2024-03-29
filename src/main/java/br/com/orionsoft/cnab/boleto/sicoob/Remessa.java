package br.com.orionsoft.cnab.boleto.sicoob;

import br.com.orionsoft.cnab.boleto.sicoob.remessa.*;
import br.com.orionsoft.cnab.core.File;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Remessa extends File {
    private HeaderArquivo headerArquivo;
    private HeaderLote headerLote;
    private List<SegmentoP> segmentosP = new ArrayList<>();
    private TraillerLote traillerLote;
    private TraillerArquivo traillerArquivo;
}
