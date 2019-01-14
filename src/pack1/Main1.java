package pack1;

public class Main1 {

     public static void main(String[] args) {
         Cat c = new Cat("cotton");
         System.out.println("private name: "+c.privateName); // it is an error
         System.out.println("default name: "+c.defaultName); // this is visible because Main1 is in the same package with Animal (not because of Cat)
         System.out.println("public name: "+c.publicName);
         System.out.println("protected name: "+c.protectedName); // only this one's not being error is surprising, obviously protected has package meaning in it in JAVA, in C#, it doesn't.
     }

}
