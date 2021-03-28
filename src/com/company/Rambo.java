package com.company;

public class Rambo {
    private Senjata senjata; //pengEnkapsulasi ,senjata = private

    //Supaya bisa di akses kelas lain ,Dibuatlah method getter setter di bawah ini
    public Senjata getSenjata() {
        return senjata;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
//end

    //fungsi menembak
    public void Menembak() {
        senjata.tembak();

    }
}
