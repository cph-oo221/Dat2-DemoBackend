package com.example.demo.entities;

import java.util.ArrayList;

public class Person
{
    private String navn;
    private String kode;
    private String roll;
    private ArrayList<String> emner = new ArrayList<>();

    public Person(String navn, String kode)
    {
        this.navn = navn;
        this.kode = kode;
        this.roll = "bruger";
        this.emner = emner;
    }

    public Person(String navn, String kode, String roll)
    {
        this.navn = navn;
        this.kode = kode;
        this.roll = roll;
        this.emner = emner;
    }

    public Person(String navn, String kode, String roll, ArrayList<String> emner)
    {
        this.navn = navn;
        this.kode = kode;
        this.roll = roll;
        this.emner = emner;
    }

    public ArrayList<String> getEmner()
    {
        return emner;
    }

    public void setEmner(ArrayList<String> emner)
    {
        this.emner = emner;
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
        return "Person: " +
                "| navn: " + navn +
                "| kode: " + kode +
                "| roll: " + roll +
                "| emner=" + emner + " |";
    }
}
