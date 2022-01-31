/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpl2;

import java.util.Scanner;
import static rpl2.Rpl2.rumus_luas_balok;

public class Rpl2 {

    private static String rumus_luas;

    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        int pi;

        salam();
        System.out.println("=================");
        System.out.println("Pilih Rumus");
        System.out.println("1.Rumus Segitiga");
        System.out.println("2.Rumus Lingkaran");
        System.out.println("3.Rumus Persegi");
        System.out.println("4.Rumus Persegi Panjang");
        System.out.println("5.Rumus Luas Balok");
        System.out.println("=================");
        System.out.print("Pilih :");
        pi = pilih.nextInt();
        if (pi == 1) {
            System.out.println("rumus segitiga :" + rumus_segitiga());

        } else if (pi == 2) {
            System.out.println("rumus limgkaran :" + rumus_lingkaran());

        } else if (pi == 3) {
            System.out.println("rumus persegi :" + rumus_persegi());

        } else if (pi == 4) {
            System.out.println("rumus persegi panjang :" + rumus_persegi_panjang());

        } else if (pi == 5) {
            System.out.println("rumus luas balok :" + rumus_luas_balok());
        

        } else {
            System.out.println("Maaf rumus tidak ada");
        }

    }

    public static void salam() {

        System.out.println("Selamat datang di rumus matematika");

    }

    public static String rumus_segitiga() {

        String rumus = "1/2*alas*tinggi";

        return rumus;
    }

    public static String rumus_lingkaran() {

        String rumus = "phi*r*r";

        return rumus;

    }

    public static String rumus_persegi() {

        String rumus = "s*s";

        return rumus;

    }

    public static String rumus_persegi_panjang() {

        String rumus = "p*l";

        return rumus;

    }

    public static String rumus_luas_balok() {

        String rumus = "p*l*T";

        return rumus;

    }
    
    
}
