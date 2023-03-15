package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Colet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String locDest;
    private String locExp;
    private Float valoare;

    public Colet() {
    }

    public Colet(int id, String locDest, String locExp, Float valoare) {
        this.id = id;
        this.locDest = locDest;
        this.locExp = locExp;
        this.valoare = valoare;
    }

    public Colet(String locDest, String locExp, Float valoare) {
        this.locDest = locDest;
        this.locExp = locExp;
        this.valoare = valoare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocDest() {
        return locDest;
    }

    public void setLocDest(String locDest) {
        this.locDest = locDest;
    }

    public String getLocExp() {
        return locExp;
    }

    public void setLocExp(String locExp) {
        this.locExp = locExp;
    }

    public Float getValoare() {
        return valoare;
    }

    public void setValoare(Float valoare) {
        this.valoare = valoare;
    }
}
