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
 * Deskripsi Program : program ini berisi untuk menampilkan hasil tegangan
 *                     dengan konsep object oriented
 */

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Baterai baterai = new Baterai();
        System.out.print("Kuat Arus : ");baterai.setKuatArus(sc.nextFloat());
        System.out.print("Hambatan  : ");baterai.setHambatan(sc.nextFloat());

        System.out.println();

        System.out.println("Kuat Arus : " + baterai.getKuatArus());
        System.out.println("Hambatan  : " + baterai.getHambatan());
        System.out.println("Hasil Tegangan : " + baterai.hitungTegangan());
    }
}