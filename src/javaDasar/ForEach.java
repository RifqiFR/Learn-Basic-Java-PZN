package javaDasar;

public class ForEach {
    public static void main(String[] args) {

        //Array dengan For Loop
        String[] names ={
          "Rifqi", "Fajar", "Ramdani", "Nadia", "Ayu", "Laksmidewi"
        };

        for (var i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }

        //array dengan for Each
        for(var name:names){
            System.out.println(name);
        }
    }
}
