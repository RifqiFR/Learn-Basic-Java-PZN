package javaDasar;

public class KonversiNumber {
    public static void main(String[] args) {

        /* Konversi tipe data number
        #Widening Casting(Otomatis) : Byte -> Short -> int -> long -> float -> double
        #Narrowing Casting(Manual) : double -> float -> long -> int -> char -> short -> byte
        */

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;



    }
}
