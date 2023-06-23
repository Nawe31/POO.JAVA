package Entidades;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> maso;
    private ArrayList<Carta> monton;

    public Baraja() {
        System.out.println(" se creo una baraja");
    }

    public Baraja(ArrayList<Carta> maso) {
        this.maso = maso;
    }

    public Baraja(ArrayList<Carta> maso, ArrayList<Carta> monton) {
        System.out.println(" se creo una baraja");
        this.maso = maso;
        this.monton = monton;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    public ArrayList<Carta> getMaso() {
        return maso;
    }

    public void setMaso(ArrayList<Carta> maso) {
        this.maso = maso;
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "maso=" + maso +
                '}';
    }
}
