package com.leviplanelles.P7.Ejercicio4;

public class Personaje extends Mob {
    private final ObjetoMovil[] mochila;

    public Personaje(int x, int y, int nivelEnergia, int vidas, int capacidadOfensiva) {
        super(x, y, nivelEnergia, vidas, capacidadOfensiva);
        this.mochila = new ObjetoMovil[3];
    }

    public boolean addObjectToBag(ObjetoMovil objetoMovil) {
        for (int i = 0; i < mochila.length; i++) {
            if (mochila[i] == null) {
                mochila[i] = objetoMovil;
                return true;
            }
        }
        return false;
    }

    public ObjetoMovil[] getMochila() {
        return mochila;
    }


}
