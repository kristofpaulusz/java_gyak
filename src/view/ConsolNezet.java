/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Kert;
import model.Noveny;

/**
 *
 * @author g
 */
public class ConsolNezet {
    public static void main(String[] args) {
        Kert kertem = new Kert();
        kertem.hozzaad(new Noveny("aa03", "Pitypang", 1200, 21));
        kertem.hozzaad(new Noveny("aa04", "Pitypang2", 1210, 12));
        kertem.elad("aa01");
        kertem.elad("aa04");
        kertem.kiir();
        kertem.statisztika();
        kertem = null;
        kertem = new Kert();
        System.out.println("");
        kertem.frissit();
        kertem.kiir();
    }
}
