package oop;

class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paraName, String paramAddress){
        name = paraName;
        address = paramAddress;
    }

    void sayHello(String paramName){
        System.out.println("Hello " +paramName+", My name is " + name);
    }
}
