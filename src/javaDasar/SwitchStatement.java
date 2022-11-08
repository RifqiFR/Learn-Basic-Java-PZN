package javaDasar;

public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "C";
        String ucapan;

        switch (nilai){
            case "A":
                System.out.println("Wow Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
        }

        //Switch Lambda
        switch (nilai){
            case "A" -> System.out.println("Wow Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin Anda salah jurusan");
            }
        }

        switch (nilai){
            case "A" -> ucapan = "Wow Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Anda lulus";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> {
                ucapan = "Mungkin Anda salah jurusan";
            }
        }
            System.out.println(ucapan);

        //yield mengembalikan nilai pada switch statement
        ucapan = switch (nilai){
            case "A" :
                yield "Wow Anda lulus dengan baik";
            case "B", "C" :
                yield "Anda lulus";
            case "D" :
                yield "Anda tidak lulus";
            default :
                yield  "Mungkin Anda salah jurusan";
        };

        System.out.println(ucapan);
    }
}
