package javaDasar;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        //Konversi data primitif
        int age =30;

        Integer ageObject = age;

        int ageAgain = ageObject;

        short iniShort = ageObject.shortValue();
        long iniLong2 = ageObject.longValue();
        float iniFloat = ageObject.floatValue();

        System.out.println(ageObject);
    }
}
