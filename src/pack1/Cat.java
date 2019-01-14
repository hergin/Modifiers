package pack1;

public class Cat extends Animal {

    public Cat(String name) {
        this.defaultName = name;
        this.protectedName = name;
        this.publicName = name;
        this.privateName = name; // this is an error
    }

}
