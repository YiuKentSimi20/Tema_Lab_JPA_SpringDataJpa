package com.example.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="masini")
public class Masina {
    @Id
    //@Column(name = "nrInmatriculare")
    private String nrInmatriculare;
    //@Column(name = "marca")
    private String marca;
    //@Column(name = "anFabricatie")
    private int anFabricatie;
    //@Column(name = "culoare")
    private String culoare;
    //@Column(name = "nrKilometrii")
    private int nrKilometrii;

    public Masina() {}

    public Masina(String nrInmatriculare, String marca, int anFabricatie, String culoare, int nrKilometrii) {
        this.nrInmatriculare = nrInmatriculare;
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.culoare = culoare;
        this.nrKilometrii = nrKilometrii;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNrKilometrii() {
        return nrKilometrii;
    }

    public void setNrKilometrii(int nrKilometrii) {
        this.nrKilometrii = nrKilometrii;
    }

    @Override
    public String toString() {
        return nrInmatriculare + ", " + marca + ", " + anFabricatie + ", " + culoare + ", " + nrKilometrii;
    }
}
