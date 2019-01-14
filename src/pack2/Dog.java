package pack2;

import pack1.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        this.protectedName = name;
        this.publicName = name;
        this.defaultName = name; // this is an error
        this.privateName = name; // this is an error
    }

}
