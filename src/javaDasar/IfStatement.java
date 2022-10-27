package javaDasar;

public class IfStatement {
    public static void main(String[] args) {

        var nilai = 50;
        var absen = 50;

        if(nilai >= 75 && absen >= 75){
            System.out.println("Nilai anda A");
        } else if (nilai >= 70 && absen >=70){
            System.out.println("Nilai anda B");
        } else if (nilai >= 65 && absen >=65) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 60 && absen >=60) {
            System.out.println("Nilai anda D");
        }else {
            System.out.println("Nilai anda E");
        }
    }
}
