package com.leviplanelles.P7.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class WebSite {
    private String nombre;
    private String dominio;
    private List<Documento> documentos;

    public WebSite(String nombre, String dominio) {
        this.nombre = nombre;
        this.dominio = dominio;
        this.documentos = new ArrayList<>();
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
}
