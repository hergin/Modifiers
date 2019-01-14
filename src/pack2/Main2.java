package pack2;

import pack1.Cat;

public class Main2 {

    public static void main(String[] args) {
        Cat c = new Cat("cotton");
        System.out.println("private name: "+c.privateName); // it is an error
        System.out.println("default name: "+c.defaultName); // it is an error
        System.out.println("public name: "+c.publicName);
        System.out.println("protected name: "+c.protectedName); // it is an error

        // following errors are still error even if I create a dog because the original locations of the attributes matter.
        Dog d = new Dog("rexx");
        System.out.println("private name: "+d.privateName); // it is an error
        System.out.println("default name: "+d.defaultName); // it is an error
        System.out.println("public name: "+d.publicName);
        System.out.println("protected name: "+d.protectedName); // it is an error
    }
}
