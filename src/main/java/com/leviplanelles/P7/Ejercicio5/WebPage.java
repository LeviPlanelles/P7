package com.leviplanelles.P7.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class WebPage extends Documento{
    private List<Documento> enlaces;

    public WebPage(String url) {
        super(url);
        this.enlaces = new ArrayList<>();
    }

    public void agregarEnlace(Documento documento) {
        enlaces.add(documento);
    }

    public List<Documento> getEnlaces() {
        return enlaces;
    }
}
