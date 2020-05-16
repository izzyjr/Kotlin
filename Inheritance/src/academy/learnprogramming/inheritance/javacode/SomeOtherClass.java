package academy.learnprogramming.inheritance.javacode;

public class SomeOtherClass {

    public static void main(String[] args) {

        SomeClass.accessPrivateVar();

        int y = SomeClass.x;
        System.out.println(SomeClass.x);
        System.out.println("SomeClass - static variable: " + y);

    }

    public void someOtherMethod() {
        SomeClass.accessPrivateVar();
    }

}
