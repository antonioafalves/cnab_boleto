package br.com.orionsoft.cnab.boleto.sicredi;

import br.com.orionsoft.cnab.boleto.sicredi.remessa.Detalhe;
import br.com.orionsoft.cnab.boleto.sicredi.remessa.Header;
import br.com.orionsoft.cnab.boleto.sicredi.remessa.Trailer;
import br.com.orionsoft.cnab.core.File;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Remessa extends File {
    private Header header;
    private List<Detalhe> detalhes = new ArrayList<>();
    private Trailer trailer;
}
