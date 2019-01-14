package pack1;

public class Animal {

    public String publicName;
    private String privateName;
    protected String protectedName;
    String defaultName; // this is package

    public Animal() {

    }

    public Animal(String name) {
        this.publicName = name;
        this.privateName = name;
        this.protectedName = name;
        this.defaultName = name;
    }

}
