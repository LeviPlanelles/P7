package com.leviplanelles.P7.Ejercicio5;

public abstract class Documento {
    protected String url;

    public Documento(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
