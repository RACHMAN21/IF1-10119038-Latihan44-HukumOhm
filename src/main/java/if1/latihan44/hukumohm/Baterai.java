/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan44.hukumohm;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class Baterai
 * 
 */

public class Baterai {
    private float kuatArus;
    private float hambatan;

    public Baterai() {
        System.out.println("-----Hukum Ohm-----");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar akan\n" +
                           "berbanding lurus dengan benda potensial pada ujung-ujung\n" +
                           "kawat penghantar tersebut asalkan suhu kawat dijaga konstan");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public void setKuatArus(float kuatArus) {
        this.kuatArus = kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public void setHambatan(float hambatan) {
        this.hambatan = hambatan;
    }

    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
}