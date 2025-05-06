package com.leviplanelles.P7.Ejercicio4;

public class Mob extends Elemento{
    protected int nivelEnergia;
    protected int vidas;
    protected int capacidadOfensiva;

    public Mob(int x, int y, int nivelEnergia, int vidas, int capacidadOfensiva) {
        super(x, y);
        this.nivelEnergia = nivelEnergia;
        this.vidas = vidas;
        this.capacidadOfensiva = capacidadOfensiva;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public int getVidas() {
        return vidas;
    }

    public int getCapacidadOfensiva() {
        return capacidadOfensiva;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setCapacidadOfensiva(int capacidadOfensiva) {
        this.capacidadOfensiva = capacidadOfensiva;
    }
}
