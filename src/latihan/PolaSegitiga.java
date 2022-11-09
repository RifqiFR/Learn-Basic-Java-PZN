package latihan;

public class PolaSegitiga {
    public static void main(String[] args) {
        //polaSegitiga1(5);
        //polaSegitiga2(5);
        //polaSegitiga3(5);
        polaSegitiga4(5);

    }

    static void polaSegitiga1(int a){
        for(int b = 1; b<=a; b++){
            System.out.println("*");
        }
    }

    static void polaSegitiga2(int a){
        for (int b = 1; b <= a; b++){
            for (int c = 1; c <= b; c++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void polaSegitiga3(int a){
        for(int b =1; b<= a;b++){
            for (int c =4; c>=b; c--){
                System.out.print(" ");
            }
            for (int d =1; d<=b;d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void polaSegitiga4(int a){
        for(int b=1; b<=a; b++){
            for (int c=4; c>=b; c--){
                System.out.print(" ");
            }
            for (int d=1; d<=b; d++){
                System.out.print("*");
            }
            for (int e=1; e <= b-1; e++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
