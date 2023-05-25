package model;

import java.io.Serializable;

public class Noveny implements Serializable{
    String id;
    String nev;
    int ar;
    int kor;

    public Noveny(String id, String nev, int ar, int kor) {
        this.id = id;
        this.nev = nev;
        this.ar = ar;
        this.kor = kor;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Noveny{" + "id=" + id + ", nev=" + nev + ", ar=" + ar + ", kor=" + kor + '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

    public int getKor() {
        return kor;
    }
    
}
