/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author pasha
 */

public class genap4 {
    
    static class Balok {
        private int panjang;
        private int lebar;
        private int tinggi;

        public Balok() {
            this.panjang = 0;
            this.lebar = 0;
            this.tinggi = 0;
        }

        public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
            this.panjang = panjangBaru;
            this.lebar = lebarBaru;
            this.tinggi = tinggiBaru;
        }

        public int getLuas() {
            return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        }

        public int getKeliling() {
            return 4 * (panjang + lebar + tinggi);
        }

        public int getVolume() {
            return panjang * lebar * tinggi;
        }

        public int getPanjang() {
            return panjang;
        }

        public int getLebar() {
            return lebar;
        }

        public int getTinggi() {
            return tinggi;
        }

        public void setPanjang(int panjangBaru) {
            this.panjang = panjangBaru;
        }

        public void setLebar(int lebarBaru) {
            this.lebar = lebarBaru;
        }

        public void setTinggi(int tinggiBaru) {
            this.tinggi = tinggiBaru;
        }
    }

    public static void main(String[] args) {
        Balok balok1 = new Balok(1, 1, 1);
        Balok balok2 = new Balok(30, 40, 50);
        Balok balok3 = new Balok(25, 35, 45);

        System.out.println("Balok dgn panjang : " + balok1.getPanjang() + ", lebar : " + balok1.getLebar() + " dan tinggi : " + balok1.getTinggi() + ". Luasnya : " + balok1.getLuas() + ", sedangkan kelilingnya : " + balok1.getKeliling() + " dan volumenya : " + balok1.getVolume());
        System.out.println("Balok dgn panjang : " + balok2.getPanjang() + ", lebar : " + balok2.getLebar() + " dan tinggi : " + balok2.getTinggi() + ". Luasnya : " + balok2.getLuas() + ", sedangkan kelilingnya : " + balok2.getKeliling() + " dan volumenya : " + balok2.getVolume());
        System.out.println("Balok dgn panjang : " + balok3.getPanjang() + ", lebar : " + balok3.getLebar() + " dan tinggi : " + balok3.getTinggi() + ". Luasnya : " + balok3.getLuas() + ", sedangkan kelilingnya : " + balok3.getKeliling() + " dan volumenya : " + balok3.getVolume());
    }
}
