package com.company.Biblioteca;

public class Biblioteca {
    final String nume="Biblioteca Proiect";
    private Adresa adresa;

    private Biblioteca(Adresa adresa){
        this.adresa=adresa;
    }

    public Adresa getAdresa()
    {
        return adresa;
    }
}
