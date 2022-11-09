package oop;

public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Kiki", "Kediri");
        //person1.name = "Rifqi Fajar Ramdani";
        //person1.address = "Kediri";
        //person1.country = "Jepang"; -- Error karena final

        /*Person person2 = new Person();
        Person person3;
        person3 = new Person();*/

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

    }
}
