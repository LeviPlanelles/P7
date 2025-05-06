package com.leviplanelles.P7.Ejercicio5;

public class Img extends Documento{
    private int x;
    private int y;

    public Img(String url, int x, int y) {
        super(url);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
