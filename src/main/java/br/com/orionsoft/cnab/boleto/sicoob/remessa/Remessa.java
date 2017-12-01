/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionsoft.cnab.boleto.sicoob.remessa;

import br.com.orionsoft.cnab.core.Arquivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonio
 */
public class Remessa extends Arquivo {
    private Header header;
    private List<SegmentoP> segmentosP;
//    private List<SegmentoQ> segmentosQ;
    private Trailer trailer;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<SegmentoP> getSegmentosP() {
        if (segmentosP == null) {
            segmentosP = new ArrayList<>();
        }
        return segmentosP;
    }

//    public List<SegmentoQ> getSegmentosQ() {
//        if (segmentosQ == null) {
//            segmentosQ = new ArrayList<>();
//        }
//        return segmentosQ;
//    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
    
}
