package latihan;

import java.util.Scanner;

public class MagicPrime {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int start = 100;

        for(int i=1; i <= input; i++){
            boolean belumPrima = true;
            while(belumPrima){
                int bilCek = start;
                if (prima(bilCek)){
                    if(prima(bilCek%100)){
                        bilCek = bilCek%100;
                        if(prima(bilCek%10)){
                            System.out.println("#"+i+" Number => "+start);
                            belumPrima = false;
                        }
                    }
                }
                start++;
            }
        }
    }

    static boolean prima(int bil){
    int cek =0;
        for (int i=2; i<=bil; i++){
            if (bil%i==0){
                cek++;
            }
        }

        if (cek==1){
            return true;
        }else {
            return false;
        }
    }
}


