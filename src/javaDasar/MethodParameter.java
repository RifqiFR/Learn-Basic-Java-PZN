package javaDasar;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Rifqi", "Fajar");
        sayHello("Nadia", "Ayu");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+ firstName + " "+ lastName);
    }
}
