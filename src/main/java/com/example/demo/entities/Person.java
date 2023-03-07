package com.example.demo.entities;

public class Person
{
    private String navn;
    private String kode;

    public Person(String navn, String kode)
    {
        this.navn = navn;
        this.kode = kode;
    }

    public String getNavn()
    {
        return navn;
    }

    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    public String getKode()
    {
        return kode;
    }

    public void setKode(String kode)
    {
        this.kode = kode;
    }
}
