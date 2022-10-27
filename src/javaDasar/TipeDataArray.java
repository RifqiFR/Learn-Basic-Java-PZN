package javaDasar;

public class TipeDataArray {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "Rifqi";
        arrayString[1] = "Fajar";
        arrayString[2] = "Ramdani";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        int[] arrayInt = new int[]{
                1,2,3,4,5,6
        };

        String[] arrayNama = {
                "Rifqi", "Fajar", "Ramdani"
        };

        System.out.println(arrayNama[0]);
        System.out.println(arrayNama.length);

        //array di dalam array
        String[][] members ={
                {"Rifqi", "Fajar"},
                {"Nadia", "Ayu"},
                {"Rafanza"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }
}
