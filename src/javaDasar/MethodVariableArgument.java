package javaDasar;

public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80,80,80,80,80};
        sayCongrats("kiki",values);

        sayCongrats("Nadia", 80,90,75,80);
    }
    //tanpa variable argument
    /*static void sayCongrats(String name, int[] values){

        int total = 0;
        for(var value:values){
            total+=value;
        }
        int finalValue = total/values.length;

        if(finalValue >= 75){
            System.out.println("Selamat "+ name +", Anda Lulus");
        }else{
            System.out.println("Maaf "+ name +", Anda Lulus");
        }
    }*/

    //dengan variable arguments
    static void sayCongrats(String name, int... values){

        int total = 0;
        for(var value:values){
            total+=value;
        }
        int finalValue = total/values.length;

        if(finalValue >= 75){
            System.out.println("Selamat "+ name +", Anda Lulus");
        }else{
            System.out.println("Maaf "+ name +", Anda Lulus");
        }
    }
}
