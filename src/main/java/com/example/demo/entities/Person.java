package com.example.demo.entities;

public class Person
{
    private String navn;
    private String kode;
    public String roll;

    public Person(String navn, String kode)
    {
        this.navn = navn;
        this.kode = kode;
        this.roll = "bruger";
    }

    public Person(String navn, String kode, String roll)
    {
        this.navn = navn;
        this.kode = kode;
        this.roll = roll;
    }

    public String getRoll()
    {
        return roll;
    }

    public void setRoll(String roll)
    {
        this.roll = roll;
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


    @Override
    public String toString()
    {
        return "Person{" +
                "navn='" + navn + '\'' +
                ", kode='" + kode + '\'' +
                ", roll='" + roll + '\'' +
                '}';
    }
}
