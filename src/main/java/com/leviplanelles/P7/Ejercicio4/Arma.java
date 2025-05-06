package com.leviplanelles.P7.Ejercicio4;

public class Arma extends ObjetoMovil{
    private int nivelEnergia;
    private int factorPotenciador;

    public Arma(int x, int y, int nivelEnergia, int factorPotenciador) {
        super(x, y);
        this.nivelEnergia = nivelEnergia;
        this.factorPotenciador = factorPotenciador;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public int getFactorPotenciador() {
        return factorPotenciador;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public void setFactorPotenciador(int factorPotenciador) {
        this.factorPotenciador = factorPotenciador;
    }
}
