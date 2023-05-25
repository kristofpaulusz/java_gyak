package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Kert{
    ArrayList<Noveny> novenyek = new ArrayList<>();

    public Kert() {
        hozzaad(new Noveny("aa01", "Tulipán", 1000, 2));
        hozzaad(new Noveny("aa02", "Mikulásvirág", 1000, 2));

        
    }

    public void hozzaad(Noveny ujNoveny) {
        this.novenyek.add(ujNoveny);
    }

    public void elad(String id) {
        boolean nincsmeg = true;
        while (nincsmeg) {            
            for (int i = 0; i < novenyek.size(); i++) {
                if (novenyek.get(i).getId() == id) {
                    novenyek.remove(i);
                    nincsmeg = false;
                }
            }
        }
    }

    public void kiir() {
        for (Noveny noveny : novenyek) {
            System.out.println(noveny.toString());
        }
    }

    public void frissit() {
        
        try {
            FileInputStream fIS = new FileInputStream("kert.bin");
            ObjectInputStream oIS = new ObjectInputStream(fIS);
            novenyek = (ArrayList<Noveny>) oIS.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Kert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

    public ArrayList<Noveny> getNovenyek() {
        return novenyek;
    }
    
    public void statisztika() {
        try {
            FileOutputStream fos = new FileOutputStream("kert.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(novenyek);
            fos.close();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kert.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Kert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
