package latihan;

import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {
        //luasLingkaran();
        //luasSegitiga();
        //luasPersegiPanjang();
        volumeBalok();
    }

    static void luasLingkaran(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari -jari lingkaran : ");
        int r = scanner.nextInt();

        double phi = 3.14;
        double L = phi*(r*r);

        System.out.println(L);
    }

    static void luasSegitiga(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas   : ");
        int alas = scanner.nextInt();
        System.out.print("Masukkan tinggi : ");
        int tinggi = scanner.nextInt();

        double luas = alas * tinggi / 2;

        System.out.println(luas);
    }

    static void luasPersegiPanjang(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar : ");
        int lebar = scanner.nextInt();

        double luas = panjang * lebar;

        System.out.println(luas);
    }

    static void volumeBalok(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang   : ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar   : ");
        int lebar = scanner.nextInt();
        System.out.print("Masukkan tinggi : ");
        int tinggi = scanner.nextInt();

        double volume = panjang*lebar*tinggi;

        System.out.println(volume);
    }
}
